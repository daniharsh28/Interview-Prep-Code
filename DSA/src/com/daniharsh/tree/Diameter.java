package com.daniharsh.dsa.tree;

public class Diameter {
	static int diameter = 0;
	public static int maxDiameter(TreeNode root, int diameter){
		
		if(root == null)
			return 0;
		
		int left = maxDiameter(root.left, diameter);
		int right = maxDiameter(root.right, diameter);
		
		if(left + right > diameter){
			diameter = left + right;
		}
		
		return Math.max(left, right) + 1;
		
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
		System.out.println(maxDiameter(root, 0));
	}

}
