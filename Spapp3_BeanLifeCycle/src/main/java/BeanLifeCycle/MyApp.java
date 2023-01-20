package BeanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) throws Exception {
		//creating ioc/spring container
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("Spapp3.xml");
		
		//getting bean from container so it will scan all class methods then we can use those 
		MyBean myBean=context.getBean(BeanLifeCycle.MyBean.class);
		
		//closing ioc cotainer
		context.close();
	}

}
