package com.daniharsh.dsa;

public class MergeSortedArrayInPlace {

	public static int[] merge(int[] a, int m, int[] b, int n){
		int lena = a.length - 1;
		int lenb = b.length - 1;
		int ia = m-1;
		int ib = n-1;
		while(ia > 0 && ib > 0){
			if(a[ia] > a[ib])
				a[lena] = a[ia];
			else
				a[lena] = a[ib];
		lena --;
		return a;
		}
		return b;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i=0; i<5; i++)
			arr[i] = i;
		
		int[] arr1 = new int[5];
		for(int i=0;i<5;i++)
			arr1[i] = i+5;
	}

}
