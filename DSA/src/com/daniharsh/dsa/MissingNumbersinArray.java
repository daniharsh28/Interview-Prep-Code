package com.daniharsh.dsa;
import java.util.*;

public class MissingNumbersinArray {

	  public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner s = new Scanner(System.in);
	        int lena = s.nextInt();
	        int[] a = new int[lena];
	        for(int i=0; i<lena; i++)
	        	a[i] = s.nextInt();
	        int lenb = s.nextInt();
	        int[] b = new int[lenb];
	        for(int i=0; i<lenb; i++)
	        	b[i] = s.nextInt();
	        TreeMap<Integer,Integer> map = new TreeMap<Integer, Integer>();
	        int[] c = (lena > lenb) ? a : b;
	        int[] d = (lena > lenb) ? b : a;
	        for(int i=0; i<c.length; i++){
	            if(map.containsKey(c[i]))
	                map.put(c[i], map.get(c[i])+1);
	            else
	                map.put(c[i], 1);
	        }
	        
	        for(int i=0; i<d.length; i++){
	            if(map.containsKey(d[i]))
	                map.put(d[i], map.get(d[i]) - 1);
	            else
	                map.put(d[i],1);
	        }
	        
	        for(Map.Entry<Integer,Integer> m : map.entrySet()){
	            if(m.getValue() > 0)
	                System.out.print(m.getKey()+ " ");
	        }
	            
	    }
}
