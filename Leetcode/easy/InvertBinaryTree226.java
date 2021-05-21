package easy;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree226 {

	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public TreeNode invertTree(TreeNode root) {

		if (root == null)
			return null;

		// inverting the subtree first
		TreeNode leftSubtree = invertTree(root.left);
		TreeNode rightSubtree = invertTree(root.right);

		// now swaping the root left and right subtree
		root.left = rightSubtree;
		root.right = leftSubtree;

		return root;
	}

	public TreeNode invertTree2(TreeNode root) {
		if (root == null)
			return null;

		// swap left & right subtree
		TreeNode tempnode = root.left;
		root.left = root.right;
		root.right = tempnode;

		// recursively solve for children
		invertTree(root.left);
		invertTree(root.right);

		return root;
	}

	public TreeNode invertTreeIterative(TreeNode root) {
		if (root == null)
			return null;

		// bfs approach
		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		queue.add(root);

		while (!queue.isEmpty()) {
			// remove from queue and swap children
			TreeNode currentNode = queue.poll();
			// swap
			TreeNode temp = currentNode.left;
			currentNode.left = currentNode.right;
			currentNode.right = temp;

			if (currentNode.left != null)
				queue.add(currentNode.left);
			if (currentNode.right != null)
				queue.add(currentNode.right);
		}

		return root;
	}
}
