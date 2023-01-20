package com.Spring_demo_annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp 
{
    public static void main( String[] args )
    {
    	//load the config file with annotation
    	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
    	
    	//Retrieve the bean 
    	SwimCoach coach=context.getBean("swimCoach",SwimCoach.class);
    	
    	//call the method
    	System.out.println(coach.getDailyWorkout());
    	System.out.println(coach.getDailyFoutune());
    	System.out.println(coach.getEmail()+"   " +coach.getTeam());//Printing data from properties file
    	//close the context
    	
    	context.close();
    }
}
