package Lecture20;

import java.util.Scanner;

public class mirrorBinaryTree {

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

	public mirrorBinaryTree() {
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

	public void mirror() {
		this.mirror(this.root);
	}

	private void mirror(Node node) {
		if (node == null) {
			return;
		}
		Node temp = node.left;
		node.left = node.right;
		node.right = temp;

		this.mirror(node.left);
		this.mirror(node.right);
	}

	public static void main(String[] args) {

		mirrorBinaryTree btree = new mirrorBinaryTree();
		
		System.out.println("\n--------------- before mirroring ---------------------\n");
		btree.display();

		btree.mirror();
		
		System.out.println("\n--------------- after mirroring ---------------------\n");
		btree.display();
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
Do you have left child for 68 -> true/false: true
Enter data for left child of 68: 17
Do you have left child for 17 -> true/false: false
Do you have right child for 17 -> true/false: false
Do you have right child for 68 -> true/false: false
Do you have right child for 50 -> true/false: true
Enter data for right child of: 50: 75
Do you have left child for 75 -> true/false: true
Enter data for left child of 75: 48
Do you have left child for 48 -> true/false: false
Do you have right child for 48 -> true/false: false
Do you have right child for 75 -> true/false: true
Enter data for right child of: 75: 39
Do you have left child for 39 -> true/false: false
Do you have right child for 39 -> true/false: false

--------------- before mirroring ---------------------

25 => 50 <= 75
12 => 25 <= 68
END => 12 <= END
17 => 68 <= END
END => 17 <= END
48 => 75 <= 39
END => 48 <= END
END => 39 <= END

--------------- after mirroring ---------------------

75 => 50 <= 25
39 => 75 <= 48
END => 39 <= END
END => 48 <= END
68 => 25 <= 12
END => 68 <= 17
END => 17 <= END
END => 12 <= END
*/