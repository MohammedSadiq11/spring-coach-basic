package com.firstapp.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from the container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the beans
		System.out.println(theCoach.getDailyWorkout());
		
		//first dependency injection
		System.out.println(theCoach.getFortune());
		
		context.close();
		 
		

	}

}
