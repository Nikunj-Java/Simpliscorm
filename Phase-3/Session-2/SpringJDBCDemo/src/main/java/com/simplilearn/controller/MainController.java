package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.servlet.DispatcherServlet;

import com.simplilearn.dao.EProductDao;
import com.simplilearn.entity.EProductEntity;

@Controller
public class MainController {
	
	 
	
	@Autowired
	EProductDao dao;
	

	
	@GetMapping("/listproducts")
	public String getAllProducts(ModelMap map) {
		List<EProductEntity> list= dao.getAllProducts();
		map.addAttribute("list",list);
		return "products";
		
	}

}
