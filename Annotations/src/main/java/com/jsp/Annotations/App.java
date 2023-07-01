package com.jsp.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Spring IoC container
    	ApplicationContext context = new ClassPathXmlApplicationContext("sample.xml");
    	//get object form Spring IoC container
    	Mobile mobile1 = (Mobile)context.getBean("mob");
    	mobile1.gaming();
    	System.out.println(mobile1);
    	
    	/*Laptop laptop1 = (Laptop)context.getBean("lt");
    	laptop1.programming();
    	System.out.println(laptop1);
    	
    	Laptop laptop2 = (Laptop)context.getBean("lt");
    	System.out.println(laptop2);*/
    	
    	Laptop laptop1 = (Laptop)context.getBean("lt");
    	
    	System.out.println(laptop1);
    	
    }
}




















