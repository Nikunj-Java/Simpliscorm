package com.simplilearn.calculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		
		//store two numbers
		double num1,num2;
		
		//take input from user
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Numbers");
		
		
		//take the inputs
		
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		
		System.out.println("Choose the operator(+,-,*,/)");
		
		
		char operator= sc.next().charAt(0);
		
		double output=0;
		
		
		switch(operator) {
		
		case '+':
			output= num1+num2;
			//case to Add two numbers
			break;
			
		case '-':
			output= num1-num2;
			//case to Subtract two numbers
			break;
			
		case '*':
			output= num1*num2;
			//case to Multiply two numbers
			break;
			
		case '/':
			output= num1/num2;
			//case to Divide two numbers
			break;
		default:
			System.out.println("You enter wrong input");
			break;
			
	
		
		}
		
		System.out.println("Final Result: ");
		System.out.println();
		
		System.out.println(num1+"  "+operator+" "+num2+ "= "+output);
		
		
		
	}

}
