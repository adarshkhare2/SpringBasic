package com.Spapp7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	public Car()
	{
		System.out.println("Car started");
	
	}
	
	public String moveCar() {
		return "moveCar";
	}
	
}
