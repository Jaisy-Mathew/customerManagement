/**
 * 
 */
package com.customer.customerManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Jaisy_Mathew
 *
 */
@Entity
public class CustomerAddress {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long addressId;
    
	private String addr1;
	private String addr2;
	private String city;
	private String suburb;
	private String postcode;
	private String country;
	private String contactNumber;
	
	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "CustomerAddress [addressId=" + addressId + ", addr1=" + addr1 + ", addr2=" + addr2 + ", city=" + city + ", suburb="
				+ suburb + ", postode=" + postcode + ", country=" + country + ", contactNumber=" + contactNumber
				+ "]";
	}
	
}
