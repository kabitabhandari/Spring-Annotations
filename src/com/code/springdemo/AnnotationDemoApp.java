package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	
	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from spring container
		//Coach coach = context.getBean("favouriteCoach", Coach.class );
		Coach coach = context.getBean("tennisCoach", Coach.class );
		
		//call a  method on the bean
		System.out.println(coach.getDailyWorkOut());
		
		//close the context
		context.close();
	}
}
