package com.lv2cd.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext contxt = new ClassPathXmlApplicationContext("applicationContext.xml");

		//retrive the bean from the spring container
		Coach thecoach = contxt.getBean("myCoach", Coach.class);

		//call methods on the bean
		System.out.println(thecoach.getDailyWorkout());

		System.out.println(thecoach.getDailyFortune());

		//close the context
		contxt.close();

	}
}
