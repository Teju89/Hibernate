package com.jspiders.ReplacementOfXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /* Spring IoC container*/
    	ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//    	Payment payment = (Payment)context.getBean("payment1");
//    	payment.pay();
//    	System.out.println(payment);
//    	
//    	Payment payment2 = (Payment)context.getBean("payment2");
//    	payment2.pay();
//    	System.out.println(payment2);
    	Payment payment = (Payment)context.getBean("googlePay");
    	payment.pay();
    	System.out.println(payment);
    	Payment payment2 = (Payment)context.getBean("phonepe");
    	payment2.pay();
    	System.out.println(payment2);
    	
    	
    	Udemy u1 = (Udemy)context.getBean("udemy");
    	u1.courses();
    	System.out.println(u1.getPay());
    	
    }
}


























