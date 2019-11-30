package com.firstapp.spring;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getFortune() {
		return "Just do it:" + fortuneservice.getFortune();
	}

}










