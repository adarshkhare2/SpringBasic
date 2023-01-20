package com.Spapp4;

import org.springframework.context.annotation.Configuration;

//@Configuration
//@Component
public class DateOfBrithBean {
	
	public String dobMethod() {
		System.out.println("DateOfBrithBean.dobMethod()");
		return "dobMethod";
	}
	public int dobMethodint() {
		return 5;
		
	}
	protected char dobMethodchar() {
		return 'A';
		
	} 
}
