package com.Spring_demo_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeBeanDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
	 	Coach coach=context.getBean("thatSillyCoach",TennisCoach.class);
	 	Coach alpCoach=context.getBean("thatSillyCoach",TennisCoach.class);

    	boolean result= (coach==alpCoach);
    	
    	System.out.println("Both instant pointing same location :-"+result);
    	
    	context.close();
	}

}
