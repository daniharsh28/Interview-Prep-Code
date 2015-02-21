package com.daniharsh.strings;

import java.util.*;

public class HolesStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('A', 1);
		map.put('B', 2);
		map.put('O', 1);
		map.put('P', 1);
		map.put('R', 1);
		map.put('D', 1);
		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();
		while (testcases-- > 0) {
			String str = s.next();
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (map.containsKey(str.charAt(i)))
					count += (int) map.get(str.charAt(i));
			}
				System.out.println(count);
			
		}

	}

}
