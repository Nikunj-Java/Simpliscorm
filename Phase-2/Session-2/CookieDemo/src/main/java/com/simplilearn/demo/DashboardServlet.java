package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter  out= resp.getWriter();
		
		//read html content
		resp.setContentType("text/html");
		
		Cookie c[]=  req.getCookies();
		
		boolean found=  false;
		
		if(c!=null) {
			
			for(int i=0;i<c.length;i++) {
				Cookie ck=c[i];
				
				if(ck.getName().contentEquals("registered") &&ck.getValue()!=null) {
					out.print("User Found "+ck.getValue()+ "<br>");
					found=true;
				}
			}
			
		}
		if(!found) {
			out.print("User is not registetered  with us");
		}
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}
