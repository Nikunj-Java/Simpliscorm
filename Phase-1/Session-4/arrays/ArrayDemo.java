package com.simplilearn.arrays;

public class ArrayDemo {

	
	public static void main(String[] args) {
		
		int array[]= {12,23,45,34,56,67,78};
		
		System.out.println("Array size: "+array.length);
		
		System.out.println("Element at index 4: "+array[4]);
		
		System.out.println("access same using loop");
		
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]+" ,");
		}
		System.out.println();
		System.out.println("For each loop");
		
		
		for(int a:array) {
			System.out.println(a+" ,");
		}
	}
}
