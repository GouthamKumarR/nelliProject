package com.goutham.nelli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.goutham.nelliBackend.dao.CategoryDao;
import com.goutham.nelliBackend.dao.ClientDao;
import com.goutham.nelliBackend.dao.OffersDao;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	CategoryDao categoryDao;

	@Autowired
	ClientDao clientDao;

	@Autowired
	OffersDao offersDao;

	@RequestMapping("/dashboard")
	public ModelAndView dashboard() {
		ModelAndView model = new ModelAndView("admin");

		model.addObject("title", "Dashboard");
		model.addObject("userClickDashboard", true);

		return model;

	}

	@RequestMapping("/addCategory")
	public ModelAndView addCategory() {
		ModelAndView model = new ModelAndView("admin");

		model.addObject("title", "categories");
		model.addObject("userClickAddCategories", true);

		return model;

	}

	@RequestMapping("/addClient")
	public ModelAndView addClient() {
		ModelAndView model = new ModelAndView("admin");

		model.addObject("title", "Clients");
		model.addObject("userClickAddClient", true);

		return model;

	}

	@RequestMapping("/addOffers")
	public ModelAndView addOffers() {
		ModelAndView model = new ModelAndView("admin");

		model.addObject("title", "Offers");
		model.addObject("userClickAddOffers", true);

		return model;

	}
	
	@RequestMapping("/list/{name}")
	public ModelAndView categories(@PathVariable("name") String name) {
		ModelAndView model = new ModelAndView("admin");

		model.addObject("title", "List");
		if (name.equals("categories")) {
			model.addObject("userClickListCategories", true);
			model.addObject("listObject", categoryDao.list());

		} else if (name.equals("clients")) {
			model.addObject("userClickListClient", true);
			model.addObject("listObject", clientDao.list());

		} else if (name.equals("offers")) {
			model.addObject("userClickListOffer", true);
			model.addObject("listObject", offersDao.list());
		}

		return model;

	}

	

}
