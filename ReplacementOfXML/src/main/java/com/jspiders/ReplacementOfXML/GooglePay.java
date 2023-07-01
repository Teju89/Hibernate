package com.jspiders.ReplacementOfXML;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GooglePay implements Payment{
	
	@Value("GP1234567890")
	private String transactionId;
	
	public void pay()
	{
		System.out.println("Payment successful by google pay...");
	}

	@Override
	public String toString() {
		return "GooglePay [transactionId=" + transactionId + "]";
	}

	
}
