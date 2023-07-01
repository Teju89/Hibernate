package com.jsp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Sample {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("num1")int j, @RequestParam("num2") int i)
	{
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
		int add = i + j;
		ModelAndView model = new ModelAndView();
		model.setViewName("output");
		model.addObject("result",add);
//		System.out.println("Hello world...");
//		return "output.jsp";
		return model;
	}
}
