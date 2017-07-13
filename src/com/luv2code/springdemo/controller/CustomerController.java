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

import com.luv2code.springdemo.entity.Loging;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	//da posalje na adminovu listu, koja ima druge mogucnosti:dodvanje, editovanja, dugmadi....
	@GetMapping("/list")
	public String listoOfCustomers(Model model,Loging admin) {

		List<Customer> listCustomers = customerService.getCustomers();
		model.addAttribute("customers", listCustomers);
		
			return "admin-list-customer";
	}
//sortiranje po plati za admina
	@GetMapping("/sortBySalary")
	public String listoOfCustomersBySalary(Model model) {

		List<Customer> listCustomers = customerService.getCustomersBySalary();
		model.addAttribute("customers", listCustomers);
	 
		return "admin-list-customer";
	}
	
	
	@GetMapping("/sortByRegistrationDate")
	public String listoOfCustomersByRegistration(Model model) {

		List<Customer> listCustomers = customerService.getCustomersByRegisterDate();
		model.addAttribute("customers", listCustomers);
	 
		return "admin-list-customer";
	}	
 

	@GetMapping("/showFormADD")
	public String showFormForADD(Model model) {

		Customer customer = new Customer();
		model.addAttribute("customer", customer);

		return "add-customer";
	}


	// za validaciju
	@PostMapping("/saveCustomer")
	public String saveCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult binding) {
		if (binding.hasErrors()) {
			return "add-customer";
		} else {
			customerService.saveCustomer(customer);

			return "redirect:/list";
		}
		
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int id, Model model) {
		// get customer from the service(no DB)
		Customer customer = customerService.getCustomer(id);

		model.addAttribute("customer", customer);

		return "add-customer";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int id) {
		customerService.deleteCustomer(id);

		return "redirect:/list";
	}
	// da posalje na klijentovu listu
		@GetMapping("/clientByLastName")
		public String listoCustomers(Model model,Loging admin) {

			List<Customer> listCustomers = customerService.getCustomers();
			model.addAttribute("customers", listCustomers);
			
				return "redirect:/client-list-customers";
		}


		//sortiranje po plati za klient
		@GetMapping("/sortBySalary/client")
		public String listoCustomersBySalary(Model model) {

			List<Customer> listCustomers = customerService.getCustomersBySalary();
			model.addAttribute("customers", listCustomers);
		 
			return "redirect:/client-list-customers";
		}
}
