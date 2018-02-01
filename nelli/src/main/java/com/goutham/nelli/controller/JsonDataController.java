package com.goutham.nelli.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goutham.nelliBackend.dao.CategoryDao;
import com.goutham.nelliBackend.dto.Category;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {

	@Autowired
	CategoryDao categoryDao;

	@RequestMapping("/all/category")
	@ResponseBody
	public List<Category> getAllCategoryList() {
		System.out.println("goutham inside json");
		return categoryDao.list();

	}

}
