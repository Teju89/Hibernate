package org.jsp.annotation2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sample.xml");
		Book book = (Book)context.getBean("book");
		
		System.out.println("Book Id = " + book.getBookId());
		System.out.println("Book name = " + book.getBookname());
		System.out.println("Book Price = " + book.getPrice());
		System.out.println("Author = " + book.getAuthor());
	}

}
