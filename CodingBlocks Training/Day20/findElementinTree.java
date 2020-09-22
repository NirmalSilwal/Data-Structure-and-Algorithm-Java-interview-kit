package Lecture20;

import java.util.Scanner;

public class findElementinTree {

	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node root;
	private int size = 0;

	public findElementinTree() {
		Scanner sc = new Scanner(System.in);

		// initially tree is empty, so parent is also null and child is also false
		this.root = takeTreeInput(sc, null, false);
	}

	private Node takeTreeInput(Scanner sc, Node parent, boolean isLeftorRight) {
		/*
		 * @param sc: object for taking user input
		 * 
		 * @param parent: parent node for given node
		 * 
		 * @param isLeftorRight: tells whether it has left child or right child
		 */

		if (parent == null) {
			System.out.print("Enter data for root node: ");
		} else {
			if (isLeftorRight) {
				System.out.print("Enter data for left child of " + parent.data + ": ");
			} else {
				System.out.print("Enter data for right child of: " + parent.data + ": ");

			}
		}

		int data = sc.nextInt();

		// creating node with data, and both child pointing to null initially
		Node node = new Node(data, null, null);
		this.size++;

		boolean choice = false;
		System.out.print("Do you have left child for " + node.data + " -> true/false: ");
		choice = sc.nextBoolean();
		if (choice) {
			node.left = this.takeTreeInput(sc, node, true);
		}

		choice = false;
		System.out.print("Do you have right child for " + node.data + " -> true/false: ");
		choice = sc.nextBoolean();
		if (choice) {
			node.right = this.takeTreeInput(sc, node, false);
		}

		return node;
	}

	public boolean find(int data) {
		return this.find(this.root, data);
	}

	private boolean find(Node node, int data) {
		if (node == null) {
			return false;
		}
		if (node.data == data) {
			return true;
		} else if (this.find(node.left, data)) {
			return true;
		} else if (this.find(node.right, data)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		findElementinTree btree = new findElementinTree();

		int data = 16;
		boolean isPresent = btree.find(data);
		System.out.println("====================================================\n");
		System.out.println(data + " is present in tree: " + isPresent);
	}
}




/* output:
Enter data for root node: 20
Do you have left child for 20 -> true/false: true
Enter data for left child of 20: 10
Do you have left child for 10 -> true/false: true
Enter data for left child of 10: 28
Do you have left child for 28 -> true/false: false
Do you have right child for 28 -> true/false: true
Enter data for right child of: 28: 2
Do you have left child for 2 -> true/false: false
Do you have right child for 2 -> true/false: false
Do you have right child for 10 -> true/false: true
Enter data for right child of: 10: 16
Do you have left child for 16 -> true/false: false
Do you have right child for 16 -> true/false: false
Do you have right child for 20 -> true/false: true
Enter data for right child of: 20: 30
Do you have left child for 30 -> true/false: true
Enter data for left child of 30: 42
Do you have left child for 42 -> true/false: false
Do you have right child for 42 -> true/false: false
Do you have right child for 30 -> true/false: false
====================================================

16 is present in tree: true
*/