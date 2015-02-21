package com.daniharsh.dsa.bst;

public class LCA {
	public static BSTNode lca(BSTNode root, BSTNode a,BSTNode b){
		while(true){
		if((a.data > root.data && b.data < root.data) || ( a.data < root.data && b.data > root.data))
			return root;
		else if(a.data < root.data && b.data < root.data)
			root = root.left;
		else
			root = root.right;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTNode root = new BSTNode(6); 
		root.left = new BSTNode(3);
		root.right = new BSTNode(9);
		root.left.left = new BSTNode(1);
		root.left.right = new BSTNode(4);
		root.right.left = new BSTNode(7);
		System.out.println(lca(root,root.left.left,root.left.right).data);
	}

}
