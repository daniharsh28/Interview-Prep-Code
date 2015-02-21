package com.daniharsh.dsa.tree;

public class BSTOrNotUsingInorderO1Space {
	static TreeNode prev = null;
	public static boolean isBST(TreeNode root, TreeNode prev){
		if(root != null){
			
			if(!isBST(root.left, prev))
				return false;
			
			if(root != null && root.data <= prev.data)
				return false;
			
			prev = root;
			
			return isBST(root.right, prev);
					
					
		}
		return true; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
