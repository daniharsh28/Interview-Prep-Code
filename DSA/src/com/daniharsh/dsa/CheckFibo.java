package com.daniharsh.dsa;

import java.util.*; 

public class CheckFibo {

	public static String checkFibo(long no){
        long prev=0L;
        long current = 1L;
        while(true){
            long next = prev+current;
            if(next == no)
                return "IsFibo";
            if(next > no)
                return "IsNotFibo";
            prev = current;
            current = next;
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long testcases = s.nextLong();
        while(testcases-- > 0){
            long no = s.nextLong();
            System.out.println(checkFibo(no));
        }
    
	}

}
