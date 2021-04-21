package section21_SegmentTrees;

public class SegmentTree {

	private class Node {
		int data;
		int startInterval;
		int endInterval;
		Node left;
		Node right;
	}

	Node root;

	public SegmentTree(int[] arr) {
		this.root = constructTree(arr, 0, arr.length - 1);
	}

	private Node constructTree(int[] arr, int si, int ei) {
		if (si == ei) {
			Node baseResult = new Node(); // leaf Node
			baseResult.data = arr[si];
			baseResult.startInterval = si;
			baseResult.endInterval = ei;

			return baseResult;
		}
		Node node = new Node();
		node.startInterval = si;
		node.endInterval = ei;

		int mid = (si + ei) / 2;
		node.left = constructTree(arr, si, mid);
		node.right = constructTree(arr, mid + 1, ei);

		node.data = node.left.data + node.right.data;

		return node;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left == null && node.right == null) {
			System.out.println("No left child => " + node.data + " <= No right child");
			return;
		}
		String str = "";
		if (node.left != null) {
			str += "[" + node.left.startInterval + "-" + node.left.endInterval + "] " + node.left.data + " => ";
		} else {
			str = str + "No left Child";
		}
		str += " [" + node.startInterval + "-" + node.endInterval + "] " + node.data;

		if (node.right != null) {
			str += " <= [" + node.right.startInterval + "-" + node.right.endInterval + "] " + node.right.data;
		} else {
			str = str + " No right Child";
		}
		System.out.println(str);

		display(node.left);
		display(node.right);
	}

	public int query(int qsi, int qei) {
		return this.query(this.root, qsi, qei);
	}

	// sum query, sum of certain ranges in Array

	// O(logN), N is height of Segment Tree
	private int query(Node node, int qsi, int qei) {
		// node is completely lying inside the query, it will contribute to ans
		if (node.startInterval >= qsi && node.endInterval <= qei) {
			return node.data;
		} else if (node.startInterval > qei || node.endInterval < qsi) {
			// when node is completely outside query interval, return default
			// value of query
			return 0;
		} else {
			// overlapping case
			int leftResult = query(node.left, qsi, qei);
			int rightResult = query(node.right, qsi, qei);
			return leftResult + rightResult;
		}
	}
}
