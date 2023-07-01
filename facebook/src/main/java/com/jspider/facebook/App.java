package com.jspider.facebook;

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
    	//Spring IoC Container
        ApplicationContext context = new ClassPathXmlApplicationContext("sample.xml");
        Employee emp1 = (Employee)context.getBean("emp");
        System.out.println(emp1);
        
        Employee employee2 = (Employee)context.getBean("emp2");
        System.out.println(employee2);
        
        Employee employee3 = (Employee)context.getBean("emp3");
        System.out.println(employee3);
        
        Employee employee4 = (Employee)context.getBean("emp4");
        System.out.println(employee4);
        
        Employee employee5 = (Employee)context.getBean("emp5");
        System.out.println(employee5);
    }
}
