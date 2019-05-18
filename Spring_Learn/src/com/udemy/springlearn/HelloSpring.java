package com.udemy.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		

		//Load the spring Configuration
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//Retrieve bean from spring container
		
		Coach obj=context.getBean("myCoach", Coach.class );
		
		//call methods on the bean
		
		System.out.println(obj.getDailyWorkout());
		
		// close the context
		context.close();
		
		
	}

}
