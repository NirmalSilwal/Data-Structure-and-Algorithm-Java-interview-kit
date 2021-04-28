package section24_BinaryTree;

import java.util.Scanner;

public class BinaryTree {

	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinaryTree() {
		this.root = takeInput(null, false);
	}

	private Node takeInput(Node parent, boolean isLeftChild) {

		// prompt
		if (parent == null) {
			System.out.println("Enter the data for root node: ");
		} else {
			if (isLeftChild)
				System.out.println("Enter the data for left child of " + parent.data);
			else
				System.out.println("Enter the data for right child of " + parent.data);
		}

		// take input of data
		int item = sc.nextInt();
		// create new Node
		Node newNode = new Node();
		newNode.data = item;

		System.out.println("Do you have left child of " + newNode.data + " ?, press Y/N");
		char hasLeft = sc.next().charAt(0);

		// if left child exists, create it
		if (hasLeft == 'Y') {
			newNode.left = takeInput(newNode, true);
		}

		System.out.println("Do you have right child of " + newNode.data + " ?, press Y/N");
		char hasRight = sc.next().charAt(0);

		// if right child exists, create it
		if (hasRight == 'Y') {
			newNode.right = takeInput(newNode, false);
		}

		// node is ready
		return newNode;
	}

	public void display() {
		System.out.println("\n--------------------");
		display(root);
		System.out.println("--------------------");
	}

	private void display(Node node) {
		// base case
		if (node == null)
			return;

		// self-work
		String str = "";

		if (node.left != null)
			str += node.left.data;
		else
			str += ". ";

		str += " => " + node.data + " <= ";

		if (node.right != null)
			str += node.right.data;
		else
			str += '.';

		System.out.println(str);

		// smaller problems
		display(node.left);
		display(node.right);
	}
}
