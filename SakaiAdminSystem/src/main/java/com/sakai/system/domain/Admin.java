package com.sakai.system.domain;

import javax.persistence.Entity;

@Entity
public class Admin extends Person {

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(long id, String name, String phone, String email,
			Address address, UserCredentials user) {
		super(id, name, phone, email, address, user);
		// TODO Auto-generated constructor stub
	}

}
