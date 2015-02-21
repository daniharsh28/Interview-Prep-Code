package com.daniharsh.dsa;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int reverse = 0;
		while(num > 0){
			reverse = reverse * 10;
			reverse = reverse + num % 10;
			num = num / 10;
		}
		System.out.println(reverse);
	}

}
