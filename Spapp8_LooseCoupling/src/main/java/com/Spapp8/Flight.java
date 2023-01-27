package com.Spapp8;

import org.springframework.stereotype.Component;

@Component
public class Flight implements Vehical  {
	public Flight()
	{
		//System.out.println("Flight started");
	
	}

	public String move() {
		// TODO Auto-generated method stub
		return "Flight";
	}
	

}
