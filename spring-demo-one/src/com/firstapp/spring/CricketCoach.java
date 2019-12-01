package com.firstapp.spring;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	private String emailAddress;
	private String team;
	
	
	public CricketCoach() {
		System.out.println("Inside the default constructor of CricketCoach");
	}
	
	public void setFortuneService(FortuneService fortuneservice) {
		System.out.println("Inside setter function of CricketCoach");
		this.fortuneservice=fortuneservice;
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside set emailAddress method");
		this.emailAddress = emailAddress;
	}
	
	public void setTeam(String team) {
		System.out.println("Inside set team method");
		this.team = team;
	}
	
	//methods to return the values
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public String getTeam() {
		return team;
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
