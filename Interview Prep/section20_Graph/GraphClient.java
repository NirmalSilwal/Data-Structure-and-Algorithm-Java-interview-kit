package section20_Graph;

//import java.util.ArrayList;
//import java.util.HashMap;

public class GraphClient {

	public static void main(String[] args) throws Exception {

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

		// graph.dispaly();

		/* test 1 */

		// System.out.println(graph.containsVertex("D"));
		// System.out.println(graph.containsVertex("P"));

		// System.out.println(graph.numVertex());
		// System.out.println(graph.numEdges());
		//
		// System.out.println(graph.containsEdge("A", "D"));
		// System.out.println(graph.containsEdge("C", "D"));
		// System.out.println(graph.containsEdge("C", "G"));

		// System.out.println("\nbefore: " + graph.numEdges());
		// graph.removeEdge("E", "F");
		// System.out.println("after: " + graph.numEdges());

		// graph.dispaly();

		/* test 2 */

		// graph.addEdge("C", "F", 2);
		// graph.dispaly();

		// System.out.println("before: " + graph.numVertex());
		// graph.removeVertex("F");
		// System.out.println("after: " + graph.numVertex());
		// graph.dispaly();

		/* test 3 */

		// System.out.println("tesing hasPath() method..");
		// HashMap<String, Boolean> processed = new HashMap<>();
		// System.out.println(graph.hasPath("A", "F", processed));

		// System.out.println(graph.hasPath("A", "E", new HashMap<String,
		// Boolean>()));
		// System.out.println(graph.hasPath("A", "G", new HashMap<String,
		// Boolean>()));
		// System.out.println(graph.hasPath("G", "C", new HashMap<String,
		// Boolean>()));
		// graph.removeEdge("D", "E");
		// System.out.println(graph.hasPath("B", "F", new HashMap<String,
		// Boolean>()));

		/* test 4 */

		// System.out.println("\ntesting Breadth First Search...\n");
		// System.out.println(graph.bfs("A", "F")); // ADEF true

		// // break the edge between D and E
		// // graph.removeEdge("D", "E");
		// // System.out.println(graph.bfs("A", "F")); // false

		// // break the edge between A and D
		// graph.removeEdge("A", "D");
		// System.out.println(graph.bfs("A", "F")); // ABCDEF true

		/* test 5 */

		// System.out.println("\ntesting Depth First Search...");
		// // System.out.println(graph.dfs("A", "F")); // ADEF true

		// // test by replacing vertex name B to H in the Graph
		// System.out.println(graph.dfs("A", "F")); // AHCDEF true

		// /* test 6 */

		// System.out.println("breadth first traversal...");
		// graph.breadthFirstTraversal();
		// System.out.println("\nremoving edge between D & E vertex and doing
		// bft");
		// graph.removeEdge("D", "E");
		// graph.breadthFirstTraversal();

		/* test 7 */

		// System.out.println("depth first traversal...");
		// graph.depthFirstTraversal();
		// System.out.println("\nremoving edge between D & E vertex and doing
		// dft");
		// graph.removeEdge("D", "E");
		// graph.depthFirstTraversal();

		/* test 8 */

		// System.out.println("cyclic: " + graph.isCyclic()); // true
		// graph.removeEdge("C", "D");
		// System.out.println("cyclic: " + graph.isCyclic()); // true
		// graph.removeEdge("F", "G");
		// System.out.println("cyclic: " + graph.isCyclic()); // false

		/* test 9 */

		// System.out.println("is connected Graph: " + graph.isConnected()); //
		// true
		// System.out.println("removing Edge DE");
		// graph.removeEdge("D", "E");
		// System.out.println("is connected Graph: " + graph.isConnected()); //
		// false

		/* test 10 */

		// System.out.println("is Tree: " + graph.isTree()); // false
		// graph.removeEdge("C", "D");
		// graph.removeEdge("F", "G");
		// System.out.println("is Tree: " + graph.isTree()); // true

		/* test 11 */

		// ArrayList<ArrayList<String>> cc = graph.getConnectedComponents();
		// System.out.println(cc); // [[A, B, D, C, E, F, G]]
		//
		// graph.removeEdge("D", "E");
		// ArrayList<ArrayList<String>> ccRemovedEdge =
		// graph.getConnectedComponents();
		// System.out.println(ccRemovedEdge); // [[A, B, D, C], [E, F, G]]
		//
		// graph.addVertex("H");
		// ArrayList<ArrayList<String>> ccAddedVtx =
		// graph.getConnectedComponents();
		// System.out.println(ccAddedVtx); // [[A, B, D, C], [E, F, G], [H]]

		/* test 12 */

		// System.out.println("\nTesting Prim's Algorithm");

		Graph graph2 = new Graph();

		graph2.addVertex("A");
		graph2.addVertex("B");
		graph2.addVertex("C");
		graph2.addVertex("D");
		graph2.addVertex("E");
		graph2.addVertex("F");
		graph2.addVertex("G");

		graph2.addEdge("A", "B", 2);
		graph2.addEdge("A", "D", 10);
		graph2.addEdge("B", "C", 3);
		graph2.addEdge("C", "D", 1);
		graph2.addEdge("D", "E", 8);
		graph2.addEdge("E", "F", 5);
		graph2.addEdge("E", "G", 6);
		graph2.addEdge("F", "G", 4);

		graph2.dispaly();

		// graph2.primsAlgorithm().dispaly();

		/* test 13 */

		System.out.println("\nTesting Dijkstra Algorithm...\n");

		// output: {A=0, B=2, C=5, D=6, E=14, F=19, G=20}
		System.out.println(graph2.dijkstraAlgorithm("A"));

	}
}
