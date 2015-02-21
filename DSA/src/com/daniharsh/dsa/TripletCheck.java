package com.daniharsh.dsa;
import java.util.*;
public class TripletCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr;
	        Scanner scn=new Scanner(System.in);
	        int n=scn.nextInt();
	        arr=new int[n];
	      
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=scn.nextInt();
	        }
	        int triplets=0;
	        // Write the code to compute the number of triplets as required
	        
	        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
	        for(int i=0;i<n;i++){
	            lhs.add(arr[i]);
	        }
	        int[] a = new int[lhs.size()];
	        int count = 0;
	        for(Integer in : lhs)
	        {
	            a[count++] = in;
	        }    
	        int misplaced = 0;
	        ArrayList<Integer> al = new ArrayList<Integer>();
	        for(int i=1; i<a.length; i++)
	            if(a[i] < a[i-1]){
	                misplaced++;
	                al.add(i);
	            }
	        int size = lhs.size();    
	        triplets = ((size*(size-1)*(size-2))/6) - misplaced*size;
	        
	        System.out.println(triplets);
	    }
	}


