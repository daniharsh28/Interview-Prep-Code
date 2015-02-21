package com.daniharsh.dsa.tree;
import java.util.*;

import com.daniharsh.dsa.tree.*;
public class NonRecursivePreOrder {

	
	public static void preOrderWithoutRecursion(TreeNode root){
		Stack<TreeNode> s = new Stack<TreeNode>();
		if(root == null)
			return;
		while(true){
		while(root != null){
			System.out.println(root.data);
			s.push(root);
			if(root.right != null)
				s.push(root.right);
			root = root.left;
		}
		if(s.isEmpty())
			return;
		root = s.pop();
		root = root.right;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		preOrderWithoutRecursion(root);
		
	}

}
