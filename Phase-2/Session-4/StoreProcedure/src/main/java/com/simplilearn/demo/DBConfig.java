package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConfig {
	
	public static Connection getConnection(Properties  props)
	{
		
		Connection connection=null;
		
		
		//get url,username,password
		//Load  driver
		
		try {
			Class.forName(props.getProperty("driver"));
			
			connection= DriverManager.getConnection(
					props.getProperty("url"),
					props.getProperty("username"),
					props.getProperty("password"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}

}
