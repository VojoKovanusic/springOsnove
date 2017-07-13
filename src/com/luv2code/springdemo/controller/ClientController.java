package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.Loging;
import com.luv2code.springdemo.service.CustomerService;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class ClientController {

	@Autowired
	private CustomerService customerService;

	
 

}
