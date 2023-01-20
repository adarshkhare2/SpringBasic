package com.Spapp4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Student.class,DateOfBrithBean.class);

		Student student = context.getBean(Student.class);
		
		System.out.println(student.studentmethod());
		System.out.println(student.studentmethod1());
		System.out.println(student.studentmethod2());

		
	}
}
