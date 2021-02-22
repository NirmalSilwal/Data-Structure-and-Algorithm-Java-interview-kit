package section14_Tree;

import java.util.Scanner;

public class BinaryTree {

	private class Node {
		private int data;
		private Node left;
		private Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node root;
	private int size;

	BinaryTree() {
		Scanner sc = new Scanner(System.in);
		this.root = takeInput(sc, null, false);
	}

	private Node takeInput(Scanner sc, Node parent, boolean isLeftOrRight) {
		if (parent == null) {
			System.out.println("Enter data for root node: ");
		} else {
			if (isLeftOrRight)
				System.out.println("Enter data for left node of " + parent.data);
			else
				System.out.println("Enter data for right node of " + parent.data);
		}

		int nodeData = sc.nextInt();
		Node newNode = new Node(nodeData, null, null);
		this.size++;

		boolean choice = false;
		System.out.println("Is there left child of " + newNode.data + "? Press true/false");
		choice = sc.nextBoolean();

		if (choice) {
			newNode.left = takeInput(sc, newNode, true);
		}

		choice = false;

		System.out.println("Is there right child of " + newNode.data + "? Press true/false");
		choice = sc.nextBoolean();

		if (choice) {
			newNode.right = takeInput(sc, newNode, false);
		}

		return newNode;
	}

	public void display() {
		this.display(root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + " => ");
		} else {
			System.out.print("NULL => ");
		}

		System.out.print(node.data);

		if (node.right != null) {
			System.out.print(" <= " + node.right.data);
		} else {
			System.out.print(" <= NULL");
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
