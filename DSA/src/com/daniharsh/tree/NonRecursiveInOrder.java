package com.daniharsh.dsa.tree;

import com.daniharsh.dsa.tree.TreeNode;
import java.util.Stack;

public class NonRecursiveInOrder {

	public static void nonRecursiveInOrder(TreeNode root) {
		if (root == null)
			return;

		Stack<TreeNode> s = new Stack<TreeNode>();
		while (true) {
			while (root != null) {
				s.push(root);
				root = root.left;
			}
			if(s.isEmpty())
				break;
			
			root = s.pop();
			System.out.println(root.data);
			root = root.right;
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TreeNode root = new TreeNode(1);
			root.left = new TreeNode(2);
			root.left.left = new TreeNode(3);
			root.left.right = new TreeNode(4);
			root.right = new TreeNode(5);
			root.right.left = new TreeNode(6);
			nonRecursiveInOrder(root);
	}

}
