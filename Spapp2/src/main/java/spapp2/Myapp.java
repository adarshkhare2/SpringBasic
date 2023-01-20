package spapp2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Myapp {

	public static void main(String[] args) {
		// implementing IOC contaner
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spapp2.xml");

		// get bean from contener
		MyBean2 bean = context.getBean("myBean2", MyBean2.class);

		// use bean from conterer with method
		bean.showMsg();

		// close the ioc contaner
		context.close();

	}

}
