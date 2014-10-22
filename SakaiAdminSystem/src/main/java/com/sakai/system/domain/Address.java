package com.sakai.system.domain;

import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

@Embeddable
public class Address {
    
	
	@Size(min=1)
	private String street;
	@Size(min=1)
	private String state;
	@Size(min=1)
	private String city;
	@Size(min=1)
	private String zip;
	
	public Address(){ }
	
	public Address(String street, String state, String city, String zip) {
		super();
		this.street = street;
		this.state = state;
		this.city = city;
		this.zip = zip;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
	
	
}
