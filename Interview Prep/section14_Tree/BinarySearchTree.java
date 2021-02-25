package section14_Tree;

public class BinarySearchTree {

	private class Node {
		private int data;
		private Node left;
		private Node right;
	}

	private Node root;

	// provided array passed is sorted
	BinarySearchTree(int[] arr) {
		this.root = constructBST(arr, 0, arr.length - 1);
	}

	private Node constructBST(int[] arr, int low, int high) {

		if (low > high) {
			return null;
		}

		// by making mid item as root node, it will create balanced BST
		// and its complexity will be O(logN)
		int mid = low + (high - low) / 2;

		Node newNode = new Node();
		newNode.data = arr[mid];

		newNode.left = constructBST(arr, low, mid - 1);
		newNode.right = constructBST(arr, mid + 1, high);

		return newNode;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left != null)
			System.out.print(node.left.data + " -> ");
		else
			System.out.print("NULL -> ");

		System.out.print(node.data);

		if (node.right != null)
			System.out.print(" <- " + node.right.data);
		else
			System.out.print(" <- NULL");

		System.out.println();

		if (node.left != null)
			this.display(node.left);
		if (node.right != null)
			this.display(node.right);

	}

	public boolean find(int item) {
		return this.find(item, this.root);
	}

	private boolean find(int item, Node node) {
		if (node == null)
			return false;

		if (item == node.data)
			return true;

		if (item < node.data)
			return find(item, node.left);
		else
			return find(item, node.right);
	}

	// find max item in BST
	public int max() {
		return this.max2(this.root);
	}

	private int max(Node node) {
		if (node == null)
			return -1;

		if ((node.left == null && node.right == null) || (node.left != null && node.right == null))
			return node.data;

		return max(node.right);
	}

	// clean approach
	private int max2(Node node) {
		if (node.right == null)
			return node.data;

		return max2(node.right);
	}

	// find min item in BST
	public int min() {
		return this.min(this.root);
	}

	private int min(Node node) {
		if (node.left == null)
			return node.data;

		return min(node.left);
	}
}
