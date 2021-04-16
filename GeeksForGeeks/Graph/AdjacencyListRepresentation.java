package Graph;

import java.util.ArrayList;

public class AdjacencyListRepresentation {

	public static void main(String[] args) {

		// adjacency list representation using dynamic sized arrays
		int capacity = 4;
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(capacity);

		for (int vertexNo = 0; vertexNo < capacity; vertexNo++) {
			adjList.add(new ArrayList<Integer>(vertexNo));
		}

		printGraph(adjList);
		System.out.println("\nadding edges..");

		addEdge(adjList, 0, 1);
		addEdge(adjList, 0, 2);
		addEdge(adjList, 1, 2);
		addEdge(adjList, 2, 3);

		printGraph(adjList);
	}

	private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	private static void printGraph(ArrayList<ArrayList<Integer>> adjList) {
		for (int i = 0; i < adjList.size(); i++) {
			System.out.println(i + ": " + adjList.get(i));
		}
	}
}

/* output:
0: []
1: []
2: []
3: []

adding edges..
0: [1, 2]
1: [0, 2]
2: [0, 1, 3]
3: [2]
*/