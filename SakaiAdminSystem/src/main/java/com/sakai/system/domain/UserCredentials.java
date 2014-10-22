package com.sakai.system.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class UserCredentials {
	
	@Id
	private String username;
	@NotNull
	private String password;	
	@Column(nullable=true)
	private String role;
	
	
   private boolean enabled=true;

	
	public UserCredentials() {
		// TODO Auto-generated constructor stub
	}
	
	public UserCredentials(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = true;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	

}
