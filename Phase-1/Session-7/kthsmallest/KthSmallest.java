package com.simplilearn.kthsmallest;

public class KthSmallest {
	
	int kthSmall(int arr[],int l,int r,int k) {
		
		if(k>0 && k<=r-l+1) {
			int pos = randomPartition(arr,l,r);
			
			if(pos -l == k-1) {
				return arr[pos]; //if the index is same as k then we found the smallest element
				
			}
			
			if(pos-l > k-1){ //if the index of partition element is more than k then recur for left part
				return kthSmall(arr, l, pos-1,k);
				
				//changed right=pos-1;
				 
				//if index is less than k then recur only its right part
				//change left =pos +1;
			}
			return kthSmall(arr, pos +1,r, k-pos+l-1);
		}
		return Integer.MAX_VALUE;
		
	}
	
	void swap(int arr[], int i, int j) {
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]= tmp;
	}
	
	//adjust the value in ascending order
	
	int partition (int arr[], int l, int r) {
		
		int x= arr[r],i=l;
		for(int j=1; j<=r-1;j++) {
			
			if(arr[j]<=x) {
				swap(arr,i,j);
			}
		}
		swap(arr,i,r);
		return i;
	}
	

	//method for partition
	private int randomPartition(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		
		int n= r-l+1; ///length of an array
		int pivot= (int) (Math.random())*(n-1);
		swap(arr,l+pivot,r);
		return partition(arr, l, r);
	}

}
