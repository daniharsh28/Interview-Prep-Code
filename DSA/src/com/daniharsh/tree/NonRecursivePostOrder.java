package com.daniharsh.dsa.tree;
import com.daniharsh.dsa.tree.*;

import java.util.*;

public class NonRecursivePostOrder {
	
	public static void posOrderWithoutRecursion(TreeNode root){
		Stack<TreeNode> s = new Stack<TreeNode>();
		
		if(root == null)
			return;
		
		do{
			while(root != null){
				if(root.right != null)
					s.push(root.right);
				s.push(root);
				root = root.left;
			}
			
			root = s.pop();
			if(root.right != null && s.peek() == root.right){
				s.pop();
				s.push(root);
				root = root.right;
			}
			else{
				System.out.println(root.data);
				root = null;
			}
			
		}while(!s.empty());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		posOrderWithoutRecursion(root);
	}

}
