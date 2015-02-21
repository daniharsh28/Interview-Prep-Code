package com.daniharsh.dsa;
import java.util.*;

public class CheckOnCircle {

	 public static String check(int radius, int noofstations){
		 	
		 	if(noofstations == 0)
		 		return "possible";
		 	
	        int count = 4;
	        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer,Integer>();
	        
	        for(int i=1; i <= radius; i++)
	            map.put(i,i);
	        
	        for(Map.Entry<Integer, Integer> it: map.entrySet()){
	            if(map.containsKey((int)Math.sqrt(radius*radius - it.getValue())))
	                count+=4;
	        }
	        
	        if(count == noofstations)
	            return "possible";
	        else
	            return "impossible";
	        
	    }

	    public static boolean checkOnCircle(int i, int j, int radius){
	        if((i*i + j*j - radius*radius) == 0)
	            return true;
	        else
	            return false;
	    }
	    
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner  s = new Scanner(System.in);
	        int testcases = s.nextInt();
	        while(testcases-- > 0){
	            int radius = (int)Math.sqrt(s.nextInt());
	            int noofstations = s.nextInt();
	            System.out.println(check(radius, noofstations));
	        }
	    }

}
