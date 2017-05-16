package com.practice.string;

public class ReverseSingleLinkedList {

	
	public static class Node{
		int value;
		Node next;
		
		
		public Node(int value){
			this.value = value;
			
		}
	}
	public static void main(String [ ] args){
		Node root = new Node(100);
		root.next = new Node(90);
		root.next.next = new Node (80);
		root.next.next.next = new Node (70);
		
		printNodes(root);
	printNodes(reverseList(root));
	}
	
	public static void printNodes(Node root){
		
		Node current = root;
		
		while(current != null){
			System.out.print(current.value + " ");
			current = current.next;
		}
	}
	
	public static Node reverseList(Node root){
		
		
		Node reverseList = null;
		Node current = root;
		
		while(current != null){
			Node next = current.next;
			current.next = reverseList;
			reverseList = current;
			current = next;
		}
		
		
		return reverseList;
	}
}
