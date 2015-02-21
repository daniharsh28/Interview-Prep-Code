package com.daniharsh.stack;

public class Stack {
	public int top;
	public int size;
	public int[] a;
	
	public Stack(int size){
		this.a = new int[size];
		this.size = size;
		this.top = -1;
	}
	
	public boolean isEmpty(){
		return this.top == -1;
	}
	
	public void push(int item){
		if(this.top == this.size -1)
			return;
		
		this.a[++this.top] = item;
	}
	
	public int pop(){
		if(this.top == -1)
			return -1;
		
		int temp = a[top];
		top++;
		return temp;
	}
	
}
