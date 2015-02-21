package com.daniharsh.dsa.tree;

public class RootToLeaf {
	public static void printPaths(TreeNode root){
		int[] path = new int[256];
		printPathsUtil(root, path, 0);
	}
	
	public static void printPathsUtil(TreeNode root, int[] path, int pathLen){
		if(root == null)
			return;
		path[pathLen++] = root.data;
		if(root.right == null && root.left == null){
			printArray(path, pathLen);
		}
		else{
			printPathsUtil(root.left, path, pathLen);
			printPathsUtil(root.right, path, pathLen);
		}
	}
	
	public static void printArray(int[] path, int len){
		for(int i=0; i<len; i++)
			System.out.println(path[i]);
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
		printPaths(root);
	}

}
