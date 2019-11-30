package com.firstapp.spring;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	public CricketCoach() {
		System.out.println("Inside the default constructor of CricketCoach");
	}
	
	public void setFortuneService(FortuneService fortuneservice) {
		System.out.println("Inside setter function of CricketCoach");
		this.fortuneservice=fortuneservice;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice cover drive for 15 minutes";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}

}
