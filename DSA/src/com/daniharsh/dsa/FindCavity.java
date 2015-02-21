package com.daniharsh.dsa;
import java.util.*;

public class FindCavity {

	public static void findCavity(char[] a){
        char max = 0;
        Set<Integer> maxIndex = new HashSet<Integer>();
        for(int i=0; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        
        for(int i=0; i<a.length; i++){
        	if(a[i] == max)
        		maxIndex.add(i);
        }
        //for)
        
        if(maxIndex.contains(0) || maxIndex.contains(a.length-1)){
            for(int i=0; i<a.length; i++){
                System.out.print(a[i]);
            }
        }
        else{
            for(int i=0; i<a.length; i++){
                if(maxIndex.contains(i) && !maxIndex.contains(i-1) && !maxIndex.contains(i+1))
                    System.out.print('X');
                else
                    System.out.print(a[i]);
            }
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int noofcases = s.nextInt();
        int len = noofcases ;
        while(noofcases -- > 0){
            char[] a = new char[len];
            String str = s.next();
            for(int i =0; i<len; i++){ 
                a[i] = str.charAt(i);
            }
            findCavity(a);
        }
    }

}
