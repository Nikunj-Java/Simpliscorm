package com.simplilearn.demo;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter1 implements Filter {

	
	public void destroy() {
		
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		String name= request.getParameter("username");
		if(name!=null) {
			chain.doFilter(request, response);
		}
		else {
			response.getWriter().print("Invalid User");
		}
		
	}
	
	public void init (FilterConfig fConfig) throws ServletException{
		
	} 

}
