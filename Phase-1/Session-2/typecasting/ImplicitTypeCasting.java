package com.simplilearn;

public class ImplicitTypeCasting {
	
	public static void main(String[] args) {
		
		byte a=10;
		
		System.out.println("Byte:" +a);
		
		short b=a;
		
		System.out.println("Converted Byte to Sort:"+b);
		
		int c=b;
		
		System.out.println("Converted sort to int:"+c);
		
		int d=a;
		
		System.out.println("Converted Byte to int:"+d);
		
		float e=d;
		
		System.out.println("Converted int to float:"+e);
		
		double f=e;
		
		System.out.println("Converted float to double:"+e);
		
		double g=d;
		System.out.println("Converted int to double:"+g);
	}
	

}
