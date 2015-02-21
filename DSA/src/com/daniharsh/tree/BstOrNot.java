package com.daniharsh.dsa.tree;

import java.util.ArrayList;

public class BstOrNot {
	public static boolean checkBST(TreeNode root, int min, int max) {
		if (root == null)
			return true;

		if (root.data > min && root.data < max
				&& checkBST(root.left, min, Math.min(max, root.data))
				&& checkBST(root.right, Math.max(min, root.data), max))
			return true;
		else
			return false;

	}

	public static void inOrder(TreeNode root) {
		if (root == null)
			return;

		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
