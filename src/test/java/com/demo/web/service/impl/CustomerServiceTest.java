package com.demo.web.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.demo.web.domain.Customer;
import com.demo.web.exception.CustomerNotFoundException;
import com.demo.web.service.CustomerService;

class CustomerServiceTest {

	private CustomerService customerService;

	@Test
	void testGetCustomer() {
		customerService = new CustomerServiceImpl();
		Customer customerCompare = new Customer("jdoe", "password");
		Assertions.assertEquals(customerCompare, customerService.getCustomer("jdoe", "password"));
	}

	@Test
	void testGetCustomerCustomerNotFoundException() {
		customerService = new CustomerServiceImpl();
		Assertions.assertThrows(CustomerNotFoundException.class,
				() -> customerService.getCustomer("madeupusername", "password"));
	}

	@Test
	void testGetCustomers() {
		customerService = new CustomerServiceImpl();
		Assertions.assertEquals(2, customerService.getCustomers().size());
	}
}