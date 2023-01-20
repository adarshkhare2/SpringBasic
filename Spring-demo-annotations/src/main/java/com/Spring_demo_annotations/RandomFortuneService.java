package com.Spring_demo_annotations;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component

public class RandomFortuneService implements FortuneService {

	private String[] data= {"1.Good day",
							"2.Normal day",
							"3.Batter day",
							"4.Bad day"};
	
	private Random myRandom= new Random();
	
	
	public String getFoutune() {
		int index= myRandom.nextInt(data.length);
		String thefortune = data[index];
		return "This is Your RandomFortune For Today :- "+ thefortune;
	}

}
