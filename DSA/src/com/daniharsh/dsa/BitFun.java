package com.daniharsh.dsa;

public class BitFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 8;
		int a = num & 1;
		System.out.println(a);
		if(a>0)
			System.out.println("Odd!");
		else
			System.out.println("Even!");
	}

}
