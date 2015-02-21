package com.daniharsh.dsa;

public class CheckArrayNumAreZeroOrNot {
	public static boolean check(int[] a){
		int sum = 0;
		// Sort the array
		for(int i=0; i < a.length; i++){
			sum += a[i];
		}
		int sumLeft = 0;
		for(int i=0; i<a.length; i++){
			sumLeft += a[i];
			sum = sum - a[i];
			if(sumLeft == sum)
					return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {-4,1,2,3,4};
		System.out.println(check(a));
	}

}
