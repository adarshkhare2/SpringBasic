package com.Spapp4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DemoBean1 {
	@Value("Adarsh")
	private String name;
	//defaute constructor 
	public DemoBean1()
	{
		System.out.println("DemoBean1.DemoBean1()");
	}
	
	public String showName() {
		System.out.println("Name is "+ name);
		return null;
		
	}
}
