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

	// O(N)Time
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

	// O(N)Time
	public int size() {
		return size(root);
	}

	private int size(Node node) {
		if (node == null)
			return 0;

		int lsize = size(node.left);
		int rsize = size(node.right);

		return lsize + rsize + 1;
	}

	// O(N)Time
	public int max() {
		return max(root);
	}

	/*
	 * private int max(Node node) {
	 * 
	 * int totalMax = node.data;
	 * 
	 * if (node.left != null) { int lmax = max(node.left);
	 * 
	 * if (lmax > totalMax) totalMax = lmax; }
	 * 
	 * if (node.right != null) { int rmax = max(node.right);
	 * 
	 * if (rmax > totalMax) totalMax = rmax; }
	 * 
	 * return totalMax; }
	 */

	// clean code to find max
	private int max(Node node) {
		if (node == null)
			return Integer.MIN_VALUE;

		int lmax = max(node.left);
		int rmax = max(node.right);

		return Math.max(node.data, Math.max(lmax, rmax));
	}

	// O(N)Time
	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node node, int item) {
		if (node == null)
			return false;

		if (node.data == item)
			return true;

		boolean lResult = find(node.left, item);
		if (lResult)
			return true;

		boolean rResult = find(node.right, item);
		if (rResult)
			return true;

		return false;
	}

	// O(N)Time
	public int height() {
		return height(root);
	}

	private int height(Node node) {
		if (node == null)
			return -1;

		int lheight = height(node.left);
		int rheight = height(node.right);

		return Math.max(lheight, rheight) + 1; // self-work
	}

	// approach 1 - using global variable
	private int diameterAns = Integer.MIN_VALUE;

	public int diameter() {
		diameter(root);
		return diameterAns;
	}

	private void diameter(Node node) {

		if (node == null) {
			return;
		}

		int presentNodeRoot = height(node.left) + height(node.right) + 2;

		if (presentNodeRoot > diameterAns) {
			diameterAns = presentNodeRoot;
		}

		diameter(node.left);
		diameter(node.right);
	}

	// approach 2
	// O(N^2)Time
	public int diameter2() {
		return diameter2(root);
	}

	private int diameter2(Node node) {

		if (node == null)
			return 0;

		// max distance between 2 leaf nodes might lie in left subtree,
		// factor1: left diameter
		int lDiameter = diameter2(node.left);

		// max distance between 2 leaf nodes might lie in right subtree,
		// factor2: right diameter
		int rDiameter = diameter2(node.right);

		// self node might be the root node of diameter, factor3: self diameter
		int rootDiameter = height(node.left) + height(node.right) + 2;

		return Math.max(rootDiameter, Math.max(lDiameter, rDiameter));
	}

	private class DiaPair {
		int pairDiameter = 0;
		int pairHeight = -1;
	}
	
	// O(N) Time
	public int diameter3() {
		DiaPair ansPair = diameter3(root);
		return ansPair.pairDiameter;
	}

	private DiaPair diameter3(Node node) {

		if (node == null) {
			return new DiaPair();
		}

		DiaPair leftDiaPair = diameter3(node.left);
		DiaPair rightDiaPair = diameter3(node.right);

		DiaPair selfDiaPair = new DiaPair();

		int lDiameter = leftDiaPair.pairDiameter;
		int rDiameter = rightDiaPair.pairDiameter;
		int selfDiameter = leftDiaPair.pairHeight + rightDiaPair.pairHeight + 2;

		selfDiaPair.pairDiameter = Math.max(selfDiameter, Math.max(lDiameter, rDiameter));
		selfDiaPair.pairHeight = Math.max(leftDiaPair.pairHeight, rightDiaPair.pairHeight) + 1;

		return selfDiaPair;
	}

	// O(N^2) Time
	public boolean isBalanced() {
		return isBalanced(root);
	}

	private boolean isBalanced(Node node) {

		if (node == null) {
			return true;
		}

		boolean leftBalanced = isBalanced(node.left);
		boolean rightBalanced = isBalanced(node.right);

		// for root node of current subtree
		int balancingFactor = height(node.left) - height(node.right);

		if (leftBalanced && rightBalanced && balancingFactor >= -1 && balancingFactor <= 1) {
			return true;
		} else {
			return false;
		}
	}

	// Efficient approach to check if binary tree is Balanced

	private class BalPair {
		boolean isBal = true;
		int ht = -1;
	}

	public boolean isBalanced3() {
		BalPair ans = isBalanced3(root);
		return ans.isBal;
	}

	private BalPair isBalanced3(Node node) {

		if (node == null) {
			return new BalPair();
		}

		BalPair leftBalPair = isBalanced3(node.left);
		BalPair rightBalPair = isBalanced3(node.right);

		BalPair selfBalPair = new BalPair();

		// logic from first approach
		boolean leftBalanced = leftBalPair.isBal;
		boolean rightBalanced = rightBalPair.isBal;
		int balancingFactor = leftBalPair.ht - rightBalPair.ht;

		if (leftBalanced && rightBalanced && balancingFactor >= -1 && balancingFactor <= 1) {
			selfBalPair.isBal = true;
		} else {
			selfBalPair.isBal = false;
		} 

		selfBalPair.ht = Math.max(leftBalPair.ht, rightBalPair.ht) + 1;

		return selfBalPair;
	}
}
