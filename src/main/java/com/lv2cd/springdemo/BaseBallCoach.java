package com.lv2cd.springdemo;

public class BaseBallCoach implements Coach{

	//define a private feild for dependency
	private FortuneService fortuneService;

	//constructor for depedency injection
	public BaseBallCoach(FortuneService theFortune){
		fortuneService = theFortune;
	}
	@Override
	public String getDailyWorkout(){
		return "spend 30 min on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
