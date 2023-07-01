package com.jsp.SpringAOP;

public class InterupptedInternetConnection extends RuntimeException
{

	@Override
	public String toString() {
		return "Please check your internet connectivity...";
	}
	
}
