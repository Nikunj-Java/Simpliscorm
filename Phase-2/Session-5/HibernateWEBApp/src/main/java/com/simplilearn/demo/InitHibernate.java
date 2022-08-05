package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

 
@WebServlet("/init")
public class InitHibernate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		
		//connection pool
		SessionFactory factory= HibenateUtil.getSessionFactory();
		
		// connection
		
		Session session= factory.openSession();
		
		out.println("Hibernate Session Opened");
		
		
 
		
		Student s1= new Student();
		s1.setName("Rorisang");
		s1.setEmail("rorisang@gamil.com");
		s1.setPassword("rs@123");
		
		Transaction tx=session.beginTransaction();
		session.save(s1);
		
		tx.commit();
		//automatically table created in db and data inserted in the same
		
		session.close();
		factory.close();
		 
		out.println("Hibernate Session closed");
		System.out.println("Data Inserted Successfully");
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}