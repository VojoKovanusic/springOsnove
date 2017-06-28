
package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@GetMapping("/list")
	public String listoOfCustomers(Model model) {

		List<Customer> listCustomers = customerService.getCustomers();
		model.addAttribute("customers", listCustomers);

		return "list-customer";
	}

	@GetMapping("/showFormADD")
	public String showFormForADD(Model model) {

		Customer customer = new Customer();

		model.addAttribute("customer", customer);

		return "customer-form";
	}

	@PostMapping("saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {

		customerService.saveCustomer(customer);

		return "redirect:/customer/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int id, Model model) {
		// get customer from the service(no DB)
	 Customer customer=customerService.getCustomer(id);
	 
	 model.addAttribute("customer",customer);
		
		return  "customer-form";
	}
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int id){
		customerService.deleteCustomer(id);
		
		
		return "redirect:/customer/list";
	}

}
