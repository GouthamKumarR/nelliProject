package com.goutham.nelli.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.goutham.nelliBackend.dao.CategoryDao;
import com.goutham.nelliBackend.dao.ClientDao;
import com.goutham.nelliBackend.dao.OffersDao;
import com.goutham.nelliBackend.dto.Category;
import com.goutham.nelliBackend.dto.Client;
import com.goutham.nelliBackend.dto.Offers;

@Controller
public class MainController {
	
	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	ClientDao clientDao;
	
	@Autowired
	OffersDao offersDao;
	
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
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
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact-Us");
		mv.addObject("userClickContactus", true);
		return mv;
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
		mv.addObject("title", client.getName());
		mv.addObject("listOffers", listOffers);
		mv.addObject("client", client);
		mv.addObject("userClickClientDetails", true);
		return mv;
	}

}
