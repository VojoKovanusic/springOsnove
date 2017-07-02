
package com.luv2code.springdemo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@org.springframework.stereotype.Controller
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

	@GetMapping("/sortBySalary")
	public String listoOfCustomersBySalary(Model model) {

		List<Customer> listCustomers = customerService.getCustomersBySalary();
		model.addAttribute("customers", listCustomers);

		return "list-customer";
	}

	@GetMapping("/showFormADD")
	public String showFormForADD(Model model) {

		Customer customer = new Customer();
		model.addAttribute("customer", customer);

		return "customer-form";
	}

	// za validaciju
	@PostMapping("saveCustomer")
	public String saveCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult binding) {
		if (binding.hasErrors()) {
			return "customer-form";
		} else {
			customerService.saveCustomer(customer);

			return "redirect:/customer/list";
		}
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int id, Model model) {
		// get customer from the service(no DB)
		Customer customer = customerService.getCustomer(id);

		model.addAttribute("customer", customer);

		return "customer-form";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int id) {
		customerService.deleteCustomer(id);

		return "redirect:/customer/list";
	}

}
