package com.Spring_demo_annotations;

import org.springframework.stereotype.Component;
@Component
public class DatabaseService implements FortuneService {

	public String getFoutune() {
		// TODO Auto-generated method stub
		return "DatabaseService";
	}

}
