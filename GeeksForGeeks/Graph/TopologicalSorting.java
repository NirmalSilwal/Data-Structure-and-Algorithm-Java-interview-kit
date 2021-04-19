package Graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class TopologicalSorting {

	public static void main(String[] args) {

		int totalVertices = 6; // test graph 1
		// int totalVertices = 3; // test graph 2
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(totalVertices);
		for (int i = 0; i < totalVertices; i++) {
			adjList.add(new ArrayList<Integer>(i));
		}
		// test graph 1, output: 0 2 1 3 5 4
		addEdge(adjList, 0, 1);
		addEdge(adjList, 0, 2);
		addEdge(adjList, 1, 3);
		addEdge(adjList, 2, 3);
		addEdge(adjList, 3, 4);
		addEdge(adjList, 3, 5);

		// test graph 2, output: 0 2 1
		// addEdge(adjList, 0, 1);
		// addEdge(adjList, 0, 2);

		display(adjList);

		System.out.println("\ntopological sorting...");
		topologicalSort(adjList);
	}

	private static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {
		adjList.get(u).add(v); // directed graph Edge
	}

	private static void display(ArrayList<ArrayList<Integer>> adjList) {
		for (int i = 0; i < adjList.size(); i++) {
			System.out.println(i + ": " + adjList.get(i));
		}
	}

	// O(V+E) Time, DFS based approach
	public static void topologicalSort(ArrayList<ArrayList<Integer>> adjList) {
		// use addFirst() and removeFirst() method of LinkedList for O(1) Time
		LinkedList<Integer> stack = new LinkedList<>();

		boolean[] visited = new boolean[adjList.size()];

		for (int vtx = 0; vtx < adjList.size(); vtx++) {
			if (visited[vtx] == false) {
				dfsTraverse(adjList, vtx, stack, visited);
			}
		}
		
		while (!stack.isEmpty()) {
			System.out.print(stack.removeFirst() + " "); // pop
		}
	}

	private static void dfsTraverse(ArrayList<ArrayList<Integer>> adjList, int vertex, LinkedList<Integer> stack,
			boolean[] visited) {

		visited[vertex] = true;

		for (Integer neighbor : adjList.get(vertex)) {
			if (visited[neighbor] == false) {
				dfsTraverse(adjList, neighbor, stack, visited);
			}
		}
		stack.addFirst(vertex); // push
	}
}
