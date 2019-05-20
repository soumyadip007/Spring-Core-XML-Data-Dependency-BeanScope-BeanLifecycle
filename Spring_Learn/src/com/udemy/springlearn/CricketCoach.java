package com.udemy.springlearn;

public class CricketCoach implements Coach {

	
	// Literal Values
	private String email;
	private String team;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {

		System.out.println("Setter for email");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {

		System.out.println("Setter for team");
		this.team = team;
	}

	
	//Ref. for the class
	
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
