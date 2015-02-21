package com.daniharsh.strings;
import java.util.*;
public class CheckAnagrams {

	public static int checkAnagram(String str){
        int len = str.length();
        if(len % 2 == 0){
            String substr1 = str.substring(0,len/2);
            String substr2 = str.substring(len/2);
            char[] substr1arr = substr1.toCharArray();
            char[] substr2arr = substr2.toCharArray();
            Arrays.sort(substr1arr);
            Arrays.sort(substr2arr);
            int count = 0;
            for(int i=0; i<substr1arr.length; i++){
                if(substr1arr[i] != substr2arr[i])
                    count++;
            }
            return count;
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int testcases = s.nextInt();
        while(testcases-- > 0){
            String str = s.next();
            System.out.println(checkAnagram(str));
        }
    }

}
