package com.simplilearn.methods;

public class Methods {
	
	//simple method without parameter
	public void print() {
		System.out.println("Methhod without return type and without parameter");
	}
	
	//method  returning nothing with 1 parameter
	public void display(String name) {
		
		System.out.println("My Name is: "+name);
	}
	
	//method with return type and one parameters
	public int cube(int n) {
		
		return n*n*n;
	}
	
	
	//method return string and with two parameters
	public String fullName(String fname,String lname) {
		
		return fname+" "+lname;
	}
	
	public static void main(String[] args) {
		Methods obj= new Methods();
		obj.display("Nikunj");
		String Name=obj.fullName("Rorisang", "JAVA FSD");
		
		System.out.println("Full name is: "+Name);
		
		
		int x=obj.cube(5);
		
		System.out.println("Cube of 5: "+x);
		
		System.out.println("Cube of 6: "+obj.cube(6));
		System.out.println("Full name is : "+obj.fullName("Nikunj", "JAVA FSD"));
		
		obj.print();
		
	}
	
	

}
