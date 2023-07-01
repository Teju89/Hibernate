package com.jsp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
/* Spring class  ---> operations */
@Controller
public class AdditionController 
{
	/* to map dispatcher servlet with method of controller*/
	/* Handler mapping*/
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("first") int num1,@RequestParam("second") int num2)
	{
		//System.out.println("Hii How r u?");
		int result = num1 + num2;
		
		//return model and view object 
		/*
		 * model --> final output which has to be print on web page --> summation (store result variable)
		 * view --> file which used to print output. --> output.jsp
		 */
		ModelAndView mv = new ModelAndView();
		mv.setViewName("output.jsp");
		mv.addObject("op",result);
		
		return mv;
		
		//return "output.jsp";
	}
}
