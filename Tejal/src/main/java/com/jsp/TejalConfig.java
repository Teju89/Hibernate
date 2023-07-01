package com.jsp;

import javax.servlet.http.HttpServlet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.jsp")
public class TejalConfig extends WebMvcConfigurationSupport
{
	@Bean
	public InternalResourceViewResolver getViewResolver()
	{
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setPrefix("/");
		view.setSuffix(".jsp");
		return view;
	}
}
