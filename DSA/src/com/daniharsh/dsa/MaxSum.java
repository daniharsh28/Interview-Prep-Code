package com.daniharsh.dsa;

public class MaxSum {
	
	// find the longest sequence having maximum summation
	
	public static int maxSum(int[] arr){
		int sum = 0;
		int maxsum = 0;
		for(int i=0;i<arr.length; i++){
			sum = sum + arr[i];
			if(maxsum< sum)
				maxsum = sum;
			else if (sum < 0)
				sum = 0;
		}
		return maxsum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-1,4,6,8,-9,-10,-12};
		System.out.println(maxSum(a));
		
	}

}
