package com.daniharsh.dsa.tree;

import java.io.ObjectInputStream.GetField;

public class CheckIfBalanced {
	public static boolean checkIfBalanced(TreeNode root){
		if(root == null)
			return true;
		
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		
		return Math.abs(left - right) <= 1;
		
	}
	
	public static int getHeight(TreeNode root){
		if(root == null)
			return 0;
		
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		
		return Math.max(left, right) + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
