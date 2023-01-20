package Demospring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		/* load config file */
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		/* Retrieve the bean */
		Coach theCoach= context.getBean("myCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		//close context
		context.close();
	}

}
