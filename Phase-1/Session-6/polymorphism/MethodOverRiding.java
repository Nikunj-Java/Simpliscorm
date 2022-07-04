package com.simplilearn.polymorphism;


class parent{
	
	public void test() {
		System.out.println("this is parent class");
	}
}

class Child extends parent{
	
	public void test() {
		super.test(); //can call  parent method
		System.out.println("this is child class method");
	}
}


public class MethodOverRiding {
	
	//in java method overriding occurs when a subclass (childclass) 
	//has the same method as the parent class
	
	public static void main(String[] args) {
		
		Child c= new Child();
		c.test();
		
		//parent p= new parent();
		//p.test();
		
		//below code will throw classCastException
		//Child c1=(Child) new parent();
		//c1.test();
		
	}
	

}

