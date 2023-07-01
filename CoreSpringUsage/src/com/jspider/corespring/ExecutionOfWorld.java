package com.jspider.corespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutionOfWorld 
{
	public static void main(String[] args) {
		//create object of world
		/* approach 1*/
		new World().walk();
		new World().drink();  
		/* It required more memory to store every instance of world object*/
		
		System.out.println("-------------------------------------------------");
		/* appraoch 2*/
		World world = new World();
		world.walk();
		world.drink();  
		
		//above both approach of creation of an object leads to BPC
		System.out.println("---------------------------------------------------");
		//3rd approach XML file approach.
		//Spring IoC Container
		ApplicationContext container = new ClassPathXmlApplicationContext("sample.xml");
		World world3 = (World)container.getBean("world");
		world3.drink();
		world3.walk();
	}
}
