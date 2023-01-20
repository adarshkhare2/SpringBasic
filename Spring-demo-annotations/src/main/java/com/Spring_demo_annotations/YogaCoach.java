package com.Spring_demo_annotations;

import org.springframework.stereotype.Component;

@Component("yoga")
public class YogaCoach {
	public String getDailyWorkout() {
		return "Do streaching 10 min ";
		
	}
}
