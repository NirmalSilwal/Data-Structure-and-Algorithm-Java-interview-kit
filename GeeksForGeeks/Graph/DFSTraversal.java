package Graph;

import java.util.ArrayList;

public class DFSTraversal {

	public static void main(String[] args) {

		// int totalVertices = 7; // for test graph 1
		int totalVertices = 5; // for test graph 2 and 3
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(totalVertices);

		for (int i = 0; i < totalVertices; i++) {
			adjList.add(new ArrayList<Integer>());
		}

		/*
		 * test graph 1, connected Graph, output: 0 1 2 3 4 5 6
		 */

		// addEdge(adjList, 0, 1);
		// addEdge(adjList, 1, 2);
		// addEdge(adjList, 2, 3);
		// addEdge(adjList, 0, 4);
		// addEdge(adjList, 4, 5);
		// addEdge(adjList, 4, 6);
		// addEdge(adjList, 5, 6);

		/*
		 * test graph 2, connected Graph, output: 0 1 3 2 4
		 */

		// addEdge(adjList, 0, 1);
		// addEdge(adjList, 0, 2);
		// addEdge(adjList, 2, 3);
		// addEdge(adjList, 1, 3);
		// addEdge(adjList, 1, 4);
		// addEdge(adjList, 3, 4);

		/*
		 * test graph 3, disconnected graph, output: 0 1 2 3 4
		 */

		addEdge(adjList, 0, 1);
		addEdge(adjList, 0, 2);
		addEdge(adjList, 1, 2);
		addEdge(adjList, 3, 4);

		display(adjList);

		System.out.println("\ndepth first search traversal...");
		// int sourceVertex = 0;
		// depthFirstSearchTraversal(adjList, sourceVertex);

		DFSTraverseDisconnected(adjList);
	}

	private static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}

	public static void display(ArrayList<ArrayList<Integer>> adjList) {
		for (int i = 0; i < adjList.size(); i++) {
			System.out.println(i + ": " + adjList.get(i));
		}
	}

	public static void depthFirstSearchTraversal(ArrayList<ArrayList<Integer>> adjList, int src) {
		boolean[] visited = new boolean[adjList.size()];
		DFSTraverse(adjList, src, visited);
	}

	private static void DFSTraverse(ArrayList<ArrayList<Integer>> adjList, int src, boolean[] visited) {
		System.out.print(src + " ");
		visited[src] = true;

		for (Integer neighbor : adjList.get(src)) {
			if (visited[neighbor] == false) {
				DFSTraverse(adjList, neighbor, visited);
			}
		}
	}

	// this works for connected as well as disconnected Graph
	// O(V+E) Time
	public static void DFSTraverseDisconnected(ArrayList<ArrayList<Integer>> adjList) {
		boolean[] visited = new boolean[adjList.size()];

		for (int vtxId = 0; vtxId < adjList.size(); vtxId++) {
			if (visited[vtxId] == false) {
				// System.out.println(); // to print each components
				DFSTraverse(adjList, vtxId, visited);
			}
		}
	}

}
