package org.jsp;

import java.lang.reflect.Method;

public class Sample {
	public void run()
	{
		System.out.println("Show...");
	}
	
	public static void main(String[] args) {
		try {
			Class.forName("org.jsp.Sample").newInstance();
			 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
