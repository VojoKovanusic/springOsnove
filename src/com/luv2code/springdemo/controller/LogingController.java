package com.luv2code.springdemo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.entity.Loging;

@org.springframework.stereotype.Controller

@RequestMapping("/")
public class LogingController {
	
	
	//na ovo usmjerava prilikom pokretanja aplikacije, jer je na index.jsp tako nastimano
		@GetMapping("/showFormloging")
		public String showFormlogin(Model model) {
			Loging admin = new Loging();
			model.addAttribute("admin", admin);
			return "login";
		}

		@PostMapping("validateAdmin")
		public String shocwFormlogin(@ModelAttribute("admin") Loging admin, Model  model) {
			if ( admin.getName().equals("admin") && ( admin.getPass().equals("admin"))){
				return "redirect:/list";}
			
			if ( admin.getName().equals("client") && ( admin.getPass().equals("client"))){
				return "redirect:clientByLastName";}
			
			else{
				admin.setMsg("Please enter valid Login Details ");
				model.addAttribute("admin", admin);
				return "login";}
		}
}
