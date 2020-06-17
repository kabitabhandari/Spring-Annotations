package com.code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component  
public class RandomFortuneService implements FortuneService {
	//create an array of Strings
	
	private String[] myArray = new String[] {"work harder", "think positive", "look ahead"};
	//private String[] myArray = {"work harder", "think positive", "look ahead"};

	
	// create random number generator
	private Random myRandom = new Random();
	
	
	
	@Override
	public String getFortune() {
		// pick a random string from array
		
		int index = myRandom.nextInt(myArray.length);
		String theFortune = myArray[index];
		return theFortune;
	}

}
