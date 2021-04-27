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
			System.out.println("Enter the data for " + ith + "th child of " + parent.data + "?");
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

	public void display() {
		System.out.println("------------------------------------------\n");
		this.display(this.root);
		System.out.println("------------------------------------------\n");
	}

	private void display(Node node) {

		// self-work
		String ans = node.data + " => ";
		// loop childrens of current node
		for (Node child : node.children) {
			ans += child.data + " ";
		}

		ans += " . ";
		System.out.println(ans);

		// do the work for smaller problems
		for (Node child : node.children) {
			display(child);
		}
	}

	public int size() {
		return size(root);
	}

	private int size(Node node) {
		int totalSize = 0;

		// count total children of current node
		for (Node child : node.children) {
			int childSize = size(child);
			totalSize += childSize;
		}

		return totalSize + 1; // +1 for parent node
	}

	public int max() {
		return max(root);
	}

	/*
	 * private int max(Node node) {
	 * 
	 * int currentMax = Integer.MIN_VALUE; int maxChild = Integer.MIN_VALUE;
	 * 
	 * for (Node child : node.children) { maxChild = max(child); }
	 * 
	 * if (maxChild > currentMax) { currentMax = maxChild; }
	 * 
	 * return Math.max(currentMax, node.data); }
	 */

	private int max(Node node) {

		int totalMax = node.data;

		for (Node child : node.children) {

			int childMax = max(child);

			if (childMax > totalMax) {
				totalMax = childMax;
			}
		}

		return totalMax;
	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node node, int item) {

		if (node.data == item) {
			return true;
		}

		for (Node child : node.children) {

			boolean childResult = find(child, item);

			if (childResult) {
				return true;
			}
		}

		return false;
	}

	public int height() {
		return height(root);
	}

	private int height(Node node) {

		// leaf node
		if (node.children.size() == 0) {
			return 0;
		}
		
		// can remove base case by initializing maxHeight by -1
		int maxHeight = 0;

		for (Node child : node.children) {

			int currChildHt = height(child);

			if (currChildHt > maxHeight) {
				maxHeight = currChildHt;
			}
		}

		// +1 for height from root to max height child, level 0 to level 1
		return maxHeight + 1;
	}
}
