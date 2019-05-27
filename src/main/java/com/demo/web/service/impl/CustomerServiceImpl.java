package com.demo.web.service.impl;

import java.util.List;


import com.demo.web.dao.CustomerDao;
import com.demo.web.domain.Customer;
import com.demo.web.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao = new CustomerDao();
	
	@Override
	public Customer getCustomer(String username, String password) {
		Customer customer = new Customer(username, password);
		return customerDao.getCustomer(customer);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}
}