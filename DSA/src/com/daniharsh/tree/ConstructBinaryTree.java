package com.daniharsh.dsa.tree;

public class ConstructBinaryTree {
	public static int pre = 0;
	public static TreeNode buildBinaryTree(int[] inOrder, int[] preOrder, int start, int end){
		if(start > end)
			return null;
		
		TreeNode root = new TreeNode(preOrder[pre++]);
		if(start == end)
			return root;
		
		int in = search(inOrder,start,end,root.data);
		root.left = buildBinaryTree(inOrder, preOrder, start, in-1);
		root.right = buildBinaryTree(inOrder,preOrder,in+1,end);
		return root;
	}
	
	public static int search(int[] inOrder, int start, int end, int data){
		for(int i=start; i<end; i++){
			if(inOrder[i] == start)
				return i;
		}
		return -1;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
