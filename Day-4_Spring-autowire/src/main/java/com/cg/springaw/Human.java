package com.cg.springaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human 
{
	//dependency in terms of objects
	private Heart heart;
	
	//Achieving DI using setters
	@Autowired
	//@Qualifier("Humanheart")
	@Qualifier("Animalheart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	//method
	public void pumping()
	{
		heart.pump();
		System.out.println("Name of the animal is : "+heart.getNameofAnimal()+" and "+"No. of heart is : "+heart.getNoofHeart());
	}
	
	//Achieving DI using constructor
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}
	
	// default Constructor
	public Human() {
		super();
		this.heart = heart;
	}
	

}
