package com.daniharsh.dsa.tree;

public class PrintAncestor {
	public static int printAncestors(TreeNode root, TreeNode key){
		if(root == null)
			return 0;
		
		if(root.left == key || root.right == key || (printAncestors(root.left,key) ==1) || (printAncestors(root.right, key) == 1))
			{System.out.println(root.data);
			return 1;
			}
			return 0;
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
		printAncestors(root, root.left.right);
	}

}
