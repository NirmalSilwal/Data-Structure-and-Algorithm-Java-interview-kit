package section14_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
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

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		if (node == null)
			return -1;

		int leftHeight = this.height(node.left);
		int rightHeight = this.height(node.right);

		// +1 for edge between left node and root / right node and root
		int heightOfTree = Math.max(leftHeight, rightHeight) + 1;

		return heightOfTree;
	}

	// tree traversals

	public void preOrderTraversal() {
		this.preOrderTraversal(this.root);
	}

	private void preOrderTraversal(Node node) {
		if (node == null)
			return;

		// NLR: Node Left Right
		System.out.print(node.data + " ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}

	public void inOrderTraversal() {
		this.inOrderTraversal(this.root);
	}

	private void inOrderTraversal(Node node) {
		if (node == null)
			return;

		// LNR
		inOrderTraversal(node.left);
		System.out.print(node.data + " ");
		inOrderTraversal(node.right);

	}

	public void postOrderTraversal() {
		this.postOrderTraversal(this.root);
	}

	private void postOrderTraversal(Node node) {
		if (node == null)
			return;

		// LRN
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.print(node.data + " ");
	}

	public void levelOrderTraversal() {
		this.levelOrderTraversal(this.root);
	}

	private void levelOrderTraversal(Node node) {
		if (node == null)
			return;
		// using Queue data structure using LinkedList
		LinkedList<Node> queue = new LinkedList<Node>();

		queue.addLast(node);

		while (!queue.isEmpty()) {
			Node removedNode = queue.removeFirst();
			System.out.print(removedNode.data + " ");

			if (removedNode.left != null)
				queue.addLast(removedNode.left);

			if (removedNode.right != null)
				queue.addLast(removedNode.right);
		}
	}

	// check if given binary tree is BST
	// approach 1
	public boolean isBinaryTreeTheBST() {
		ArrayList<Integer> inOrder = getInOrder(this.root, new ArrayList<Integer>());

		boolean checkBst = isSorted(inOrder);

		return checkBst;
	}

	private ArrayList<Integer> getInOrder(Node node, ArrayList<Integer> list) {
		if (node == null) {
			return list;
		}
		// LNR
		getInOrder(node.left, list);
		list.add(node.data);
		getInOrder(node.right, list);

		return list;
	}

	private boolean isSorted(ArrayList<Integer> list) {
		for (int index = 0; index < list.size() - 1; index++) {
			if (list.get(index) > list.get(index + 1))
				return false;
		}
		return true;
	}

	// approach 2
	public boolean isBST() {
		boolean ans = isBinaryTreeTheBST2(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		return ans;
	}

	private boolean isBinaryTreeTheBST2(Node node, int min, int max) {
		if (node == null)
			return true;

		if (node.data < min || node.data > max)
			return false;
		else if (!isBinaryTreeTheBST2(node.left, min, node.data))
			return false;
		else if (!isBinaryTreeTheBST2(node.right, node.data, max))
			return false;

		return true;
	}
}
