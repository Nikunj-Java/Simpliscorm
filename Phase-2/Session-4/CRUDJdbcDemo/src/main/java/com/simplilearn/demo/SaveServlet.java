package com.simplilearn.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class SaveServlet extends  HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out= resp.getWriter();
		
		Properties  props =  new Properties();
		
		InputStream in= getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		
		props.load(in);
		
		Connection  conn=DBConfig.getConnection(props);

		String name=req.getParameter("pname");
	
		BigDecimal price=new BigDecimal(req.getParameter("pprice"));
		
		
		if(conn!=null) {
			out.print("Connection Established");
			
			
			
			try {
				
				//CallableStatement stmt= conn.prepareCall("call add_product(?,?)");
				
				PreparedStatement stmt=conn.prepareStatement("insert into eproduct (name,price) values (?,?)");
				stmt.setString(1, name);
				stmt.setBigDecimal(2, price);
				
				int x= stmt.executeUpdate();
				
				if(x>0) {
					
					System.out.println("Data Inserted  Successfully");
					out.print("Data Inserted Successfully");
					resp.sendRedirect("list");
				}
				else {
					System.out.println("Error  While  Inserting a data");
					 
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else {
			out.print("Error While Connecting");
		}
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}
