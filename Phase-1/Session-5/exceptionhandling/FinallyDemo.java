package com.simplilearn.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Any Value");
		
		try {
			
			//risky code
			int num= sc.nextInt();
			
			System.out.println("Value: "+num);
			
		} catch (InputMismatchException e) {
			// TODO: handle exception
			
			System.out.println("Wrong Input: "+e);
		}
		finally {
			sc.close();
			System.out.println("Scanner Closed Successfully");
		}
		
	}

}
