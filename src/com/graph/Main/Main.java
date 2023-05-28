package com.graph.Main;

public class Main {
	public static void main(String[] args) {
		int graph[][] = {{0,1,0},{1,0,1},{0,1,0}};
		char nodes[] = {'a','b','c'};
		GetLocation loc = new GetLocation(nodes);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		
		int source = loc.get_idx('c');
		int destination = loc.get_idx('c');
		
		if(graph[source][destination]==1)
			System.out.println("Nodes are connected");
		else
			System.out.println("Not connected to each other");
	}
}
