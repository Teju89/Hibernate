package com.jspider.corespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutionOfWorld2 
{
	public static void main(String[] args) 
	{
		/* 2nd approach */
		World world = new World();
		world.walk();
		world.drink();
		/* access object from xml file*/
		ApplicationContext context = new ClassPathXmlApplicationContext("sample.xml");
		World world2 = (World)context.getBean("world");
		world2.drink();
		world2.walk();
	}
}
