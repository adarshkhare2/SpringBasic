package com.Spapp4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//This class is working as XML file & main File

@Configuration

@ComponentScan(basePackages = "com.Spapp4") // With this annotation it will scan full package and annotaion that we have
											// use

public class MyApp {
	public MyApp() {
		System.out.println("MyApp.MyApp()");
	}

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MyApp.class);

	}
}
