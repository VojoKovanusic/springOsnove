
package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	@Override
	
	public List<Customer> getCustomers() {

		return customerDAO.getCustomers();
	}

	@Override
	
	public void saveCustomer(Customer customer) {
		customerDAO.saveCustomer(customer);
	}

	@Override
	 
	public Customer getCustomer(int id) {

		return customerDAO.getCustomer(id);
	}

	@Override
	
	public void deleteCustomer(int id) {
		customerDAO.deleteCustomer(id);
	}

	@Override
	
	public List<Customer> getCustomersBySalary() {
		 
		return customerDAO.getCustomersBySalary();
	}

	@Override
	 
	public List<Customer> getCustomersByRegisterDate() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomersByRegisterDate();
	}
}
