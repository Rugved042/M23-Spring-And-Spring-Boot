package com.example.demo;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Admin 
{
	@Id
	private Integer admin_id;
	private String admin_name;
	private String admin_password;
	

	//Default Constructor
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Parameterized Constructor 
	public Admin(Integer admin_id, String admin_name, String admin_password) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
		this.admin_password = admin_password;
	}

	//getters and setters method
	public Integer getId() {
		return admin_id;
	}

	public void setId(Integer id) {
		this.admin_id = id;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	
	// toString Method
	@Override
	public String toString() {
		return "Admin [id=" + admin_id + ", admin_name=" + admin_name + ", admin_password=" + admin_password + "]";
	}
}
