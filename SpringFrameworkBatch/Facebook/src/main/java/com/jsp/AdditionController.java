package com.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdditionController 
{
	@RequestMapping("/add")
	public void add()
	{
		System.out.println("Hiii");
	}

}
