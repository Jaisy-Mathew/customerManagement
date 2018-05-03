package com.customer.customerManagement.repository;
/**
 * @author Jaisy_Mathew
 *
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.customer.customerManagement.entity.Customer;

@RepositoryRestResource
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}