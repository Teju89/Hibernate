package com.jsp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//representation of dispatcher servlet
//replacement of demo-servlet-xml file
@Configuration
@ComponentScan(basePackages = "com.jsp")
public class ApplicationConfiguration 
{
	//complete view --> complete response
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}
