package Demospring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve the bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class); // Trackcoach class
		Coach theCoach1 = context.getBean("myCoach1", Coach.class);// Baseballcoach class
		Coach theCoach2 = context.getBean("myCoach2", Coach.class);// Yogacoach class

		// use the method
		System.out.println("----------------------Workout method---------------------------");

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach1.getDailyWorkout());
		System.out.println(theCoach2.getDailyWorkout());
		System.out.println("----------------------DailyFortune method---------------------------");

		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach1.getDailyFortune());
		System.out.println(theCoach2.getDailyFortune());
		System.out.println("----------------------add method---------------------------");

		System.out.println(theCoach.add());
		System.out.println(theCoach1.add());
		System.out.println(theCoach2.add());
		System.out.println("-------------------------------------------------");

		// close context
		context.close();
	}

}
