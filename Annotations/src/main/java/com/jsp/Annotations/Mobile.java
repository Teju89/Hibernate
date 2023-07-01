package com.jsp.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//to create object whereas mob is a reference variable 
@Component("mob")
public class Mobile 
{
	@Value("realme")
	private String Brand;
	@Value("4")
	private int RAM;
	@Value("Black")
	private String color;
	/* Non-primitive datatype*/
	@Autowired
	private MobileCamera camera;
	
	public void gaming()
	{
		System.out.println("Gaming...");
	}

	@Override
	public String toString() {
		return "Mobile [Brand=" + Brand + ", RAM=" + RAM + ", color=" + color + ", camera=" + camera + "]";
	}

	
	
	
}
