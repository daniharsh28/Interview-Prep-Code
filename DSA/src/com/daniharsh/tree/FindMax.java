package com.daniharsh.dsa.tree;
import com.daniharsh.dsa.tree.*;
import java.util.*;

public class FindMax {

	public static int findMax(TreeNode root){
		int max = Integer.MIN_VALUE;
		if(root != null){
			int root_val = root.data;
			int left = findMax(root.left);
			int right = findMax(root.right);
			if(left > right)
				max = left;
			else
				max = right;
			if(root_val > max)
				max = root_val;
		}
		return max;
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
		System.out.println(findMax(root));

	}

}
