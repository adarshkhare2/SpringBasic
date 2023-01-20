package com.Spring_demo_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp 
{
    public static void main( String[] args )
    {
    	//load the config file
    	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	//Retrieve the bean 
    	Coach coach=context.getBean("thatSillyCoach",TennisCoach.class);
    	YogaCoach yogaCoach=context.getBean("yoga",YogaCoach.class);
    	
    	//call the method
    	System.out.println(coach.getDailyWorkout());
    	System.out.println(coach.getDailyFoutune());
    	System.out.println(yogaCoach.getDailyWorkout());
    	
    	//close the context
    	context.close();
    }
}
