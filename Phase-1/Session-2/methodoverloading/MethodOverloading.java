package com.simplilearn.methodoverloading;

public class MethodOverloading {
	
	
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b,int c) {
		return a+b+c;
	}
	
	float add(float a, float b) {
		return a+b;
	}

	double add(double a, double b) {
		return a+b;
	}
	 
	
	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		System.out.println("Addition if 2 int: "+obj.add(23, 4));
		System.out.println("Addition if 2 float: "+obj.add(23.0f, 9.78f));
		System.out.println("Addition if 2 doubles: "+obj.add(2.3, 6.7));
		System.out.println("Addition if 3 int: "+obj.add(4,6,9));
		
	}

}
