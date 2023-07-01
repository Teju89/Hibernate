package org.jsp.Jspider_Maven;

import org.jsp.userDefinedClass.Book;
import org.jsp.userDefinedClass.StudentInformation;
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
    	//to get object from IoC Container
    	StudentInformation info = (StudentInformation)context.getBean("student");
    	System.out.println(info);
    	info.study();
    	
    	StudentInformation info2 = (StudentInformation)context.getBean("student");
    	System.out.println(info2);
    	
    	System.out.println("---------------------------------------");
    	
    	//to get object of book class
    	Book book = (Book)context.getBean("bookObj");
    	System.out.println(book);
    	book.addBook();
    	
    	//to get 2nd object 
    	Book book1 = (Book)context.getBean("bookObj");
    	System.out.println(book1);
    }
}
