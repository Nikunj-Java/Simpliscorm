package com.simplilearn.checkedexception;

import java.sql.DriverManager;

public class Demo3 {

	public static void main(String[] args) {
		
		//compile time: SQLException
		DriverManager.getConnection("");
	}
}
