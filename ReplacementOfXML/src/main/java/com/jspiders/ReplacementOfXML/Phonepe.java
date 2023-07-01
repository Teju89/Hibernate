package com.jspiders.ReplacementOfXML;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phonepe implements Payment
{
	@Value("TSP12345678")
	private String transactionId;
	
	public void pay()
	{
		System.out.println("Paying via PhonePe...");
	}

	@Override
	public String toString() {
		return "Phonepe [transactionId=" + transactionId + "]";
	}
	
	

}
