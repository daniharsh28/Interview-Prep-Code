package com.daniharsh.strings;
import java.util.*;

public class Pangrams {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner s = new Scanner(System.in);
	        String	str = s.nextLine();
	        
	        str = str.toLowerCase();
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        for(int i=0; i<str.length(); i++){
	            if(str.charAt(i) != ' '){
	                if(!(map.containsKey(str.charAt(i))))
	                    map.put(str.charAt(i),1);
	                else
	                    map.put(str.charAt(i),((int)map.get(str.charAt(i))) + 1);
	            }
	        }
	        
	        if(map.size() < 26)
	            System.out.println("not pangram");
	        else
	            System.out.println("pangram");
	    }

}
