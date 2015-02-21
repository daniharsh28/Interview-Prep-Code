package com.daniharsh.dsa;

public class CountNumberofZerosinFactorial {

	public static int countNoOfZeros(int number){
		if(number==5)
			return 1;
		else if (number%5 ==0)
			return 1+countNoOfZeros(number-1);
		else if (number%10 !=0)
			return countNoOfZeros(number-1);
		else
			return 1+countNoOfZeros(number-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(countNoOfZeros(5));
		System.out.println(countNoOfZeros(30));
	}

}
