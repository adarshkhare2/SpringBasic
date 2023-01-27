package Spapp9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = "Spapp9")
@Configuration
public class MyApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MyApp.class);

		C3 c3 = context.getBean(C3.class);

		System.out.println(c3.c2.c1.d);

		System.out.println(c3.job1());

	}

}
