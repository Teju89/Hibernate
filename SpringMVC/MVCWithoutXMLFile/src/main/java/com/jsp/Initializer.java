package com.jsp;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//replacement of web.xml
//specify dispactcher servlet class
public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//replacement of <Servlet>
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {ApplicationConfiguration.class};
	}
	//replacement of <Servlet-mapping>
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
