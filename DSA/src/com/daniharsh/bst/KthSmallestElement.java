package com.daniharsh.dsa.bst;

public class KthSmallestElement {
	public static int getSize(BSTNode root){
		if(root == null)
			return 0;
		
		int left = getSize(root.left);
		int right = getSize(root.right);
		return left+right+1;
	}
	
	public static BSTNode kthSmallest(BSTNode root, int k){
		if(root == null)
			return null;
		
		int size = getSize(root.left);
		if(size+1 == k)
			return root;
		else if(k > size)
			return kthSmallest(root.right, k-size);
		else
			return kthSmallest(root.left, k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTNode root = new BSTNode(6); 
		root.left = new BSTNode(3);
		root.right = new BSTNode(9);
		root.left.left = new BSTNode(1);
		root.left.right = new BSTNode(4);
		root.right.left = new BSTNode(7);
		System.out.println(kthSmallest(root, 4).data);
	}

}
