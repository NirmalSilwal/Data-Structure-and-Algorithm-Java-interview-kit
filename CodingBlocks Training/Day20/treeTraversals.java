package Lecture20;

import java.util.Scanner;

public class treeTraversals {

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

	public treeTraversals() {
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

	
	// tree traversals
	
	public void preOrder() {
		this.preOrder(this.root);
	}

	private void preOrder(Node node) { // NLR (node, left, right)
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		this.preOrder(node.left);
		this.preOrder(node.right);
	}

	public void inOrder() {
		this.inOrder(this.root);
	}

	private void inOrder(Node node) { // LNR
		if (node == null) {
			return;
		}
		this.inOrder(node.left);
		System.out.print(node.data + " ");
		this.inOrder(node.right);
	}

	public void postOrder() {
		this.postOrder(this.root);
	}

	private void postOrder(Node node) { // LRN
		if (node == null) {
			return;
		}
		this.postOrder(node.left);
		this.postOrder(node.right);
		System.out.print(node.data + " ");
	}

	public static void main(String[] args) {

		treeTraversals btree = new treeTraversals();

		System.out.println("\n-------------------------------\n");
		btree.display();
		System.out.println("\n-------------------------------------------");

		System.out.println("\n--------- pre-order traversal -------------\n");
		btree.preOrder();
		System.out.println();
		
		System.out.println("\n--------- in-order traversal -------------\n");
		btree.inOrder();
		System.out.println();
		
		System.out.println("\n--------- post-order traversal -------------\n");
		btree.postOrder();
		System.out.println();
		
	}
}



/* output:
Enter data for root node: 50
Do you have left child for 50 -> true/false: true
Enter data for left child of 50: 25
Do you have left child for 25 -> true/false: true
Enter data for left child of 25: 12
Do you have left child for 12 -> true/false: false
Do you have right child for 12 -> true/false: false
Do you have right child for 25 -> true/false: true
Enter data for right child of: 25: 68
Do you have left child for 68 -> true/false: false
Do you have right child for 68 -> true/false: false
Do you have right child for 50 -> true/false: true
Enter data for right child of: 50: 75
Do you have left child for 75 -> true/false: true
Enter data for left child of 75: 39
Do you have left child for 39 -> true/false: false
Do you have right child for 39 -> true/false: false
Do you have right child for 75 -> true/false: true
Enter data for right child of: 75: 49
Do you have left child for 49 -> true/false: false
Do you have right child for 49 -> true/false: false

-------------------------------

25 => 50 <= 75
12 => 25 <= 68
END => 12 <= END
END => 68 <= END
39 => 75 <= 49
END => 39 <= END
END => 49 <= END

-------------------------------------------

--------- pre-order traversal -------------

50 25 12 68 75 39 49 

--------- in-order traversal -------------

12 25 68 50 39 75 49 

--------- post-order traversal -------------

12 68 25 39 49 75 50 
*/