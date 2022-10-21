package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin 
{
	@Id
	private Integer adminid;
	private String adminname;
	private String adminpassword;
	
	public Admin(Integer adminid, String adminname, String adminpassword) {
		super();
		this.adminid = adminid;
		this.adminname = adminname;
		this.adminpassword = adminpassword;
	}
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getAdminid() {
		return adminid;
	}
	public void setAdminid(Integer adminid) {
		this.adminid = adminid;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	
	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", adminname=" + adminname + ", adminpassword=" + adminpassword + "]";
	}
	

	
}
