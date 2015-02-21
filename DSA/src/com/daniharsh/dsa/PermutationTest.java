package com.daniharsh.dsa;

public class PermutationTest {
	
	public static boolean isPermutation(String mainString, String perm){
		
		if(mainString.length() != perm.length()){
			return false;
		}
			
		int[] arr = new int[256];
		return true;
	}
	

	public static void main(String[] args){
		
		if(isPermutation("abc", "cabb"))
			System.out.println("True");
		else
			System.out.println("False");
		
		if(isPermutation("abcd", "cab"))
			System.out.println("True");
		else
			System.out.println("False");
		
		if(isPermutation("abc", "cad"))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
