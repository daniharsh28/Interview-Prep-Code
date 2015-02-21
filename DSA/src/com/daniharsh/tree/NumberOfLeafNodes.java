package com.daniharsh.dsa.tree;

public class NumberOfLeafNodes {
	
	public static int numberOfLeaves(TreeNode root){
		int count = 0;
		if(root == null)
			return 0;
		
		if(!((root.left != null && root.left != null) || (root.left  == null && root.right == null)))
			count++;
		
		int leftCount = numberOfLeaves(root.left);
		int rightCount = numberOfLeaves(root.right);
		
		return leftCount + rightCount+count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		System.out.println(numberOfLeaves(root));
	}

}
