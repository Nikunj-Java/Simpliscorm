package com.simplilearn.exceptionhandling;

public class Handling3 {
	
	static void divide(int a, int b) {
		//throw uncheched exception
		int c= a/b;
		System.out.println("Result: "+c);
	}

	public static void main(String[] args) {
		
		try {
			divide(3,0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
			//e.printStackTrace();
		}
				
		
	}
}
