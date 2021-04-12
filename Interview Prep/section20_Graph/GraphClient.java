package section20_Graph;

import java.util.HashMap;

public class GraphClient {

	public static void main(String[] args) {

		Graph graph = new Graph();

		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");

		graph.addEdge("A", "D", 2);
		graph.addEdge("A", "B", 3);
		graph.addEdge("B", "C", 4);
		graph.addEdge("C", "D", 7);
		graph.addEdge("D", "E", 10);
		graph.addEdge("E", "F", 9);
		graph.addEdge("E", "G", 8);
		graph.addEdge("F", "G", 6);

		graph.dispaly();

		// System.out.println(graph.containsVertex("D"));
		// System.out.println(graph.containsVertex("P"));
		//
		// System.out.println(graph.numVertex());
		// System.out.println(graph.numEdges());
		//
		// System.out.println(graph.containsEdge("A", "D"));
		// System.out.println(graph.containsEdge("C", "D"));
		// System.out.println(graph.containsEdge("C", "G"));
		//
		// System.out.println("\nbefore: " + graph.numEdges());
		// graph.removeEdge("E", "F");
		// System.out.println("after: " + graph.numEdges());
		//
		// graph.dispaly();
		//
		// graph.addEdge("C", "F", 2);
		// graph.dispaly();
		//
		// System.out.println("before: " + graph.numVertex());
		// graph.removeVertex("F");
		// System.out.println("after: " + graph.numVertex());
		// graph.dispaly();

		System.out.println("tesing hasPath() method..");
		HashMap<String, Boolean> processed = new HashMap<>();
		System.out.println(graph.hasPath("A", "F", processed));

		System.out.println(graph.hasPath("A", "E", new HashMap<String, Boolean>()));
		System.out.println(graph.hasPath("A", "G", new HashMap<String, Boolean>()));
		System.out.println(graph.hasPath("G", "C", new HashMap<String, Boolean>()));
		graph.removeEdge("D", "E");
		System.out.println(graph.hasPath("B", "F", new HashMap<String, Boolean>()));

	}
}
