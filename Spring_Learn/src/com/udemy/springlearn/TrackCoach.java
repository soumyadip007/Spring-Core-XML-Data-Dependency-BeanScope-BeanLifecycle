package com.udemy.springlearn;

public class TrackCoach implements Coach {  //Auto Generated Class

	private FortuneService  fortuneService; 
		
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
	super();
	this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do Practice : "+fortuneService.getFortuneService();
	}
	
	//Add an Init-Method
	public void doMyStartupStuff() {
		// TODO Auto-generated method stub
		System.out.println("Trackcoach : Executing Init-Method");
	}
	
	
	//Add an destroy method
	public void destroyMyStartupStuff() {
		// TODO Auto-generated method stub
		System.out.println("Trackcoach : Executing Destroy-Method");
	}
	
}
