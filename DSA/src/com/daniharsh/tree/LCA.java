package com.daniharsh.dsa.tree;

public class LCA {
	public static TreeNode LCA(TreeNode root, TreeNode a, TreeNode b){
		if(root == null)
			return root;
		if(root == a || root == b)
			return root;
		TreeNode left = LCA(root.left,a,b);
		TreeNode right = LCA(root.right,a,b);
		
		if(left != null && right!= null)
			return root;
		else
			return (left == null)?right : left;
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
		System.out.println(LCA(root, root.left.right,root.right.left).data);
	}

}
