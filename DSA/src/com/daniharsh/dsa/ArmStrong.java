package com.daniharsh.dsa;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<100000; i++){
			int temp = 0;
			int num = i;
			while(num>0){
				int rem = num%10;
				temp = temp +(rem)*(rem)*(rem);
				num = num/10;
			}
			if((int)temp == i)
				System.out.println(i);
		}
	}

}
