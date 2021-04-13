package section20_Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Graph {

	private class Vertex {
		// stores all neighbors of particular Node
		HashMap<String, Integer> nbrs = new HashMap<>();
	}

	HashMap<String, Vertex> vertices;

	public Graph() {
		vertices = new HashMap<>();
	}

	public int numVertex() {
		return this.vertices.size();
	}

	public boolean containsVertex(String vname) {
		return this.vertices.containsKey(vname);
	}

	public void addVertex(String vname) {
		Vertex vtx = new Vertex();
		this.vertices.put(vname, vtx);
	}

	public void removeVertex(String vname) {
		if (this.vertices.get(vname) == null) {
			return;
		}
		Vertex vtx = this.vertices.get(vname);

		ArrayList<String> allNeighborsKeys = new ArrayList<>(vtx.nbrs.keySet());
		// removing vname from their neighbors first
		for (String key : allNeighborsKeys) {
			Vertex nbrVertex = this.vertices.get(key);
			nbrVertex.nbrs.remove(vname);
		}
		// now removing neighbors form Graph
		this.vertices.remove(vname);
	}

	public int numEdges() {
		int count = 0;
		ArrayList<String> keys = new ArrayList<>(this.vertices.keySet());
		for (String key : keys) {
			Vertex vtx = vertices.get(key);
			count += vtx.nbrs.size();
		}
		return count / 2;
	}

	public boolean containsEdge(String vname1, String vname2) {
		Vertex firstNode = vertices.get(vname1);
		Vertex secondNode = vertices.get(vname2);

		if (firstNode == null || secondNode == null || !firstNode.nbrs.containsKey(vname2)) {
			return false;
		}
		return true;
	}

	public void addEdge(String vname1, String vname2, int cost) {
		Vertex vertex1 = vertices.get(vname1);
		Vertex vertex2 = vertices.get(vname2);

		if (vertex1 == null || vertex2 == null || vertex1.nbrs.containsKey(vname2)) {
			return;
		}
		vertex1.nbrs.put(vname2, cost);
		vertex2.nbrs.put(vname1, cost);
	}

	public void removeEdge(String vname1, String vname2) {
		Vertex vertex1 = vertices.get(vname1);
		Vertex vertex2 = vertices.get(vname2);

		if (vertex1 == null || vertex2 == null || !vertex1.nbrs.containsKey(vname2)) {
			return;
		}
		vertex1.nbrs.remove(vname2);
		vertex2.nbrs.remove(vname1);
	}

	public void dispaly() {
		System.out.println("--------------------------");
		ArrayList<String> allKeys = new ArrayList<>(this.vertices.keySet());
		for (String key : allKeys) {
			Vertex vtx = this.vertices.get(key);
			System.out.println(key + ": " + vtx.nbrs);
		}
		System.out.println("--------------------------");
	}

	public boolean hasPath(String vname1, String vname2, HashMap<String, Boolean> processed) {

		processed.put(vname1, true);

		// check direct edge
		if (this.containsEdge(vname1, vname2)) {
			return true;
		}

		// check in neighbors
		Vertex vtx = vertices.get(vname1);

		ArrayList<String> neighbors1 = new ArrayList<>(vtx.nbrs.keySet());

		for (String nbrKey : neighbors1) {
			if (!processed.containsKey(nbrKey)) {
				if (hasPath(nbrKey, vname2, processed)) {
					return true;
				}
			}
		}
		return false;
	}

	// Breadth First Search implementation

	private class Pair {
		String vname; // vertex name
		String pathSoFar;
	}

	public boolean bfs(String src, String dest) {

		HashMap<String, Boolean> processed = new HashMap<>();

		// use addLast() and removeFirst() of LinkedList - O(1) Time operations
		LinkedList<Pair> queue = new LinkedList<>(); // Queue using LinkedList

		// create a new Pair
		Pair srcPair = new Pair();
		srcPair.vname = src;
		srcPair.pathSoFar = src;

		// put the new pair in queue
		queue.addLast(srcPair);

		// while queue is not empty keep on doing the work
		while (!queue.isEmpty()) {

			// remove a pair from the queue
			Pair removePair = queue.removeFirst();

			// check if that vertex is already processed
			if (processed.containsKey(removePair.vname)) {
				continue;
			}
			
			processed.put(removePair.vname, true);

			// check direct edge
			if (this.containsEdge(removePair.vname, dest)) {
				System.out.println(removePair.pathSoFar + dest);
				return true;
			}

			// devote work to neighbors

			Vertex removePairVertex = this.vertices.get(removePair.vname);
			// all neighbors of removedPair vertex
			ArrayList<String> removePairNbrs = new ArrayList<>(removePairVertex.nbrs.keySet());

			// loop on neighbors
			for (String nbr : removePairNbrs) {

				// process only unprocessed neighbors
				if (!processed.containsKey(nbr)) {

					// make a new pair of neighbor & put it in Queue
					Pair newPair = new Pair();
					newPair.vname = nbr;
					newPair.pathSoFar = removePair.pathSoFar + nbr;

					queue.addLast(newPair);
				}
			}
		}

		return false;
	}

}
