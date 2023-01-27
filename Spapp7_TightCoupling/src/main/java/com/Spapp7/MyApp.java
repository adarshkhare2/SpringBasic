package com.Spapp7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@ComponentScan(basePackages = "com.Spapp7") // With this annotation it will scan full package and annotaion that we have
											// use

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(com.Spapp7.MyApp.class);

		Travaller travaller = context.getBean(Travaller.class);

	}

}
