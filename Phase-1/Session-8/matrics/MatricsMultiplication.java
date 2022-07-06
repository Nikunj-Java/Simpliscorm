package com.simplilearn.matrics;

public class MatricsMultiplication {
	
	public static void main(String[] args) {
		 int r1=2, c1=3;
		 int r2=3, c2=2;
				 
				
		 int [][] firstMatrics = {{3,-2,5},{3,0,4}};
		 int [][] secondMatrics= {{2,3},{-9,0},{0,4}};
		 
		 //method to multiply matrics
		 
		 int[][] product= multiplyMatrics(firstMatrics,secondMatrics,r1,c1,c2);
		
		 //to display the result of multiplication
		 displayProduct(product);
		 
	}

	

	private static int[][] multiplyMatrics(int[][] firstMatrics, int[][] secondMatrics, int r1, int c1, int c2) {
		// TODO Auto-generated method stub
		
		int [][]product= new int[r1][c2];//resultant matrics
		for(int i=0; i<r1; i++) {
			for(int j=0;j<c2; j++) {
				for(int k=0; k<c1;k++) {
					product[i][j]+=firstMatrics[i][k]*secondMatrics[k][j];
				}
			}
		}
		return product;
	}
	
	private static void displayProduct(int[][] product) {
		// TODO Auto-generated method stub
		
		System.out.println("Product of two matrices is : ");
		
		for(int[] row: product) {
			
			for(int column: row) {
				System.out.print(column+ "   ");
			}
			System.out.println();
		}
		
	}

}
