package com.daniharsh.dsa.tree;
import com.daniharsh.dsa.*;

import java.util.*;

public class LevelOrder {
	public static void levelOrder(TreeNode root){
		
		Queue<TreeNode> q = new Queue<TreeNode>() {
			
			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Iterator<TreeNode> iterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean addAll(Collection<? extends TreeNode> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public TreeNode remove() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public TreeNode poll() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public TreeNode peek() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean offer(TreeNode e) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public TreeNode element() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean add(TreeNode e) {
				// TODO Auto-generated method stub
				return false;
			}
		}; 	
		
		if(root == null)
			return;
		
		q.add(root);
		while(!q.isEmpty()){
			TreeNode temp = q.remove();
			System.out.println(temp.data);
			if(temp.left != null)
				q.add(temp.left);
			if(temp.right != null)
				q.add(temp.right);
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
		levelOrder(root);
	}

}
