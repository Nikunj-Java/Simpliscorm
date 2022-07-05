package com.simplilearn.kthsmallest;

public class Main {
	
	public static void main(String[] args) {
		KthSmallest obj= new KthSmallest();
		
		int arr[]= {28,16,46,38,55,89,83,30};
		
		int left=0; //first index
		
		int n= arr.length;
		
		int right=n-1;//last index
		
		int k=3;
		
		System.out.println("Kth Smallest Element is: "+ obj.kthSmall(arr, left, right, k));
	}

}
