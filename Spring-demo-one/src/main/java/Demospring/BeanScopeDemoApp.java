package Demospring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		/* load config file */
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		/* Retrieve the bean */
		Coach theCoach= context.getBean("myCoach",Coach.class);
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		
		//use result to compare objects For prototype Bean
		boolean result= theCoach==alphaCoach;
		System.out.println("Pointing same Objects: " + result+"\n");
		
		System.out.println(theCoach + System.lineSeparator());
		System.out.println(alphaCoach+System.lineSeparator());
	
	}

}
