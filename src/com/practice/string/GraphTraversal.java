package com.practice.string;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;



public class GraphTraversal {
	static class Graph{
		private int vertices;
		LinkedList<Integer>[] edges;
		
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		Graph(int v){
			vertices = v;
			edges = new LinkedList[v];
			for(int i = 0; i < v; i++){
				edges[i] = new LinkedList();
			}
		}
		
		void addEdgeNode(int v, int edge){
			edges[v].add(edge);
		}
		
		void DFS(){
			boolean[] visited = new boolean[vertices];
			
			for(int i = 0; i < vertices; ++i){
				if(!visited[i]){
					DFSUtil(i, visited);
				}
				
			}
		}
		
		void DFSUtil(int v, boolean[] visited){
			visited[v] = true;
			System.out.print(v + "");
			
			Iterator<Integer> i = edges[v].listIterator();
			
			while(i.hasNext()){
				int n = i.next();
			
				if(!visited[n]){
					DFSUtil(n, visited);
				}
				
			}
			
		}
		
		void topologicalSort(){
			boolean[] visited = new boolean[vertices];
			Stack<Integer> stack = new Stack<Integer>();
			
			for(int i = 0; i < vertices; ++i){
				if(!visited[i]){
					topologicalSortUtil(i, visited, stack);
				}
			}
			
			while(!stack.isEmpty()){
				System.out.print(stack.pop() + "");
			}
		}
		
		
		void topologicalSortUtil(int v, boolean[] visited, Stack<Integer> stack){
			visited[v] = true;
					
			Iterator<Integer> i = edges[v].listIterator();
			
			while(i.hasNext()){
				int n = i.next();
				
				if(!visited[n]){
					topologicalSortUtil(n, visited, stack);
					
				}
			}
			stack.push(v);
		}
		
	}
	
	
	public static void main(String[] args){
		

//		 Graph g = new Graph(4);
//		    g.addEdgeNode(0, 1);
//		    g.addEdgeNode(0, 2);
//		    g.addEdgeNode(1, 2);
//		    g.addEdgeNode(2, 0);
//		    g.addEdgeNode(2, 3);
//		    g.addEdgeNode(3, 3);
//        
//        g.DFS();
		
		
		  // Create a graph given in the above diagram
		
        Graph g = new Graph(6);
        g.addEdgeNode(5, 2);
        g.addEdgeNode(5, 0);
        g.addEdgeNode(4, 0);
        g.addEdgeNode(4, 1);
        g.addEdgeNode(2, 3);
        g.addEdgeNode(3, 1);
 
        System.out.println("Following is a Topological " +
                           "sort of the given graph");
        g.topologicalSort();
	}

}
