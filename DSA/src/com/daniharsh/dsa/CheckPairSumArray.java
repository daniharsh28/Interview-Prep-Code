package com.daniharsh.dsa;

import java.util.*;
public class CheckPairSumArray {

public static int[] findElement(int[] a, int sum){
        
        int[] result = new int[2];
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i=0; i<a.length; i++){
            mp.put(i+1,a[i]);
        }
        
        int d = 0;
        int temp = 0;
        for(Map.Entry<Integer,Integer> it : mp.entrySet()){
            if(mp.containsValue((sum - it.getValue()))){
                result[d] = it.getKey();
                d++;
                if(d == 2)
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int testcases = s.nextInt();
        while(testcases-- > 0){
            int sum = s.nextInt();
            int size = s.nextInt();
            int[] a = new int[size];
            for(int i=0; i< size; i++)
                a[i] = s.nextInt();
            
            int[] result = findElement(a,sum);
            System.out.println(result[0]+" "+result[1]);
            
        }
    }
}
