package com.daniharsh.dsa;
import java.util.Scanner;
public class CheckArraySum {
	
public static String checkArray(int[] a){
        int prevSum = 0;
        int afterSum = 0;
		if(a.length == 1)
			return "YES";
		
		for(int i=1; i<a.length; i++)
			afterSum += a[i];
		
        for(int i=1; i< a.length-1; i++){
        	prevSum += a[i-1];
        	afterSum -= a[i];
            
            if(prevSum == afterSum)
            	return "YES";
        }
        
        return "NO";
    }
    
   /* public static boolean checkSumArray(int[] a, int[]b){
        int suma = 0;
        int sumb = 0;
        for(int i=0; i< a.length; i++)
            suma += a[i];
        
        for(int j=0; j<b.length; j++)
            sumb += b[j];
        
            if(suma == sumb)
                return true;
            else
                return false;
    } */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in);
	        int testcases = s.nextInt();
	        while(testcases-- > 0){
	            int len = s.nextInt();
	            int arr[] = new int[len];
	            for(int i=0; i< len; i++){
	                arr[i] = s.nextInt();
	            }
	            System.out.println(checkArray(arr));
	        }
	}

}
