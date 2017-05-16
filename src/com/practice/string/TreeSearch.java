package com.practice.string;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeSearch {

	public static class Node{
		int value;
		Node nodeLeft;
		Node nodeRight;
		
		public Node(int value){
			this.value = value;
		}
	}
	
	
	
	public static void main(String [ ] args){
		
		Node root = new Node(100);
		root.nodeRight = new Node(90);
		root.nodeLeft = new Node(80);
		root.nodeRight.nodeRight = new Node(95);
		root.nodeLeft.nodeLeft = new Node(70);
		root.nodeLeft.nodeLeft.nodeLeft = new Node(60);
		System.out.println(dfs(root, 60));
		System.out.println(bfs(root, 60));
	}
	
	
	public static boolean dfs(Node root, int value){
		boolean found = false;
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		
		
		while(!stack.isEmpty()){
			Node currentNode = stack.pop();
			
			System.out.println("Node: " + currentNode.value);
			if(currentNode.value == value){
				return true;
			}
			
			
			if(currentNode.nodeRight != null){
				stack.push(currentNode.nodeRight);
			}
			
			if(currentNode.nodeLeft != null){
				stack.push(currentNode.nodeLeft);
			}
		}
		
		
		return found;
	}
	
	public static boolean bfs(Node root, int value){
		 boolean found = false;
		 
		 Queue<Node> queue = new LinkedList<Node>();
		 queue.add(root);
		 
		 while(!queue.isEmpty()){
			 Node currentNode = queue.poll();
			 System.out.println("Node: " + currentNode.value);
			 
			 if(currentNode.value == value){
				 return true;
			 }
	
				if(currentNode.nodeLeft != null){
					queue.add(currentNode.nodeLeft);
				}
				 if(currentNode.nodeRight != null){
						queue.add(currentNode.nodeRight);
					}
		 }
		 
		 return found;
	}
}
