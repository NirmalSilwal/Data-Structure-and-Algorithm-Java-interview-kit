package Graph;

import java.util.ArrayList;

public class DetectCycleDirectedGraph {

	public static void main(String[] args) {

		int totalVertices = 4; // test graph 1
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(totalVertices);
		for (int i = 0; i < totalVertices; i++) {
			adjList.add(new ArrayList<Integer>());
		}

		// test graph 1, cycle - true

//		addEdge(adjList, 0, 1);
//		addEdge(adjList, 1, 2);
//		addEdge(adjList, 2, 3);
//		addEdge(adjList, 3, 1);

		// test graph 2, cycle - false

		addEdge(adjList, 0, 1);
		addEdge(adjList, 2, 1);
		addEdge(adjList, 2, 3);
		addEdge(adjList, 1, 3);

		display(adjList);
		System.out.println("\nhas cycle: " + hasCycleDirected(adjList));

	}

	private static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {
		adjList.get(u).add(v);
		// adjList.get(v).add(u);
	}

	public static void display(ArrayList<ArrayList<Integer>> adjList) {
		for (int i = 0; i < adjList.size(); i++) {
			System.out.println(i + ": " + adjList.get(i));
		}
	}

	// O(V+E) Time
	private static boolean hasCycleDirected(ArrayList<ArrayList<Integer>> adjList) {
		return depthFirstTraverse(adjList);
	}

	private static boolean depthFirstTraverse(ArrayList<ArrayList<Integer>> adjList) {

		boolean[] visited = new boolean[adjList.size()];

		// to track 'Back Edge' in recursion stack
		boolean[] recursionStack = new boolean[adjList.size()];

		for (int i = 0; i < adjList.size(); i++) {

			if (visited[i] == false) {

				if (dfsRecursion(adjList, i, visited, recursionStack)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean dfsRecursion(ArrayList<ArrayList<Integer>> adjList, int src, boolean[] visited,
			boolean[] recursionStack) {

		visited[src] = true;
		recursionStack[src] = true; // src currently in recursive call stack

		for (Integer neighbor : adjList.get(src)) {

			if (visited[neighbor] == false) {
				if (dfsRecursion(adjList, neighbor, visited, recursionStack) == true) {
					return true; // cycle exists
				}
			} else if (recursionStack[neighbor] == true)
				return true;
		}
		recursionStack[src] = false; // src is now removed from the call stack

		return false;
	}
}
