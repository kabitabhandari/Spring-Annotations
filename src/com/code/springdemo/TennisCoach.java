package com.code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("favouriteCoach")
@Component
public class TennisCoach implements Coach {
	
	// directly applying autowired annotation with field level
	@Autowired
	@Qualifier("randomFortuneService")
	//@Qualifier("happyFortuneService")
	//@Qualifier("RESTFortuneService") // here qualifier naming convention is different. No lowercase in qualifier name because both the first and second characters of the class name are uppsr case.
	
	private FortuneService fortuneService;
	
	// used for constructer injection
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

//	Qualifier with constructors
//	@Autowired
//	public TennisCoach(@Qualifier("randomFortuneService")FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	
	// using setter injection
/*		@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	//own custom method for autowiring
	
//			@Autowired
//	public void doSomeCrazyStuffs(FortuneService fortuneService) {
//		System.out.println("Crazy method : ");
//		this.fortuneService = fortuneService;
//	
//	}
	

	
	@Override
	public String getDailyWorkOut() {
		
		return "Practice your backhand volley";
	}


	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
