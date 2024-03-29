package Demospring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml") ;		
		
		//Retrieve the bean file
		CricketCoach thecoach3= context.getBean("myCoach3",CricketCoach.class);
		
		
		//call the method
		System.out.println("Cricket Coach said "+thecoach3.getDailyFortune());
		System.out.println(thecoach3.getEmail());
		System.out.println(thecoach3.getTeam());
		
		//close context
		context.close();
	}

}
