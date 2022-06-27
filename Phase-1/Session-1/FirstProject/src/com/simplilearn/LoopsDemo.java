package com.simplilearn;

public class LoopsDemo {
	
	public static void main(String[] args) {
		int i=0;
		
		//while demo
		while(i<=5) {
			System.out.println("Using While :"+i);
			i++;
		}
		
		///do while
		do {
			System.out.println("Using Do While: "+i);
			i++;
		}
		while(i<=10);
		
		//for loop
		for(i=1;i<=5;i++) {
			System.out.println("Using for loop: "+i);
		}
		
		System.out.println(i);
		 

	}
}
