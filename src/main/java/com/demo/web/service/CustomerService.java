package com.demo.web.service;

import java.util.List;

import com.demo.web.domain.Customer;

public interface CustomerService {
	
	Customer getCustomer(String username, String password);
	
	List<Customer> getCustomers();	
}