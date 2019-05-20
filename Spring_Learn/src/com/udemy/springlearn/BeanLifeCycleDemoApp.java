package com.udemy.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String args[])
	{
		//load spring config file
		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext("applicationContext-BeanLifeCycle.xml");

			
		 
		//Retrieve bean from container using prototype
		
		Coach obj = context.getBean("myCoach", Coach.class);
		

		System.out.println(obj.getDailyWorkout());
				
		//Close the context
				
				context.close();
	}
}
