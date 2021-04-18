package section20_Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import section18_Tries.HeapGeneric; // to implement Prim's algorithm

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

			Vertex removePairVertex = this.vertices.get(removePair.vname); // address
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

	// Depth First Search implementation
	// it first explores all neighbors & then only it's siblings

	public boolean dfs(String src, String dest) {

		HashMap<String, Boolean> processed = new HashMap<>();

		// use addLast() and removeFirst() of LinkedList - O(1) Time operations
		LinkedList<Pair> stack = new LinkedList<>(); // Queue using LinkedList

		// create a new Pair
		Pair srcPair = new Pair();
		srcPair.vname = src;
		srcPair.pathSoFar = src;

		// put the new pair in queue
		stack.addFirst(srcPair);

		// while queue is not empty keep on doing the work
		while (!stack.isEmpty()) {

			// remove a pair from the queue
			Pair removePair = stack.removeFirst();

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

			Vertex removePairVertex = this.vertices.get(removePair.vname); // address
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

					stack.addFirst(newPair);
				}
			}
		}

		return false;
	}

	public void breadthFirstTraversal() {

		HashMap<String, Boolean> processed = new HashMap<>();

		// use addLast() and removeFirst() of LinkedList - O(1) Time operations
		LinkedList<Pair> queue = new LinkedList<>(); // Queue using LinkedList

		ArrayList<String> key = new ArrayList<>(this.vertices.keySet());

		// looping all vertices/nodes/keys
		for (String node : key) {

			// if graph is disconnected, handle that case
			// runs for all components of the Graph
			if (processed.containsKey(node)) {
				continue;
			}
			// create a new Pair
			Pair srcPair = new Pair();
			srcPair.vname = node;
			srcPair.pathSoFar = node;

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

				System.out.println(removePair.vname + " via " + removePair.pathSoFar);

				// devote work to neighbors

				Vertex removePairVertex = this.vertices.get(removePair.vname); // address
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
		}
	}

	public void depthFirstTraversal() {

		HashMap<String, Boolean> processed = new HashMap<>();

		// use addFirst() and removeFirst() of LinkedList - O(1) Time operations
		LinkedList<Pair> stack = new LinkedList<>(); // Queue using LinkedList

		ArrayList<String> key = new ArrayList<>(this.vertices.keySet());

		// looping all vertices/nodes/keys
		for (String node : key) {

			// if graph is disconnected, handle that case
			// runs for all components of the Graph
			if (processed.containsKey(node)) {
				continue;
			}
			// create a new Pair
			Pair srcPair = new Pair();
			srcPair.vname = node;
			srcPair.pathSoFar = node;

			// put the new pair in queue
			stack.addFirst(srcPair);

			// while queue is not empty keep on doing the work
			while (!stack.isEmpty()) {

				// remove a pair from the queue
				Pair removePair = stack.removeFirst();

				// check if that vertex is already processed
				if (processed.containsKey(removePair.vname)) {
					continue;
				}

				processed.put(removePair.vname, true);

				System.out.println(removePair.vname + " via " + removePair.pathSoFar);

				// devote work to neighbors

				Vertex removePairVertex = this.vertices.get(removePair.vname); // address
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

						stack.addFirst(newPair);
					}
				}
			}
		}
	}

	public boolean isCyclic() {

		HashMap<String, Boolean> processed = new HashMap<>();

		// use addLast() and removeFirst() of LinkedList - O(1) Time operations
		LinkedList<Pair> queue = new LinkedList<>(); // Queue using LinkedList

		ArrayList<String> key = new ArrayList<>(this.vertices.keySet());

		// looping all vertices/nodes/keys
		for (String node : key) {

			// if graph is disconnected, handle that case
			// runs for all components of the Graph
			if (processed.containsKey(node)) {
				continue;
			}
			// create a new Pair
			Pair srcPair = new Pair();
			srcPair.vname = node;
			srcPair.pathSoFar = node;

			// put the new pair in queue
			queue.addLast(srcPair);

			// while queue is not empty keep on doing the work
			while (!queue.isEmpty()) {

				// remove a pair from the queue
				Pair removePair = queue.removeFirst();

				// check if that vertex is already processed, if so then cycle
				// is present
				if (processed.containsKey(removePair.vname)) {
					return true;
				}

				processed.put(removePair.vname, true);

				// devote work to neighbors

				Vertex removePairVertex = this.vertices.get(removePair.vname); // address
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
		}
		return false;
	}

	public boolean isConnected() {

		int flag = 0; // to count no. of components in Graph

		HashMap<String, Boolean> processed = new HashMap<>();

		// use addLast() and removeFirst() of LinkedList - O(1) Time operations
		LinkedList<Pair> queue = new LinkedList<>(); // Queue using LinkedList

		ArrayList<String> key = new ArrayList<>(this.vertices.keySet());

		// looping all vertices/nodes/keys
		for (String node : key) {

			// if graph is disconnected, handle that case
			// runs for all components of the Graph
			if (processed.containsKey(node)) {
				continue;
			}

			flag++;

			// create a new Pair
			Pair srcPair = new Pair();
			srcPair.vname = node;
			srcPair.pathSoFar = node;

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

				// devote work to neighbors

				Vertex removePairVertex = this.vertices.get(removePair.vname); // address
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
		}

		// flag == 1 denotes, Graph has only one component
		if (flag >= 2) {
			return false;
		} else {
			return true;
		}
	}

	// Tree is an acyclic connected graph

	public boolean isTree2() {

		int flag = 0; // to check if Graph is connected or not

		HashMap<String, Boolean> processed = new HashMap<>();

		// use addLast() and removeFirst() of LinkedList - O(1) Time operations
		LinkedList<Pair> queue = new LinkedList<>(); // Queue using LinkedList

		ArrayList<String> key = new ArrayList<>(this.vertices.keySet());

		// looping all vertices/nodes/keys
		for (String node : key) {

			// if graph is disconnected, handle that case
			// runs for all components of the Graph
			if (processed.containsKey(node)) {
				continue;
			}

			flag++;

			// create a new Pair
			Pair srcPair = new Pair();
			srcPair.vname = node;
			srcPair.pathSoFar = node;

			// put the new pair in queue
			queue.addLast(srcPair);

			// while queue is not empty keep on doing the work
			while (!queue.isEmpty()) {

				// remove a pair from the queue
				Pair removePair = queue.removeFirst();

				// check if that vertex is already processed, if so then cycle
				// is present, for tree, it should be acyclic
				if (processed.containsKey(removePair.vname)) {
					return false;
				}

				processed.put(removePair.vname, true);

				// devote work to neighbors

				Vertex removePairVertex = this.vertices.get(removePair.vname); // address
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
		}
		if (flag >= 2) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isTree() {
		return !isCyclic() && isConnected();
	}

	public ArrayList<ArrayList<String>> getConnectedComponents() {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> queue = new LinkedList<>(); // Queue using LinkedList

		ArrayList<String> key = new ArrayList<>(this.vertices.keySet());

		// to store result
		ArrayList<ArrayList<String>> connComponentsResult = new ArrayList<>();

		for (String node : key) {

			// runs for all components of the Graph
			if (processed.containsKey(node)) {
				continue;
			}
			// new component started
			ArrayList<String> subAns = new ArrayList<>();

			Pair srcPair = new Pair();
			srcPair.vname = node;
			srcPair.pathSoFar = node;

			queue.addLast(srcPair);

			while (!queue.isEmpty()) {

				Pair removePair = queue.removeFirst();

				if (processed.containsKey(removePair.vname)) {
					continue;
				}

				// add vertex of current components in ArrayList
				subAns.add(removePair.vname);

				processed.put(removePair.vname, true);

				// devote work to neighbors
				Vertex removePairVertex = this.vertices.get(removePair.vname); // address
				ArrayList<String> removePairNbrs = new ArrayList<>(removePairVertex.nbrs.keySet());

				for (String nbr : removePairNbrs) {

					if (!processed.containsKey(nbr)) {

						Pair newPair = new Pair();
						newPair.vname = nbr;
						newPair.pathSoFar = removePair.pathSoFar + nbr;

						queue.addLast(newPair);
					}
				}
			}
			// store result of current components
			connComponentsResult.add(subAns);
		}
		return connComponentsResult;
	}

	// Prim's Algorithm implementation

	private class PrimsPair implements Comparable<PrimsPair> {
		String vname; // vertex name
		String acquiringVname; // from which vertex we come to this vertex
		int cost;

		/*
		 * @see java.lang.Comparable#compareTo(java.lang.Object)
		 */
		@Override
		public int compareTo(PrimsPair other) {
			return other.cost - this.cost;
		}
	}

	// returns MST
	public Graph primsAlgorithm() throws Exception {

		Graph mst = new Graph();

		HashMap<String, PrimsPair> map = new HashMap<>();

		HeapGeneric<PrimsPair> heap = new HeapGeneric<>(); // min heap

		// make a pair and put in heap and hashmap
		for (String key : vertices.keySet()) {

			PrimsPair newPair = new PrimsPair();

			newPair.vname = key;
			newPair.acquiringVname = null;
			newPair.cost = Integer.MAX_VALUE;

			heap.add(newPair);
			map.put(key, newPair);
		}

		// till the heap is not empty, keep on removing the pairs
		while (!heap.isEmpty()) {

			// remove a Pair
			PrimsPair removedPair = heap.remove();
			map.remove(removedPair.vname);

			// add in MST
			if (removedPair.acquiringVname == null) {
				mst.addVertex(removedPair.vname);
			} else {
				mst.addVertex(removedPair.vname);
				mst.addEdge(removedPair.vname, removedPair.acquiringVname, removedPair.cost);
			}

			// do work for neighbors
			for (String nbr : vertices.get(removedPair.vname).nbrs.keySet()) {

				// work for neighbors which are in heap
				if (map.containsKey(nbr)) {

					// get the old cost and new cost
					int oldCost = map.get(nbr).cost;
					int newCost = vertices.get(removedPair.vname).nbrs.get(nbr);

					// update the pair only when new cost is less than old cost
					if (newCost < oldCost) {

						PrimsPair getPair = map.get(nbr);
						getPair.acquiringVname = removedPair.vname;
						getPair.cost = newCost;

						// after changing cost, priority of Pair might change in
						// Heap so updating in heap position for that Pair
						heap.updatePriority(getPair);
					}
				}
			}
		}

		return mst;
	}
}
