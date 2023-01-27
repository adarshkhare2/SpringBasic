package com.Spapp8;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Vehical {
	
	public Car()
	{
		//System.out.println("Car started");
	
	}

	public String move() {
		return "Car";
	}
	
	
}
