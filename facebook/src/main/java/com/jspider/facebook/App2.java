package com.jspider.facebook;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 
{
	public static void main(String[] args) 
	{
		//Spring IoC Container
		ApplicationContext context = new ClassPathXmlApplicationContext("setters.xml");
		
		Student s1 = (Student)context.getBean("student1");
		System.out.println("Name = " + s1.getName() );
		System.out.println("Percentage = " + s1.getPercentage());
		System.out.println("Roll No = " + s1.getRollNo());
		
		Student s2 = (Student)context.getBean("student2");
		System.out.println("RollNo : " + s2.getName());
		System.out.println("Name : " + s2.getPercentage());
		System.out.println("Percentage : " + s2.getPercentage());
		System.out.println("College : name = " + s2.getCollege().getCname() 
				+ ", id = " + s2.getCollege().getcId());
	}

}
