package com.simplilearn.exceptionhandling;

public class Handling6 {
	
	static void check(int age) {
		if(age<18)
					throw new ArithmeticException("Not Valid age Exception");//customise exception
		else
			System.out.println("Valid User");
			
	}
	
	 
	
	public static void main(String[] args) {
		try {
			check(6); //handle this using try and catch
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		 
	}

}
