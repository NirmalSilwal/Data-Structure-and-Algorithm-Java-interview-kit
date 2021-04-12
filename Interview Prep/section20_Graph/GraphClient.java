package section20_Graph;

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

		System.out.println(graph.containsVertex("D"));
		System.out.println(graph.containsVertex("P"));

		System.out.println(graph.numVertex());
		System.out.println(graph.numEdges());

		System.out.println(graph.containsEdge("A", "D"));
		System.out.println(graph.containsEdge("C", "D"));
		System.out.println(graph.containsEdge("C", "G"));

		System.out.println("\nbefore: " + graph.numEdges());
		graph.removeEdge("E", "F");
		System.out.println("after: " + graph.numEdges());

		graph.dispaly();

		graph.addEdge("C", "F", 2);
		graph.dispaly();

		System.out.println("before: " + graph.numVertex());
		graph.removeVertex("F");
		System.out.println("after: " + graph.numVertex());
		graph.dispaly();
	}
}

/* output:
--------------------------
A: {B=3, D=2}
B: {A=3, C=4}
C: {B=4, D=7}
D: {A=2, C=7, E=10}
E: {D=10, F=9, G=8}
F: {E=9, G=6}
G: {E=8, F=6}
--------------------------
true
false
7
8
true
true
false

before: 8
after: 7
--------------------------
A: {B=3, D=2}
B: {A=3, C=4}
C: {B=4, D=7}
D: {A=2, C=7, E=10}
E: {D=10, G=8}
F: {G=6}
G: {E=8, F=6}
--------------------------
--------------------------
A: {B=3, D=2}
B: {A=3, C=4}
C: {B=4, D=7, F=2}
D: {A=2, C=7, E=10}
E: {D=10, G=8}
F: {C=2, G=6}
G: {E=8, F=6}
--------------------------
before: 7
after: 6
--------------------------
A: {B=3, D=2}
B: {A=3, C=4}
C: {B=4, D=7}
D: {A=2, C=7, E=10}
E: {D=10, G=8}
G: {E=8}
--------------------------
*/