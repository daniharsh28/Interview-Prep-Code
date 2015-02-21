package com.daniharsh.dsa.tree;

import java.util.Stack;

public class ZigZagTraversal {
	
	public static void zigZagTraversal(TreeNode root){
		if(root == null)
			return;
		
		boolean lefttoright = true;
		Stack<TreeNode> current = new Stack<TreeNode>();
		Stack<TreeNode> next = new Stack<TreeNode>();
		current.push(root);
		while(!current.isEmpty()){
			TreeNode temp = current.pop();
			System.out.println(temp.data);
			if(lefttoright){
				if(temp.right != null)
					next.push(temp.right);
				if(temp.left != null)
					next.push(temp.left);
			}
			else
			{
				if(temp.left != null)
					next.push(temp.left);
				if(temp.right != null)
					next.push(temp.right);
			}
			if(current.isEmpty()){
				lefttoright = (!lefttoright);
				while(!next.isEmpty())
					current.push(next.pop());
			}
		}
		
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
		zigZagTraversal(root);
		
	}

}
