package com.firstapp.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from the container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the beans
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
		 
		

	}

}
