package com.project.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student1 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer rollNumber;
	private String name;
	private String address;
	private Double percentage;
	
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student1(Integer rollNumber, String name, String address, Double percentage) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
		this.percentage = percentage;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student1 [rollNumber=" + rollNumber + ", name=" + name + ", address=" + address + ", percentage="
				+ percentage + "]";
	}

	

	
	
	
	
	
	

}
