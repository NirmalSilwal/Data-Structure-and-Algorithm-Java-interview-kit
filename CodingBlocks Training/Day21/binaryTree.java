package Lecture21;

import java.util.Scanner;

public class binaryTree {

	// CAUTION! make it private if you'r defining tree in your own
	public class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	// CAUTION!
	// making root node default rather than private, just for educational purpose
	// since we'r using it in other program in this package, making root node private
	// don't allow us to use it in other program directly so either we've to make our
	// own tree, so just for reusing code, we'r making it default instead of private
	Node root;
	private int size = 0;

	public binaryTree() {
		Scanner sc = new Scanner(System.in);
		this.root = takeTreeInput(sc, null, false);
	}

	private Node takeTreeInput(Scanner sc, Node parent, boolean isLeftorRight) {
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

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + " => ");
		} else {
			System.out.print("END => ");
		}

		System.out.print(node.data);

		if (node.right != null) {
			System.out.print(" <= " + node.right.data);
		} else {
			System.out.print(" <= END");
		}
		System.out.println();

		if (node.left != null) {
			this.display(node.left);
		}
		if (node.right != null) {
			this.display(node.right);
		}
	}

}
