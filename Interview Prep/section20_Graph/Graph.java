package section20_Graph;

import java.util.ArrayList;
import java.util.HashMap;

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
}
