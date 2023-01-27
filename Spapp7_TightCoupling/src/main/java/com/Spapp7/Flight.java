package com.Spapp7;

import org.springframework.stereotype.Component;

@Component
public class Flight {
	public Flight()
	{
		System.out.println("Flight started");
	
	}
	
	
	public String moveFlight() {
		return "moveFlight";

	}
}
