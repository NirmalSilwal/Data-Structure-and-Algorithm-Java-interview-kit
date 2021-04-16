package Graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFSTraversal {

	public static void main(String[] args) {

		// int totalVertices = 5; // test graph 1
		// int totalVertices = 7; // test graph 2
		int totalVertices = 9; // test graph 3

		ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(totalVertices);
		for (int i = 0; i < totalVertices; i++) {
			adjList.add(new ArrayList<Integer>(i));
		}

		// note: be careful to adjust totalVertices per test cases of Graph

		/* test graph 1 - connected graph */

		// addEdge(adjList, 0, 1);
		// addEdge(adjList, 0, 2);
		// addEdge(adjList, 1, 2);
		// addEdge(adjList, 1, 3);
		// addEdge(adjList, 2, 3);
		// addEdge(adjList, 2, 4);
		// addEdge(adjList, 3, 4);

		// int sourceVertex = 0;
		// boolean[] visited = new boolean[totalVertices];
		// breadthFirstSearchTraverse(adjList, sourceVertex, visited);
		// System.out.println();

		/* test graph 2 - disconnected graph with two components */

		// addEdge(adjList, 0, 1);
		// addEdge(adjList, 0, 2);
		// addEdge(adjList, 1, 3);
		// addEdge(adjList, 2, 3);
		// addEdge(adjList, 4, 5);
		// addEdge(adjList, 4, 6);
		// addEdge(adjList, 5, 6);
		//
		// bfsDisconnectedGraph(adjList);

		/* test graph 3 - disconnected graph with three components */

		addEdge(adjList, 0, 1);
		addEdge(adjList, 0, 2);
		addEdge(adjList, 1, 2);
		addEdge(adjList, 3, 4);
		addEdge(adjList, 5, 6);
		addEdge(adjList, 5, 7);
		addEdge(adjList, 7, 8);

		bfsDisconnectedGraph(adjList);
	}

	private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	/*
	 * Provided adjacency list representation of Graph, doing BFS traversal.
	 * 
	 * It can only deal with connected graph.
	 */

	// O(V+E) Time
	public static void breadthFirstSearchTraverse(ArrayList<ArrayList<Integer>> adj, int src, boolean[] visited) {

		LinkedList<Integer> queue = new LinkedList<>();

		queue.addLast(src);
		visited[src] = true;

		while (!queue.isEmpty()) {
			int removedVertex = queue.removeFirst();
			System.out.print(removedVertex + " ");

			for (Integer neighbor : adj.get(removedVertex)) {
				if (visited[neighbor] == false) {
					queue.addLast(neighbor);
					visited[neighbor] = true;
				}
			}
		}
	}

	/*
	 * if the graph is either disconnected or connected
	 * 
	 * flag counts no. of islands in graph
	 * 
	 * O(V+E) Time, V is no. of Vertices, E is no. of Edges
	 * 
	 */
	public static void bfsDisconnectedGraph(ArrayList<ArrayList<Integer>> adj) {
		boolean[] visited = new boolean[adj.size()];
		int flag = 0; // to count connected components
		
		for (int i = 0; i < adj.size(); i++) {
			if (visited[i] == false) {
				flag++;
				breadthFirstSearchTraverse(adj, i, visited);
			}
		}
		System.out.println("\n\nno. of connected components/ Island in Graph: " + flag);
	}
}
