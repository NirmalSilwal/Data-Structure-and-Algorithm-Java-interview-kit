package Graph;

import java.util.ArrayList;

public class NoOfIslands {

	public static void main(String[] args) {

		int totalVertices = 5;
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(totalVertices);

		for (int i = 0; i < totalVertices; i++) {
			adjList.add(new ArrayList<Integer>());
		}
		/*
		 * test graph, disconnected graph, DFS traversal output: 0 1 2 3 4
		 */
		addEdge(adjList, 0, 1);
		addEdge(adjList, 0, 2);
		addEdge(adjList, 1, 2);
		addEdge(adjList, 3, 4);

		System.out.println("adjacency list representation of Graph\n");
		display(adjList);

		System.out.println("\nno. of Islands: " + getIslands(adjList)); // 2
	}

	private static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}

	// also called total no. of connected components
	public static int getIslands(ArrayList<ArrayList<Integer>> adjList) {

		boolean[] visited = new boolean[adjList.size()];
		int count = 0;

		for (int vtxId = 0; vtxId < adjList.size(); vtxId++) {

			if (visited[vtxId] == false) {
				count++;
				DFSTraverse(adjList, vtxId, visited);
			}
		}
		return count;
	}

	// O(V+E) Time
	private static void DFSTraverse(ArrayList<ArrayList<Integer>> adjList, int src, boolean[] visited) {
		// System.out.print(src + " "); // DFS Traversal
		visited[src] = true;

		for (Integer neighbor : adjList.get(src)) {
			if (visited[neighbor] == false) {
				DFSTraverse(adjList, neighbor, visited);
			}
		}
	}

	public static void display(ArrayList<ArrayList<Integer>> adjList) {
		for (int i = 0; i < adjList.size(); i++) {
			System.out.println(i + ": " + adjList.get(i));
		}
	}

}
