package com.goutham.nelli.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.goutham.nelli.model.OffersBean;
import com.goutham.nelliBackend.dao.CategoryDao;
import com.goutham.nelliBackend.dao.CitiesDao;
import com.goutham.nelliBackend.dao.ClientDao;
import com.goutham.nelliBackend.dao.ContactDAO;
import com.goutham.nelliBackend.dao.OffersDao;
import com.goutham.nelliBackend.dto.Category;
import com.goutham.nelliBackend.dto.Client;
import com.goutham.nelliBackend.dto.ContactUs;
import com.goutham.nelliBackend.dto.Offers;

@Controller
public class MainController {
	
	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	ClientDao clientDao;
	
	@Autowired
	OffersDao offersDao;
	
	@Autowired
	CitiesDao cityDAO;
	
	@Autowired
	private ContactDAO contactDAO;
	
	@Autowired
	private JavaMailSender mailSender; 
	
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		
		List<Offers> listOffers = offersDao.listSpecialOffers();
		
		List<OffersBean> offersBeanList = new ArrayList<OffersBean>();
		for(Offers offers : listOffers){
			OffersBean offersBean =new OffersBean();
			offersBean.setCatName(categoryDao.get(offers.getCatId()).getName());
			offersBean.setCityName(cityDAO.get(offers.getCityId()).getCityName());
			offersBean.setClientName(clientDao.get(offers.getClientId()).getName());
			offersBean.setId(offers.getId());
			offersBean.setPhone(clientDao.get(offers.getClientId()).getMobile());
			offersBean.setImageUrl(offers.getOffImageUrl());
			offersBean.setOfferLink(offers.getOfferLink());
			offersBean.setContent(offers.getContent());
			
			offersBeanList.add(offersBean);
			
		}
		
		
		mv.addObject("listOffers", offersBeanList);
		
		return mv;
	}
	
	@RequestMapping(value = { "/about" })
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About-Us");
		mv.addObject("userClickAboutus", true);
		return mv;
	}
	
	@RequestMapping(value = { "/contact" })
	public ModelAndView contact(@RequestParam(name = "success", required = false) String success) {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact-Us");
		mv.addObject("userClickContactus", true);
		
		ContactUs contact = new ContactUs();
		mv.addObject("contact", contact);
		if (success != null) {
			if (success.equals("contact")) {
				mv.addObject("message", "Contact Form submitted successfully!");
			}
		}
		
		return mv;
	}
	
	
	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public String doSendEmail(@Valid @ModelAttribute("contact") ContactUs contact, BindingResult results, Model model,
			HttpServletRequest request) {

		

		String body = "Name :" + contact.getName() + "Message :" + contact.getMessage();
		

		if (contact.getId() == 0) {
			contactDAO.addContact(contact);
		}

		try {
			SimpleMailMessage email = new SimpleMailMessage();
			email.setTo(contact.getEmail());
			email.setFrom("gouthamliferay@gmail.com");
			email.setSubject(contact.getSubject());
			email.setText(contact.getMessage());


			mailSender.send(email);
			

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return "redirect:/contact?success=contact";
	}
	
	@RequestMapping(value = { "/categories" })
	public ModelAndView categories() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Categories");
		mv.addObject("categories", categoryDao.list());
		mv.addObject("userClickCategories", true);
		return mv;
	}
	
	@RequestMapping(value = { "/view/{categoryId}/category" })
	public ModelAndView viewSingleCategory(@PathVariable("categoryId") int id) {
		ModelAndView mv = new ModelAndView("page");
		Category category = categoryDao.get(id);
		
		List<Client> listClient = clientDao.getCategorylistById(category.getId());
		
		mv.addObject("title", category.getName());
		mv.addObject("category", category);
		mv.addObject("clients", listClient);
		mv.addObject("userClickSingleCategory", true);
		return mv;
	}
	
	
	@RequestMapping(value = { "/show/{clientId}/details" })
	public ModelAndView viewClient(@PathVariable("clientId") int id) {
		ModelAndView mv = new ModelAndView("page");
		Client client = clientDao.get(id);
		List<Offers> listOffers = offersDao.getListOffersById(client.getId());
		
		List<OffersBean> offersBeanList = new ArrayList<OffersBean>();;
		for(Offers offers : listOffers){
			OffersBean offersBean =new OffersBean();
			offersBean.setCatName(categoryDao.get(offers.getCatId()).getName());
			offersBean.setCityName(cityDAO.get(offers.getCityId()).getCityName());
			offersBean.setClientName(clientDao.get(offers.getClientId()).getName());
			offersBean.setId(offers.getId());
			offersBean.setPhone(clientDao.get(offers.getClientId()).getMobile());
			offersBean.setImageUrl(offers.getOffImageUrl());
			offersBean.setOfferLink(offers.getOfferLink());
			offersBean.setContent(offers.getContent());
			
			offersBeanList.add(offersBean);
			
		}
		
		
		mv.addObject("title", client.getName());
		mv.addObject("listOffers", offersBeanList);
		mv.addObject("client", client);
		mv.addObject("userClickClientDetails", true);
		return mv;
	}
	
	@RequestMapping(value = "/login")
	public ModelAndView login(@RequestParam(name = "error", required = false) String error,
			@RequestParam(name = "logout", required = false) String logout) {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("title", "Login");
		if (error != null) {
			mv.addObject("message", "Username and Password is invalid!");
		}
		if (logout != null) {
			mv.addObject("logout", "You have logged out successfully!");
		}
		return mv;
	}
	
	@RequestMapping(value = "/access-denied")
	public ModelAndView accessDenied() {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("errorTitle", "Aha! Caught You.");
		mv.addObject("errorDescription", "You are not authorized to view this page!");
		mv.addObject("title", "403 Access Denied");
		return mv;
	}
	
	@RequestMapping(value = "/perform-logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		// Invalidates HTTP Session, then unbinds any objects bound to it.
		// Removes the authentication from securitycontext
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}

		return "redirect:/login?logout";
	}

}
