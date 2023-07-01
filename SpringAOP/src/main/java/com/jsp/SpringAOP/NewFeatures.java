package com.jsp.SpringAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/* pointcut - exact location of new feature
 * when - advice*/
@Aspect
@EnableAspectJAutoProxy
@Component
public class NewFeatures 
{
	/* before chat section execute this method
	 * @Before is an advice
	 * chats is a pointcut*/
	@Before("execution (public void chats())")
	public void shareYourThoughts() /* cross-cutting concern*/
	{
		System.out.println("Thoughts updated successfully...");
	}
	/* Pointcut - message()
	 * advice - after*/
	@After("execution (public void message())")
	public void reactOnMessages()
	{
		System.out.println("Reacted on message with smiley");
	}
	/* if old feature execution is successful then execute new feature*/
	@AfterReturning("execution (public void chats())")
	public void changeThemeOfChat()
	{
		System.out.println("Theme of chat updated");
	}
	
	/* if old feature execution is unsuccessful then execute new feature*/
	@AfterThrowing("execution(public void post())")
	public void reels()
	{
		System.out.println(" reels Posted successfully...");
	}
}













