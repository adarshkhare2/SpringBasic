package com.Spring_demo_annotations;

import org.springframework.stereotype.Component;

@Component
public class RestService implements FortuneService {

	public String getFoutune() {
		return "RestService";
	}

}
