package Lecture20;

import java.util.Scanner;

public class sizeOfBinaryTree {

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

	public sizeOfBinaryTree() {
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

	public int size() {
		return this.size(this.root);
	}
	
	private int size(Node node) {
		if (node == null){
			return 0;
		}
		int lsize = size(node.left);
		int rsize = size(node.right);
		
		int ans = lsize + rsize + 1;
		
		return ans;
	}
	
	public static void main(String[] args) {

		sizeOfBinaryTree tree = new sizeOfBinaryTree();

		int treeSize = tree.size();
		System.out.println("=============\n");
		System.out.println("size of tree is: " + treeSize);
	}
}




/* output: 
Enter data for root node: 20
Do you have left child for 20 -> true/false: true
Enter data for left child of 20: 10
Do you have left child for 10 -> true/false: true
Enter data for left child of 10: 28
Do you have left child for 28 -> true/false: false
Do you have right child for 28 -> true/false: false
Do you have right child for 10 -> true/false: true
Enter data for right child of: 10: 16
Do you have left child for 16 -> true/false: false
Do you have right child for 16 -> true/false: false
Do you have right child for 20 -> true/false: true
Enter data for right child of: 20: 30
Do you have left child for 30 -> true/false: 
true
Enter data for left child of 30: 42
Do you have left child for 42 -> true/false: false
Do you have right child for 42 -> true/false: false
Do you have right child for 30 -> true/false: false
=============

size of tree is: 6
*/