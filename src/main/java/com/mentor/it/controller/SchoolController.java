package com.mentor.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mentor.it.service.SchoolService;

@Controller
public class SchoolController {
	
	@Autowired
	SchoolService service;
	@GetMapping("/schoolform")
	public String showAddSchoolForm(Model model)
	{
		return "addschool.html";
	}

}
