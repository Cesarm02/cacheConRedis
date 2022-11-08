package com.upc.cacheConRedis.domain;

import java.io.Serializable;

public class Student  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String firstname;
	private String lastname;
	private String email;
	private String status;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
