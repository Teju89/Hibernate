package org.jsp.utility.controller;

import org.jsp.utility.services.RegistrationDao;
import org.jsp.utility.services.RegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController {
	@RequestMapping("/register")
	public ModelAndView register(@RequestParam("fn") String firstName, @RequestParam("mob") String mobile,
			@RequestParam("mail") String email, @RequestParam("pwd") String password) throws Exception {
		RegistrationDto dto = new RegistrationDto();
		dto.setFullName(firstName);
		dto.setEmail(email);
		dto.setMobile(mobile);
		dto.setPassword(password);

		RegistrationDao dao = new RegistrationDao();
		int result = dao.registrationDao(dto);
		ModelAndView mv = new ModelAndView();
		if (result > 0) {
			mv.setViewName("Login");
			mv.addObject("output", "Registration successfully!! Thank You");
		} else {
			mv.setViewName("Login");
			mv.addObject("index", "Please fill valid data");
		}
		return mv;
	}

}
