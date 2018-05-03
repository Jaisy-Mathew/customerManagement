package com.customer.customerManagement.service;

import java.util.List;

import com.customer.customerManagement.entity.Customer;

public interface CustomerService {
	public long createCustomerDetails(Customer customer);
	public Customer updateCustomerDetails(Customer customer);
	public Customer customerDetailsById(Long customerId);
	public List<Customer> allCustomerDetails();
	public String deleteCustomerDetailsById(Long customerId);
	
}
