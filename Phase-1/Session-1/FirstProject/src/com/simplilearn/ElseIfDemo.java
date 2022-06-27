package com.simplilearn;

import java.util.Scanner;

public class ElseIfDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Percentage");
		
		int percentage=sc.nextInt();
		
		
		if(percentage>=70 && percentage<=100) {
			System.out.println("Congratulation! You have Scored Distinction");
		}
		else if(percentage>=60 && percentage<70) {
			System.out.println("Congratulation! You have Scored First Class");
		}
		else if(percentage>=50 && percentage<60) {
			System.out.println("Congratulation! You have Scored Second Class");
		}
		else if(percentage>=35 && percentage<50) {
			System.out.println("Congratulation! You have Scored Pass Class");
		}
		else if(percentage>=00 && percentage<35) {
			System.out.println("Opps! You have Failed");
		}
		else
			System.out.println("Enter Correct Percentage");
	}
}
