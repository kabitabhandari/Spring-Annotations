package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	
	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from spring container
		//Coach coach = context.getBean("favouriteCoach", Coach.class );
		Coach coach = context.getBean("tennisCoach", Coach.class ); // id generated by spring y default
		//FortuneService fs1 = context.getBean("randomService", FortuneService.class ); 
		
		//call a  method on the bean
		System.out.println(coach.getDailyWorkOut());
		
		//call method to get daily fortune
		System.out.println(coach.getDailyFortune());
		
	//	System.out.println(fs1.getFortune());
		
		//close the context
		context.close();
	
		
	}
}
