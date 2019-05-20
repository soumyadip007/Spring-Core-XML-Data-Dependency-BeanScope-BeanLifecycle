package com.udemy.springlearn;

public class CricketCoach implements Coach {

	private FortuneService  fortuneService; 
	
	//Create no-arg constructor
	public CricketCoach()
	{
		System.out.println("Inside No-arg Cricket coach constructor");
	}
	
	//Our Setters Methods
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside No-arg Cricket coach fortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout()
	{
		return "PLay 30 mins daily";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortuneService();
	}
	
	
	
}
