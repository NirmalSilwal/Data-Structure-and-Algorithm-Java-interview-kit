package section23_GenericTree;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {

	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;

	public GenericTree() {
		int childIndex = -1;
		Node rootParent = null;
		this.root = construct(rootParent, childIndex);
	}

	private Node construct(Node parent, int ith) {
		
		// root node
		if (parent == null) {
			System.out.println("Enter the data for root node?");
		} else {
			// prompt
			System.out.println("Enter the data for " + ith + " child of " + parent.data + "?");
		}
		
		// take node data
		int item = sc.nextInt();

		// create Node
		Node newNode = new Node();
		newNode.data = item;

		// prompt
		System.out.println("Enter the no. of children of " + item + "?");

		int totalChild = sc.nextInt();
		// create all children of newNode
		for (int childIdx = 0; childIdx < totalChild; childIdx++) {

			Node child = construct(newNode, childIdx);
			newNode.children.add(child);
		}

		return newNode;
	}
}
