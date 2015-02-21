package com.daniharsh.dsa.tree;

import java.io.ObjectInputStream.GetField;

import com.daniharsh.dsa.tree.TreeNode;

public class LevelOrderInSpiral {

	public static int getHeight(TreeNode root) {

		if (root == null)
			return 0;
		else {
			int lheight = getHeight(root.left);
			int rheight = getHeight(root.right);

			return Math.max(lheight, rheight) + 1;
		}
	}

	public static void printSpiral(TreeNode root) {

		int h = getHeight(root);

		boolean flag = false;
		for (int i = 1; i <= h; i++) { //change this loop for reverse level-order traversal.
			printLevel(root, i, flag);
			flag = !flag;
		}
	}

	public static void printLevel(TreeNode root, int i, boolean flag) {
		// TODO Auto-generated method stub
		if(root == null)
			return;
		if(i == 1)
			System.out.println(root.data);
		if(i > 1){
			if(flag){
				printLevel(root.left, i-1, flag);
				printLevel(root.right, i-1, flag);
			}
			else{
				printLevel(root.right, i-1, flag);
				printLevel(root.left, i-1, flag);
			}
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(8);
		root.right = new TreeNode(9);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(3);
		printSpiral(root);
	}
}
