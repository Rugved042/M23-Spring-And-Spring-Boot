package com.cg.di;

// 1. Dependency in terms of Literal
public class Student 
{
	private String StudentName;
	private int rollNo;
	
	//user-define method
	public void display()
	{
		System.out.println("Student Name is:"+StudentName+" "+"And Roll No is :"+rollNo);	
	}

	// DI- using constructor
	// Constructor-arg name shoulld pass in beans.xml
	public Student(String studentName, int rollNo) {
		super();
		StudentName = studentName;
		this.rollNo = rollNo;
	}
	
	
	/*//Dependency-Injection using setters method 
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setStudentName(String studentName) {
		this.StudentName = studentName;
	}*/
}
