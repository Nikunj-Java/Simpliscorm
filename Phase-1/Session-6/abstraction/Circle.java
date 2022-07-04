package com.simplilearn.abstraction;

public class Circle extends Shape {
	
	private double radius;

	public Circle(double radius,String color) {
		super(color);
		// TODO Auto-generated constructor stub
		
		this.radius=radius;
	}

 
	double area() {
		 return Math.PI* Math.pow(radius, 2);
	}
	
	@Override
	 public String toString() {
		 return "Circle Color=" +getColor()+ " and Area is= "+area();
	 }

}
