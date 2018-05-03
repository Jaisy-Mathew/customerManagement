/**
 * 
 */
package com.customer.customerManagement.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;

import com.customer.customerManagement.entity.Customer;
import com.customer.customerManagement.entity.CustomerAddress;

/**
 * @author Jaisy_Mathew
 *
 */
@RunWith(JUnit4.class)
public class CustomerServiceTest {
	
	@Autowired 
	private CustomerService customerService;
	/**
	 * Test method for {@link com.customer.customerManagement.service.CustomerServiceImpl#createCustomerDetails(com.customer.customerManagement.entity.Customer)}.
	 */
	@Test
	public void testCreateCustomerDetails() {
		Customer customer = new Customer();
		customer.setFirstName("firstName");
		customer.setLastName("lastName");
		customer.setDob("dob");
		customer.setEmail("email@email.com");
		List<CustomerAddress> addresses = new ArrayList<CustomerAddress>();
		CustomerAddress customerAddress = new CustomerAddress();
		customerAddress.setAddr1("addr1");
		customerAddress.setAddr2("addr2");
		customerAddress.setSuburb("suburb");
		customerAddress.setCity("city");
		customerAddress.setPostcode("2000");
		customerAddress.setCountry("Aus");
		customerAddress.setContactNumber("1234567890");
		addresses.add(customerAddress);
		customer.setAddresses(addresses);
		long result = customerService.createCustomerDetails(customer);
		assertTrue(0 != result);
	}

	/**
	 * Test method for {@link com.customer.customerManagement.service.CustomerServiceImpl#updateCustomerDetails(com.customer.customerManagement.entity.Customer)}.
	 */
	@Test
	public void testUpdateCustomerDetails() {
		Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setFirstName("firstNameNew");
		customer.setLastName("lastNameNew");
		customer.setDob("dobNew");
		customer.setEmail("emailNew@email.com");
		List<CustomerAddress> addresses = new ArrayList<CustomerAddress>();
		CustomerAddress customerAddress = new CustomerAddress();
		customerAddress.setAddr1("addr1New");
		customerAddress.setAddr2("addr2New");
		customerAddress.setSuburb("suburbNew");
		customerAddress.setCity("cityNew");
		customerAddress.setPostcode("2560");
		customerAddress.setCountry("Australia");
		customerAddress.setContactNumber("0987654321");
		addresses.add(customerAddress);
		customer.setAddresses(addresses);
		Customer result = customerService.updateCustomerDetails(customer);
		assertTrue(1 == result.getCustomerId());
	}

	/**
	 * Test method for {@link com.customer.customerManagement.service.CustomerServiceImpl#customerDetailsById(java.lang.Long)}.
	 */
	@Test
	public void testCustomerDetailsById() {
		Customer result = customerService.customerDetailsById(1L);
		assertTrue(0 != result.getCustomerId());
	}

	/**
	 * Test method for {@link com.customer.customerManagement.service.CustomerServiceImpl#allCustomerDetails()}.
	 */
	@Test
	public void testAllCustomerDetails() {
		List<Customer> result = customerService.allCustomerDetails();
		assertTrue(result.size()>0);
	}

	/**
	 * Test method for {@link com.customer.customerManagement.service.CustomerServiceImpl#deleteCustomerDetailsById(java.lang.Long)}.
	 */
	@Test
	public void testDeleteCustomerDetailsById() {
		String result = customerService.deleteCustomerDetailsById(1L);
		assertEquals("deleted", result);
	}

}
