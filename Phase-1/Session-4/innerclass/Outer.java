package com.simplilearn.innerclass;

public class Outer {
	
	public int a=20;
	private String b="Welcome";
	
	
	class Inner{
		
		public void display() {
			
			System.out.println("Value of a: "+a);
			System.out.println("Value of b: "+b);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		//preparing object of outer class
		Outer outer= new Outer();
		
		//preparing object of inner class using outerclass
		Outer.Inner inner=outer.new Inner();
		
		//accessing innerclass method
		inner.display();
		
	}

}
