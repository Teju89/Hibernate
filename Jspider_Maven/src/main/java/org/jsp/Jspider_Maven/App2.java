package org.jsp.Jspider_Maven;

import org.jsp.userDefinedClass.StudentInformation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 
{
	public static void main(String[] args) {
		//Spring IoC Container
		ApplicationContext context = new ClassPathXmlApplicationContext("sample.xml");
		StudentInformation info = (StudentInformation)context.getBean("studentObj");
		System.out.println("Student Name = " + info.name);
		System.out.println("Student RollNo = " + info.rollNo);
	}

}
