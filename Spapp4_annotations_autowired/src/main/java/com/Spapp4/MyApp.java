package com.Spapp4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spapp4.xml");
		
		Student student= context.getBean("student",Student.class);
		
		
		System.out.println(student);
		
		context.close();

	}
}
