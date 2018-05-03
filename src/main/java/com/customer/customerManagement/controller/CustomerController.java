package com.customer.customerManagement.controller;
/**
 * @author Jaisy_Mathew
 *
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author Jaisy_Mathew
 *
 */
import org.springframework.web.bind.annotation.RestController;

import com.customer.customerManagement.entity.Customer;
import com.customer.customerManagement.service.CustomerService;

@RestController
@RequestMapping(value="/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping(value="/create",  produces=MediaType.APPLICATION_JSON_VALUE, 
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public long createCustomerDetails(@RequestBody Customer customer) {
		System.out.println("customer:::"+customer);
		return customerService.createCustomerDetails(customer);
	}

	@PutMapping(value="/update",  produces=MediaType.APPLICATION_JSON_VALUE, 
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public Customer updateCustomerDetails(@RequestBody Customer customer) {
		System.out.println("customer:::"+customer);
		return customerService.updateCustomerDetails(customer);
	}

	@GetMapping(value="/{customerId}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Customer  retrieveCustomerDetails(@PathVariable("customerId") Long customerId){
		System.out.println("customerId:::"+customerId);
		return customerService.customerDetailsById(customerId);
	}
	
	@GetMapping(value="/all", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Customer>  retrieveAllCustomerDetails(){
		System.out.println("retrieveAllCustomerDetails");
		return customerService.allCustomerDetails();
	}

	@DeleteMapping(value="/delete/{customerId}",  produces=MediaType.APPLICATION_JSON_VALUE)
	public String deleteCustomerDetailsById(@PathVariable("customerId") Long customerId) {
		System.out.println("customerId:::"+customerId);
		return customerService.deleteCustomerDetailsById(customerId);
	}
}
