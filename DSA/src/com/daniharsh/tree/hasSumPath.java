package com.daniharsh.dsa.tree;

public class hasSumPath {
	public static boolean hasSumPath(TreeNode root, int sum){
		if(root == null)
			return (sum==0);
		
		int subSum = sum - root.data;
		return (hasSumPath(root.left, subSum) || hasSumPath(root.right, subSum));
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
		System.out.println(hasSumPath(root, 7));
		System.out.println(hasSumPath(root, 4));
	}

}
