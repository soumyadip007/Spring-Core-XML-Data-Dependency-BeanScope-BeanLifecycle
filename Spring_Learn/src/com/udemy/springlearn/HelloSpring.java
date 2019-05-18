package com.udemy.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		


		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		// load the spring configuration file
		Coach obj = context.getBean("myCoach", Coach.class);
		Coach obj1 = context.getBean("myCoach1", Coach.class);
		
		// call methods on the bean
		System.out.println(obj.getDailyWorkout());
		System.out.println(obj1.getDailyWorkout());
		
		// close the context
		context.close();
		
		
	}

}
