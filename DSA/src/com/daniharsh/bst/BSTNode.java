package com.daniharsh.dsa.bst;

public class BSTNode {

	public int data;
	public BSTNode left, right;
	
	public  BSTNode(int data){
		this.data = data;
		this.right = this.left = null;
	}
	
	public static BSTNode newNode (int data){
		BSTNode temp = new BSTNode(data);
		return temp;
	}
	
	public static void inorder(BSTNode root){
		if(root == null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	
	public static void main(String[] args){
		
		BSTNode root = new BSTNode(6); 
		root.left = new BSTNode(3);
		root.right = new BSTNode(9);
		root.left.left = new BSTNode(1);
		root.left.right = new BSTNode(4);
		root.right.left = new BSTNode(7);
		root.right.right = newNode(10);
		
		inorder(root);
	}
	
}