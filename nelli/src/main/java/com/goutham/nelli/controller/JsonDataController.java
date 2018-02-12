package com.goutham.nelli.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goutham.nelliBackend.dao.CategoryDao;
import com.goutham.nelliBackend.dao.ClientDao;
import com.goutham.nelliBackend.dao.OffersDao;
import com.goutham.nelliBackend.dto.Category;
import com.goutham.nelliBackend.dto.Client;
import com.goutham.nelliBackend.dto.Offers;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {

	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	ClientDao clientDao;
	
	@Autowired
	OffersDao offersDao;

	@RequestMapping("/all/category")
	@ResponseBody
	public List<Category> getAllCategoryList() {
		System.out.println("Inside Cat ");
		return categoryDao.list();

	}
	
	@RequestMapping("/all/client")
	@ResponseBody
	public List<Client> getAllClientList() {
		return clientDao.list();

	}
	
	@RequestMapping("/all/offers")
	@ResponseBody
	public List<Offers> getAllOffersList() {
		
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		return offersDao.list();

	}

}
