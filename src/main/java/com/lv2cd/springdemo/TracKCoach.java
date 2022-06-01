package com.lv2cd.springdemo;

public class TracKCoach implements Coach {

	private FortuneService fortuneService;

	public TracKCoach(){

	}
	public TracKCoach(FortuneService theFortuneService){
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: "+fortuneService.getFortune();
	}

}
