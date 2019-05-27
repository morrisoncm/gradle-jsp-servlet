package com.demo.web.dao;

import java.util.Arrays;
import java.util.List;

import com.demo.web.domain.Customer;
import com.demo.web.exception.CustomerNotFoundException;

public class CustomerDao {

	List<Customer> customers;

	public CustomerDao() {
		super();
		customers = Arrays.asList(new Customer("John", "Doe", "jdoe", "password"),
				new Customer("Jane", "Roe", "jroe", "password"));
	}

	public List getCustomers() {
		return customers;
	}

	public Customer getCustomer(Customer customer) {
		for (Customer customerDb : customers) {
			if (customerDb.equals(customer)) {
				return customerDb;
			}
		}
		throw new CustomerNotFoundException();
	}
}