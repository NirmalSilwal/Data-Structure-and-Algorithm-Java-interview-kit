package Graph;

import java.util.ArrayList;

public class DetectCycleUndirectedGraph {

	private static boolean hasCycle(ArrayList<ArrayList<Integer>> adjList) {
		return depthFirstTraverse(adjList);
	}

	private static boolean depthFirstTraverse(ArrayList<ArrayList<Integer>> adjList) {

		boolean[] visited = new boolean[adjList.size()];

		for (int i = 0; i < adjList.size(); i++) {

			if (visited[i] == false) {

				int isParent = -1;
				if (dfsRecursion(adjList, i, visited, isParent) == true) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean dfsRecursion(ArrayList<ArrayList<Integer>> adjList, int src, boolean[] visited, int parent) {
		visited[src] = true;

		for (Integer neighbor : adjList.get(src)) {

			if (visited[neighbor] == false) {

				if (dfsRecursion(adjList, neighbor, visited, src) == true) {
					return true; // cycle exists
				}
			} else if (neighbor != parent)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		// int totalVertices = 6; // test graph 1
		// int totalVertices = 5; // test graph 2
		int totalVertices = 4; // test graph 3

		ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(totalVertices);
		for (int i = 0; i < totalVertices; i++) {
			adjList.add(new ArrayList<Integer>());
		}

		// test graph 1, cycle - true

		// addEdge(adjList, 0, 1);
		// addEdge(adjList, 1, 2);
		// addEdge(adjList, 1, 3);
		// addEdge(adjList, 3, 2);
		// addEdge(adjList, 2, 4);
		// addEdge(adjList, 4, 5);

		// test graph 2, cycle - false

		// addEdge(adjList, 0, 1);
		// addEdge(adjList, 1, 2);
		// addEdge(adjList, 1, 4);
		// addEdge(adjList, 2, 3);

		// test graph 3, cycle - true

		addEdge(adjList, 0, 1);
		addEdge(adjList, 0, 3);
		addEdge(adjList, 1, 3);
		addEdge(adjList, 1, 2);
		addEdge(adjList, 2, 3);

		System.out.println("adjacency list representation of Graph\n");
		display(adjList);

		System.out.println("\nhas cycle: " + hasCycle(adjList)); // 2
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
}
