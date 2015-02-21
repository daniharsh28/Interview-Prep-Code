package com.daniharsh.dsa.tree;

public class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
		
	}
	
	public static void printInOrder(TreeNode root){
		if(root == null)
			return;
		
		printInOrder(root.left);
		System.out.println(root.data);
		printInOrder(root.right);
	}
	
	public static int checkHeight(int key, TreeNode root){
		
		return checkHeightUtil(root, key, 1);
	}
	
	public static int checkHeightUtil(TreeNode node, int key, int level){
		if(node == null)
			return 0;
		
		if(node.data == key)
			return level;
		
		int height = checkHeightUtil(node.left, key, level+1);
		if(height!= 0)
			return height;
		
		height = checkHeightUtil(node.right, key, level+1);
		return height;
	}
	
	public static void main(String[] args){
		
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(8);
		root.right = new TreeNode(9);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(3);
		printInOrder(root);
		System.out.println("Height of tree" + checkHeight(8, root));
		
	}
}
