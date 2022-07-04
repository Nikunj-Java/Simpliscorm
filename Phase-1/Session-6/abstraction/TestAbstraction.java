package com.simplilearn.abstraction;

public class TestAbstraction {
	
	public static void main(String[] args) {
		
		Shape s1= new Rectangle(2.2, 4.1, "Blue");
		Shape s2= new Circle(1.5, "Red");
		
		System.out.println(s1);
		
		System.out.println(s2);
	}

}
