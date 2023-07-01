package com.jspiders.ReplacementOfXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Udemy {

	private Payment pay;

	public Payment getPay() {
		return pay;
	}

	@Autowired //confused whether to access googlepay object or to access phonepay
	@Qualifier("phonepe")
	public void setPay(Payment pay) {
		this.pay = pay;
	}
	
	public void courses()
	{
		System.out.println("flat 20% discount...");
	}
}
