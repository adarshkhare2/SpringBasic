package com.Spapp4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.stereotype.Component;
@Configuration
//@Component
public class Student {
	@Autowired
	protected DateOfBrithBean dateOfBrithBean;
	@Bean
	protected String studentmethod() {
		System.out.println("Student.studentmethod()");
		return dateOfBrithBean.dobMethod();
		
	}
	
	  @Bean protected int studentmethod1() {
	  System.out.println("Student.studentmethod()"); return
	  dateOfBrithBean.dobMethodint();
	  
	  }
	  
	  @Bean protected char studentmethod2() {
	  System.out.println("Student.studentmethod()"); return
	  dateOfBrithBean.dobMethodchar();
	  
	  }
	 
}
