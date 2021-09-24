package MustDoEasyList;

import java.util.Stack;

public class TrimABinarySearchTree669 {

	class TreeNode {
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

	// recurssive solution
	public TreeNode trimBST(TreeNode root, int low, int high) {

		if (root == null)
			return root;

		// trim right subtree if node value is higher than 'high'
		if (root.val > high)
			return trimBST(root.left, low, high);

		// trim left subtree if node value is less than 'low'
		if (root.val < low)
			return trimBST(root.right, low, high);

		root.left = trimBST(root.left, low, high);
		root.right = trimBST(root.right, low, high);

		return root;
	}

	// iterative solution
	public TreeNode trimBST_iterative(TreeNode root, int low, int high) {

		if (root == null)
			return root;

		Stack<TreeNode> stack = new Stack<>();
		TreeNode trimmedRoot = getTrimmedBSTRoot(root, low, high);

		stack.push(trimmedRoot);
		boolean flag = false;

		// DFS traversal
		while (!stack.isEmpty()) {
			TreeNode current = stack.pop();

			if (current != null) {

				if (current.left != null && current.left.val < low) {
					current.left = current.left.right;
					flag = true;
				}

				if (current.right != null && current.right.val > high) {
					current.right = current.right.left;
					flag = true;
				}

				if (flag)
					stack.push(current);
				else {
					if (current.left != null)
						stack.push(current.left);
					if (current.right != null)
						stack.push(current.right);
				}
			}
			flag = false;
		}

		return trimmedRoot;
	}

	private TreeNode getTrimmedBSTRoot(TreeNode root, int low, int high) {

		while (root != null && (root.val < low || root.val > high)) {

			if (root.val < low)
				root = root.right;

			if (root.val > high)
				root = root.left;
		}

		return root;
	}

}
