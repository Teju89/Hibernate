package com.jsp.SpringAOP;

import org.springframework.stereotype.Component;

//old features
@Component
public class Instagram 
{
	//core-concern
	public void chats()
	{
//		throw new InterupptedInternetConnection();
		System.out.println("Chatting with friends...");
	}
	
	public void message()
	{
		System.out.println("Message received...");
	}
	
	public void post()
	{
		throw new InterupptedInternetConnection();
		//System.out.println("No. of posts are 100");
	}
}
