package com.simplilearn.arrays;

public class MultiDimenArray {
	
	public static void main(String[] args) {
		int array[][]= {{1,2,3},{3,6,1},{3,2,8}};
		
		System.out.println("Access the first row 2nd element: "+array[0][1]);
		//here 0th index : 1st row  , 1st index means 2nd row
		
		System.out.println("Access third row first element: "+array[2][0]);
		
		
		for(int row=0; row<3; row++) {
			
			for(int col=0; col<3; col++) {
				System.out.print(array[row][col]+"\t");
			}
		}
	}

}
