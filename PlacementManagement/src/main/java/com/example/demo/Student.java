package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	private Integer id;
	private String name;
	private Integer roll;
	private String qaulification;
	private String course;
	private Integer year;
	private Integer hallticketno;
	
	// default constructor
	public Student() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Parameterized Constructor
	public Student(Integer id, String name, Integer roll, String qaulification, String course, Integer year,
			Integer hallticketno) 
	{
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
		this.qaulification = qaulification;
		this.course = course;
		this.year = year;
		this.hallticketno = hallticketno;
	}
	

	//setters and getters method
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getQaulification() {
		return qaulification;
	}
	public void setQaulification(String qaulification) {
		this.qaulification = qaulification;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getHallticketno() {
		return hallticketno;
	}
	public void setHallticketno(Integer hallticketno) {
		this.hallticketno = hallticketno;
	}
	
	// toString method
	//for return output in the string
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", roll=" + roll + ", qaulification=" + qaulification
				+ ", course=" + course + ", year=" + year + ", hallticketno=" + hallticketno + "]";
	}
	

}
