package com.daniharsh.dsa;

public class MaximumInRotated {

	public static int findMax(int[] a, int low, int high){
		int mid = low + (high - low) / 2;
		
		if(low == high)
			return a[low];
		
		if((high == low + 1) && a[low] >= a[high])
			return a[low];
		
		if((high == low + 1) && a[high] < a[low])
			return a[high];
		
		if(a[mid] > a[mid-1] && a[mid] > a[mid+1])
			return a[mid];
		
		if(a[mid] > a[mid-1] && a[mid] < a[mid+1])
			return findMax(a, mid+1, high);
		else
			return findMax(a, low, mid-1);
		
	}
	
	public static int findMaxInArray(int[] a){
		return findMax(a,0,a.length-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,5,6,7,1,2};
		System.out.println(findMaxInArray(arr));
		
	}

}
