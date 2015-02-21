package com.daniharsh.linkedlist;

import com.daniharsh.linkedlist.Node;
public class ReverseLinkList {

	public static void reverseLinkedList(Node head){
		Node previous = null;
		Node current = head;
		Node next = null;
		while(current	!= null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}
	
	public static void printList(Node head){
		while(head != null){
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		//printList(head);
		reverseLinkedList(head);
		printList(head);
	}

}
