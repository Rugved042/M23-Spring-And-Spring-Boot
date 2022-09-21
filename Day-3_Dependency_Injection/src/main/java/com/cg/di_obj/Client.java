package com.cg.di_obj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) 
	{
		/*StudentNew s = new StudentNew();
		s.cheating();*/
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		StudentNew s = c.getBean("s",StudentNew.class);
		s.cheating();
	}

}
