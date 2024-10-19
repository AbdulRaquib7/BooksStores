package com.bookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookStore.service.MyBookListService;

@Controller
public class MyBookListController {
	
	@Autowired
	private MyBookListService service;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id") Long id) {
	    System.out.println("ID Type: " + id.getClass().getName()); // Log the ID type
	    service.deleteById(id);
	    return "redirect:/my_books";
	}


}