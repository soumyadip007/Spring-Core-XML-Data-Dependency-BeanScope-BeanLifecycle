package com.udemy.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String args[])
	{
		//load spring config file
		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext("applicationContext-BeanScope.xml");

			
		 
		//Retrieve bean from container using prototype
		
		Coach obj = context.getBean("myCoach", Coach.class);
		
		Coach obj1 = context.getBean("myCoach", Coach.class);
		
		
		//Check result
		boolean result= (obj==obj1);
		
		System.out.println("\nBoth objects are same = "+result);
		
		System.out.println("\nMemory alocation for obj is = "+obj);

		System.out.println("\nMemory alocation for obj1 is = "+obj1);
				
				
				
		//Close the context
				
				context.close();
	}
}

/*Both objects are same = false

Memory alocation for obj is = com.udemy.springlearn.TrackCoach@462d5aee

Memory alocation for obj1 is = com.udemy.springlearn.TrackCoach@69b0fd6f
*/