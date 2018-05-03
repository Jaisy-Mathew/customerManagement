/**
 * 
 */
package com.customer.customerManagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.customerManagement.entity.Customer;
import com.customer.customerManagement.repository.CustomerRepository;

/**
 * @author Jaisy_Mathew
 *
 */

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public long createCustomerDetails(Customer customer) {
		Customer savedCustomer = new Customer();
		try {
			savedCustomer = customerRepository.save(customer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return savedCustomer.getCustomerId();
	}
	
	@Override
	public Customer updateCustomerDetails(Customer customer) {
		Customer updatedCustomer = new Customer();
		try {
			updatedCustomer = customerRepository.save(customer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return updatedCustomer;
	}
	
	
	@Override
	public Customer customerDetailsById(Long customerId) {
		Optional<Customer> customer = null;
		try {
			customer = customerRepository.findById(customerId);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return customer.get();
	}
	
	
	@Override
	public List<Customer> allCustomerDetails() {
		List<Customer> customers = new ArrayList<Customer>();
		try {
			customerRepository.findAll().forEach(customers :: add);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return customers;
	}
	
	
	@Override
	public String deleteCustomerDetailsById(Long customerId) {
		try {
			customerRepository.deleteById(customerId);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "deleted";
	}
}
