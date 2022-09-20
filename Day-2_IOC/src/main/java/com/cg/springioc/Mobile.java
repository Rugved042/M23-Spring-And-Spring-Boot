package com.cg.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) 
	{
		//object creation for Airtel
		/*Sim s = new Airtel();
		s.calling();
		s.data();
		
		//object creation for Jio
		Sim s1 =  new Jio();
		s1.calling();
		s1.data();*/
		
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config...loaded");
		
		// object creation for Airtel
		Sim obj = a.getBean("sim",Sim.class);
		obj.calling();
		obj.data();
		
		//object creation for Jio
		/*Jio obj1 = (Jio)a.getBean("jio");
		obj1.calling();
		obj1.data();*/
		
		
	}

}
