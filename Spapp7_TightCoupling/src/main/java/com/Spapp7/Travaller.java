package com.Spapp7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Travaller {
	
	public Travaller()
	{
		System.out.println("Travaller.Travaller()");
	}
	
	public Car car;
	public Flight flight;

	
	public String startTravle() {
		car.moveCar();
		
		flight.moveFlight();
		
		return"startTravle";
	}
	
}
