package com.simplilearn.kthsmallest;

import java.util.Arrays;

public class KthSmallestSimpleSolution {
	
	
	public static int KthSmallest(Integer[] arr,int k) {
		
		Arrays.sort(arr);
		//we will return kth smallest element in the soreted array
		return arr[k-1];
	}
	
	public static void main(String[] args) {
		
		Integer arr[] =new Integer[] {28,16,46,38,55,89,83,30};
		
		int k=3;
		
		System.out.println("Kth smallest element is: "+KthSmallest(arr,k));
		
	}

}
