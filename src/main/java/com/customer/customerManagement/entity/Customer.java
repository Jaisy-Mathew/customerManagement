/**
 * 
 */
package com.customer.customerManagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
/**
 * @author Jaisy_Mathew
 *
 */
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
 
@Entity
public class Customer {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customerId;
 
    private String firstName;
    private String lastName;
    private String dob;
    private String email;
    
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    //@JoinColumn(name = "id")
    private List<CustomerAddress> addresses;

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long CustomerId) {
		this.customerId = CustomerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<CustomerAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<CustomerAddress> Addresses) {
		this.addresses = Addresses;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", email=" + email + ", customerAddressList=" + addresses + "]";
	}
    
}