package section14_Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {

	private class Node {
		private int data;
		private ArrayList<Node> children;

		public Node(int data) {
			this.data = data;
			this.children = new ArrayList<Node>();
		}
	}

	private Node root;
	private int size;

	GenericTree() {
		Scanner sc = new Scanner(System.in);
		this.root = takeInput(sc, null, 0);
	}

	private Node takeInput(Scanner sc, Node parent, int ithChild) {
		if (parent == null) {
			System.out.println("enter data for root node: ");
		} else {
			System.out.println("Enter data for " + ithChild + "th child of " + parent.data);
		}

		int nodeData = sc.nextInt();
		Node newNode = new Node(nodeData);
		this.size++;

		System.out.println("Enter no. of children for: " + newNode.data);
		int totalChildren = sc.nextInt();
		for (int child = 0; child < totalChildren; child++) {
			Node currentChild = takeInput(sc, newNode, child);
			newNode.children.add(currentChild);
		}

		return newNode;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		// add current node data
		String ans = node.data + " => ";
		for (int child = 0; child < node.children.size(); child++) {
			// adding all children of current node
			ans = ans + node.children.get(child).data + ", ";
		}
		ans = ans + "END";
		System.out.println(ans);
		
		// display for all nodes
		for (int child = 0; child < node.children.size(); child++) {
			this.display(node.children.get(child));
		}
	}
}
