package com.daniharsh.dsa.tree;

public class Mirror {
	public static void mirrorTree(TreeNode root){
		if(root != null)
		{	
		mirrorTree(root.left);
		mirrorTree(root.right);
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		}
		inOrder(root);
	}
	
	public static void inOrder(TreeNode root){
		if(root == null)
			return;
		
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
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
		mirrorTree(root);
	}

}
