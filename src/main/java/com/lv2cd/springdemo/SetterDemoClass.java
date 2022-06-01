package com.lv2cd.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoClass {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive bean from spring container
		CricketCoach theCricketCoach = applicationContext.getBean("myCricketCoach", CricketCoach.class);
		//call methods on bean
		System.out.println(theCricketCoach.getDailyWorkout());

		System.out.println(theCricketCoach.getDailyFortune());
		//call new methods to get literal values
		System.out.println(theCricketCoach.getEmailAddress());
		System.out.println(theCricketCoach.getTeam());
		//close the contxt
		applicationContext.close();
	}
}
