package com.simplilearn;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your age");
		
		int age=sc.nextInt();
		
		if(age>18) {
			System.out.println("you are eliglible for voting");
		}
		else {
			System.out.println("You are not eliglible to vote");
		}
		
		
	}
}
