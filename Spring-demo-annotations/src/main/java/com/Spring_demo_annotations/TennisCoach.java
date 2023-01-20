package com.Spring_demo_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.*;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach") // [theSillyCoach is bean id][default bean iD=tennisCoach]
@Scope("prototype")//This annotation will create new instants every time for alpCoach
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService") // @Qualifier use for calling special class like here HappyFortuneService.

	private FortuneService fortuneService;

	public String getDailyWorkout() {
		return "Prectice back hand volly";
	}

	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	public String setFortuneService(FortuneService fortuneService) {
		System.out.println("setter autowired :- inside TennisCoach.setFortuneService()");
		return fortuneService.getFoutune();
	}

	public String getDailyFoutune() {
		// TODO Auto-generated method stub
		return fortuneService.getFoutune();
	}
	
	  @PostConstruct
	  public void domystartupstuff() {
	  System.out.println("TennisCoach class :- inside the domystartupstuff()"); }
	  
	  @PreDestroy
	  public void domycleanup() {
	  System.out.println("inside the docleanup"); }
	 
}
