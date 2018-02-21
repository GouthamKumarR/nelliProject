package com.goutham.nelli.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.goutham.nelliBackend.dao.CategoryDao;
import com.goutham.nelliBackend.dao.CitiesDao;
import com.goutham.nelliBackend.dao.ClientDao;
import com.goutham.nelliBackend.dao.OffersDao;
import com.goutham.nelliBackend.dao.S3Services;
import com.goutham.nelliBackend.dto.Category;
import com.goutham.nelliBackend.dto.Cities;
import com.goutham.nelliBackend.dto.Client;
import com.goutham.nelliBackend.dto.Offers;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	CategoryDao categoryDAO;

	@Autowired
	ClientDao clientDao;

	@Autowired
	OffersDao offersDao;

	@Autowired
	CitiesDao cityDao;

	@Autowired
	S3Services s3Services;

	//private String uploadFilePath = "C:\\Users\\Gautham\\Desktop\\Capture.PNG";

	@RequestMapping({ "/", "", "/dashboard" })
	public ModelAndView dashboard(@RequestParam(name = "success", required = false) String success) {
		ModelAndView model = new ModelAndView("admin");

		if (success != null) {
			if (success.equals("message")) {
				model.addObject("message", "Category updated successfully!");
			}
		}

		model.addObject("title", "Dashboard");
		model.addObject("userClickDashboard", true);

		return model;

	}

	@RequestMapping("/addCategory/{id}")
	public ModelAndView addCategory(@PathVariable("id") String id) {
		ModelAndView model = new ModelAndView("admin");
		System.out.println("id : " + id);

		Category category = null;
		if (id.equals("add")) {
			category = new Category();
			model.addObject("category", category);
		} else if (Integer.parseInt(id) > 0) {
			category = categoryDAO.get(Integer.parseInt(id));
			model.addObject("category", category);
		}

		model.addObject("title", "categories");
		model.addObject("userClickAddCategories", true);

		return model;

	}

	@RequestMapping(value = "/addcategory", method = RequestMethod.POST)
	public String addCategory(@Valid @ModelAttribute("category") Category category, BindingResult results, Model model,
			HttpServletRequest request) {

		// System.out.println(" update "+category.getId());

		if (category.getId() == 0) {
			if (!category.getFile().getOriginalFilename().equals("")) {
				String str = s3Services.uploadFile(category.getFile(), category.getName() + category.getId());
				category.setImageURL(str);
			}
			categoryDAO.add(category);
		} else {
			if (!category.getFile().getOriginalFilename().equals("")) {
				String str = s3Services.uploadFile(category.getFile(), category.getName() + category.getId());
				category.setImageURL(str);
			}
			categoryDAO.update(category);
		}

		return "redirect:/admin/list/categories?success=message";
	}

	@RequestMapping("/addClient/{id}")
	public ModelAndView addClient(@PathVariable("id") String id) {
		ModelAndView model = new ModelAndView("admin");

		Client client = null;
		if (id.equals("add")) {
			client = new Client();
			model.addObject("client", client);
		} else if (Integer.parseInt(id) > 0) {
			client = clientDao.get(Integer.parseInt(id));
			model.addObject("client", client);
		}

		model.addObject("title", "Clients");
		model.addObject("userClickAddClient", true);

		return model;

	}

	@RequestMapping(value = "/addClient", method = RequestMethod.POST)
	public String addClient(@Valid @ModelAttribute("client") Client client, BindingResult results, Model model,
			HttpServletRequest request) {

		System.out.println(" update client " + client.getId());
		if (client.getId() == 0) {

			if (!client.getFile().getOriginalFilename().equals("")) {
				String str = s3Services.uploadFile(client.getFile(), client.getName() + client.getId());
				client.setImgUrl(str);
			}
			clientDao.add(client);
		} else {
			if (!client.getFile().getOriginalFilename().equals("")) {
				String str = s3Services.uploadFile(client.getFile(), client.getName() + client.getId());
				client.setImgUrl(str);
			}
			clientDao.update(client);
		}

		return "redirect:/admin/list/clients?success=message";
	}

	@RequestMapping("/addOffers/{id}")
	public ModelAndView addOffers(@PathVariable("id") String id) {
		ModelAndView model = new ModelAndView("admin");

		model.addObject("title", "Offers");
		model.addObject("userClickAddOffers", true);

		Offers offers = null;
		if (id.equals("add")) {
			offers = new Offers();
			model.addObject("offers", offers);
		} else if (Integer.parseInt(id) > 0) {
			offers = offersDao.get(Integer.parseInt(id));
			model.addObject("offers", offers);
		}

		return model;

	}

	@RequestMapping(value = "/addoffers", method = RequestMethod.POST)
	public String addOffers(@Valid @ModelAttribute("offers") Offers offers, BindingResult results, Model model,
			HttpServletRequest request) {
		System.out.println(" offer.getFile()" + offers.getFile());

		if (offers.getId() == 0) {
			if (!offers.getFile().getOriginalFilename().equals("")) {
				String str = s3Services.uploadFile(offers.getFile(), offers.getContent() + offers.getId());
				offers.setOffImageUrl(str);
			}
			offersDao.add(offers);
		} else {
			if (!offers.getFile().getOriginalFilename().equals("")) {
				String str = s3Services.uploadFile(offers.getFile(), offers.getContent() + offers.getId());
				offers.setOffImageUrl(str);
			}
			offersDao.update(offers);
		}

		return "redirect:/admin/list/offers?success=message";
	}

	@RequestMapping("/list/{name}")
	public ModelAndView categories(@PathVariable("name") String name) {
		ModelAndView model = new ModelAndView("admin");

		model.addObject("title", "List");
		if (name.equals("categories")) {
			model.addObject("userClickListCategories", true);
			// model.addObject("listObject", categoryDao.list());

		} else if (name.equals("clients")) {
			model.addObject("userClickListClient", true);
			// model.addObject("listObject", clientDao.list());

		} else if (name.equals("offers")) {
			model.addObject("userClickListOffer", true);
			// model.addObject("listObject", offersDao.list());
		}

		return model;

	}

	@RequestMapping("/deleteCategory/{id}")
	public String deleteCategory(@PathVariable("id") String id) {

		Category category = null;
		if (Integer.parseInt(id) > 0) {
			category = categoryDAO.get(Integer.parseInt(id));
			categoryDAO.delete(category);
		}

		return "redirect:/admin/list/categories?success=message";
	}

	@RequestMapping("/deleteClient/{id}")
	public String deleteClient(@PathVariable("id") String id) {

		Client client = null;
		if (Integer.parseInt(id) > 0) {
			client = clientDao.get(Integer.parseInt(id));
			clientDao.delete(client);
		}

		return "redirect:/admin/list/clients?success=message";
	}

	@RequestMapping("/deleteOffers/{id}")
	public String deleteOffers(@PathVariable("id") String id) {

		Offers offers = null;
		if (Integer.parseInt(id) > 0) {
			offers = offersDao.get(Integer.parseInt(id));
			offersDao.delete(offers);
		}

		return "redirect:/admin/list/offers?success=message";
	}

	@ModelAttribute("listCategory")
	public List<Category> modelCategories() {
		return categoryDAO.list();
	}

	@ModelAttribute("listCity")
	public List<Cities> modelCities() {
		return cityDao.list();
	}

	@ModelAttribute("listClient")
	public List<Client> modelClient() {
		return clientDao.list();
	}

}
