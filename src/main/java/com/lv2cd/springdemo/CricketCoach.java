package com.lv2cd.springdemo;

public class CricketCoach implements Coach {
	//add new feilds
	private String emailAddress;
	private String team;

	//setters and getters for the feilds
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside the Setter Method to set email address");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside the Setter Method to set team name");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	private FortuneService fortuneService;

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside the Setter Method to set fortune");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice bowling, batting and fielding for 1 hr each from 6 am";
	}

	@Override
	public String getDailyFortune() {
		return "Todays Fortune: " + fortuneService.getFortune();
	}
}