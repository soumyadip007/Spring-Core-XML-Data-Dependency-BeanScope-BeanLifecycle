package com.udemy.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//Load  spring Configuration File
		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext("applicationContext.xml");

	
		//Retrieve Bean from spring Container

		CricketCoach obj = context.getBean("myCricketCoach", CricketCoach.class);
	
		//Call methods on the bean
		
		System.out.println(obj.getDailyWorkout());
		
		System.out.println(obj.getDailyFortune());
		
		
		//Close the context
		
		context.close();
	}

}
