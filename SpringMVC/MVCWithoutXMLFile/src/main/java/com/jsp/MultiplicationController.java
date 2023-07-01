package com.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.services.MultiplicationServices;

@Controller
public class MultiplicationController 
{
	@RequestMapping("/multiplication")
	public ModelAndView multiplication(@RequestParam("first") int num1,@RequestParam("second") int num2)
	{
		MultiplicationServices service = new MultiplicationServices();
		int output = service.multi(num1, num2);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displayOutput");
		mv.addObject("result", output);
		
		return mv;
	}
}
