package com.daniharsh.linkedlist;

public class SwapAdjacentNodes {
	public static Node swapAdjacentNode(Node head) {
		int len = 0;
		Node current = head;
		while (current != null) {
			len++;
			current = current.next;
		}
		
		Node prev = null;
		Node curr = head;
		Node next = curr.next;
		curr.next = next.next;
		next.next = curr;
		head = next;
		if(len % 2 == 0){
			while(curr.next != null){
				prev = curr;
				curr = curr.next;
				next = curr.next;
				curr.next = next.next;
				next.next = curr;
				prev.next = next;
			}
		}else{
			while(curr.next.next != null){
				prev = curr;
				curr = curr.next;
				next = curr.next;
				curr.next = next.next;
				next.next = curr;
				prev.next = next;
			}
		}
		return head;
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
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		printList(swapAdjacentNode(head));
	}

}
