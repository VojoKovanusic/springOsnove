package com.luv2code.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogingController {

	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("uname")String name, @RequestParam("pass")String pass) {
		ModelAndView model = new ModelAndView();
	 

		if (name.equals("admin") && (pass.equals("admin"))) {
			model.setViewName("admin-list-customer");
			return model;
		}

		if (name.equals("client") && (pass.equals("client"))) {
			model.setViewName("client-list-customers");
			return model;
		}

		else {
			model.setViewName("index.jsp");
			return model;
		}
	}}
