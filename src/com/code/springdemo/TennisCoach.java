package com.code.springdemo;

import org.springframework.stereotype.Component;

//@Component("favouriteCoach")
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		
		return "Practice your backhand volley";
	}

}
