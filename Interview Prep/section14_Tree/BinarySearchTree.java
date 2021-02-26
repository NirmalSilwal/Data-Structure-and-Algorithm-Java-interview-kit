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
		return this.max(this.root);
	}

	// clean approach
	private int max(Node node) {
		if (node.right == null)
			return node.data;

		return max(node.right);
	}

	private int max2(Node node) {
		if (node == null)
			return -1;

		if ((node.left == null && node.right == null) || (node.left != null && node.right == null))
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

	public void addItem(int item) {
		this.addItem(item, this.root);
	}

	private void addItem(int item, Node node) {

		if (item < node.data || item == node.data) {

			if (node.left == null) {

				Node newNode = new Node();
				newNode.data = item;

				node.left = newNode;
			} else
				addItem(item, node.left);

		} else {

			if (node.right == null) {

				Node newNode = new Node();
				newNode.data = item;

				node.right = newNode;
			} else
				addItem(item, node.right);
		}
	}

	public void removeItem(int item) {
		this.removeItem(this.root, null, false, item);
	}

	private void removeItem(Node node, Node parent, boolean isLeftChild, int item) {
		// if element is not present in BST
		if (node == null)
			return;
		
		// case 1
		if (item > node.data) {
			removeItem(node.right, node, false, item);

			// case 2
		} else if (item < node.data) {
			removeItem(node.left, node, true, item);

		} else {
			// case 3.1, to remove leaf node
			if (node.left == null && node.right == null) {
				if (isLeftChild)
					parent.left = null;
				else
					parent.right = null;

				// case 3.2, if node to be removed has it's left child null
			} else if (node.left == null && node.right != null) {
				if (isLeftChild)
					parent.left = node.right;
				else
					parent.right = node.right;

				// case 3.3, if node to be removed has it's right child null
			} else if (node.left != null && node.right == null) {
				if (isLeftChild)
					parent.left = node.left;
				else
					parent.right = node.left;

				// case 3.4, if node to be removed has both left and right child
			} else {
				// replace max item from it's left subtree to the node
				// to be removed and remove that max value in it's original
				// location in the tree
				// another way is to replace with min value from right subtree
				int maxVal = this.max(node.left);
				node.data = maxVal;

				removeItem(node.left, node, true, maxVal);
			}
		}
	}
}
