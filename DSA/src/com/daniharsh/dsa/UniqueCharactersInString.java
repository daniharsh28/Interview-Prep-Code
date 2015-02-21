package com.daniharsh.dsa;

import java.util.*;

public class UniqueCharactersInString {

	public static boolean isStringUnique(String s) {

		if (s.length() > 128) {
			return false; // We cannot have more then 128 unique characters
							// assuming ASCII type of string
		}
		
		boolean[] check = new boolean[256]; // For ASCII values of characters
		
		for(int i=0; i<s.length(); i++){
			int val = s.charAt(i);
			if(check[val]){
				return false;
			}
			
			check[val] = true;
		}
		return true;
	}
	
	public static void main(String[] args){
		
		if(isStringUnique("ABCABC"))
			System.out.println("True");
		else
			System.out.println("False");
		
		if(isStringUnique("Strings"))
			System.out.println("True");
		else
			System.out.println("False");
		
		if(isStringUnique("strings"))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
