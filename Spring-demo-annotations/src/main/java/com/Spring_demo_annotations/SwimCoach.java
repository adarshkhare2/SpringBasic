package com.Spring_demo_annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	

	public SwimCoach(FortuneService thefortuneService) {
		this.fortuneService = thefortuneService;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do swim 1000 meater's";
	}

	public String getDailyFoutune() {
		// TODO Auto-generated method stub
		return fortuneService.getFoutune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	

}
