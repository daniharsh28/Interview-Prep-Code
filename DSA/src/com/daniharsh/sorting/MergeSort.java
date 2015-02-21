package com.daniharsh.sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,6,3,8,4,2};
		
	}
	
	public static void mergeSort(int[] arr, int low, int high){
		int mid = (low+high)/2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		merge(arr,low,mid,high);
	}
	
	public static void merge(int[] arr, int low, int mid, int high){
		int n1 = mid-low + 1;
		int n2 = high - mid;
		
		int [] p = new int[n1];
		int [] q = new int[n2];

		for (int i=0; i<n1 ; i++){
			p[i] = arr[low+i];
		}
		
		for(int i=0; i<n2; i++){
			q[i] = arr[mid+i];
		}
		
		int i=0;
		int j=0;
		int k =low;
		if(p[i] < q[j]){
			arr[k] = p[i];
			k++; i++;
		}
		else{
			arr[k] = q[j];
			k++; j++;
		}
		
		while(i<n1){
			arr[k] = p[i];
			i++; k++;
		}
		
		while(j<n2){
			arr[k] = q[j];
			k++; j++;
		}
		
	}

}
