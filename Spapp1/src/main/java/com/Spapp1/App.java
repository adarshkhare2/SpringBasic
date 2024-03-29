package com.Spapp1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {

//System.out.println("AdditionStart.....!");
// To load config file
// 1.Resource resource = new FileSystemResource("applicationContext.xml");
// 2.Resource resource = new ClassPathResource("applicationContext.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
// BeanFactory factory= new XmlBeanFactory(resource);
		AdditionBean additionBean = context.getBean("obj1", AdditionBean.class);
		SubtractionBean subtractionBean = context.getBean("obj2", SubtractionBean.class);
		Student student = context.getBean("myStudent", Student.class);
		DateOfBrithBean dateOfBrithBean = context.getBean("myDOB", DateOfBrithBean.class);

		System.out.println("Addition Of Two numbers:- " + additionBean.doSum() + System.lineSeparator());
		System.out.println("Subtraction Of Two numbers:- " + subtractionBean.doSum() + System.lineSeparator());
		System.out.println("Student :- " + student + System.lineSeparator());
		System.out.println("Date OF Brith :- " + dateOfBrithBean + System.lineSeparator());
		System.lineSeparator();// User to change line

//Dependency in Collections
		IpsEngCollage ipsEngCollage = context.getBean("IpsEng", IpsEngCollage.class);
		ipsEngCollage.printstudentName();
		ipsEngCollage.printstudentRollno();
		ipsEngCollage.printbranchDetails();
		ipsEngCollage.printbranchInfos();

// System.out.println(context);
		context.close();

	}
}
