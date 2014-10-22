package com.sakai.system.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.validator.constraints.Email;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Person {
	
   @Id
   @GeneratedValue(strategy= GenerationType.TABLE)
   private long id;
   
   @NotNull
   private String name;
   
   @Size(min=10,max=20)
   private String phone;
   
   @Email(message="please pass a valid email addess")
   private String email;
   
   @Embedded
   private Address address;
   
   @NotNull
   @OneToOne
   @Cascade(CascadeType.ALL)
   @JoinColumn(name="username")
   private UserCredentials  user;
   
   public Person(){}

public Person(long id, String name, String phone, String email,
		Address address, UserCredentials user) {
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
	this.email = email;
	this.address = address;
	this.user = user;
	
	
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public UserCredentials getUser() {
	return user;
}

public void setUser(UserCredentials user) {
	this.user = user;
}
   
   
   
   
}
