package com.pureJavaConfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class HeyTommyPickMe extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		Class[] dispatcher= {SpringApplicationContext.class};
		return dispatcher;
	}

	@Override
	protected String[] getServletMappings() {
		
		String[] mapping= {"/"};
		
		return mapping;
	}

}
