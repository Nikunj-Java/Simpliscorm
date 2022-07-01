package com.simplilearn.exceptionhandling;

public class ExceptionHandlingDemo {
	
	public static void main(String[] args) {
		
		
		int sum=4;
		
		for(int i=0; i<args.length;i++) {
			
			try {
				//risky code //code which is going to throw an error
				sum=sum+Integer.parseInt(args[i]);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception Occurred: "+e);
			}
			
		}
		
		System.out.println("Sum is: "+sum);
	}

}
