package com.Spring_demo_annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp 
{
    public static void main( String[] args )
    {
    	//load the config file with annotation
    	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
    	
    	//Retrieve the bean 
    	Coach coach=context.getBean("thatSillyCoach",TennisCoach.class);
    	
    	//call the method
    	System.out.println(coach.getDailyWorkout());
    	System.out.println(coach.getDailyFoutune());
    	
    	//close the context
    	context.close();
    }
}
