package com.firstapp.spring;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	public BaseballCoach(FortuneService thefortuneservice) {
		fortuneservice = thefortuneservice;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}

}








