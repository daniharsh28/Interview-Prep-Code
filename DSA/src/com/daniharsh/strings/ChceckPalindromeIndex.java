package com.daniharsh.strings;

import java.util.*;

public class ChceckPalindromeIndex {

	public static boolean checkForPalindrome(String str) {
		int front = 0;
		int last = str.length() - 1;
		while (front < last) {
			if (str.charAt(front) != str.charAt(last))
				return false;
			front++;
			last--;
		}
		return true;
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();
		while (testcases-- > 0) {
			String str = s.next();
			if (checkForPalindrome(str))
				System.out.println(-1);
			else {
				for (int i = 0; i < str.length(); i++) {
					if (i == 0) {
						if (checkForPalindrome(str.substring(i + 1)))
							System.out.println(i);
					} else {
						if (checkForPalindrome(str.substring(0, i)
								+ str.substring(i + 1)))
							System.out.println(i);
					}
				}
				
			}
			
		}
	}

}
