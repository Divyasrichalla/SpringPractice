package com.lv2cd.springdemo;

import java.util.Random;

public class NewFortuneService implements FortuneService{
	// three fortunes in an array.
	private String[] data = {"Beaware ", " Best Day ever", "going to meet a new partner in ur journey"};
	//random number generator
	private Random myRandom = new Random();



	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}
}
