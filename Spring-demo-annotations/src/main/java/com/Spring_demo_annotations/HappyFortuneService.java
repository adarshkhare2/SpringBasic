package com.Spring_demo_annotations;

import org.springframework.stereotype.Component;

@Component("happyFortuneService")

public class HappyFortuneService implements FortuneService {

	public String getFoutune() {
		return "Today is your lucky day";
	}

}
