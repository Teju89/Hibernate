package com.jsp.SpringAOP;

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
       //Spring IoC Container
    	/*
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Instagram insta =(Instagram)context.getBean("instagram");*/
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    	context.scan("com.jsp.SpringAOP");
    	context.refresh();
    	
    	Instagram insta = (Instagram) context.getBean("instagram");
    	insta.chats();
    	insta.message();
    	insta.post();
    }
}
