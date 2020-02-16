package com.demo.web.service;

import java.util.List;

import com.demo.web.domain.Customer;

public interface CustomerService {

	List<Customer> getCustomers();

	Customer getCustomer(String username, String password);

	Customer registerCustomer(Customer customer);
}