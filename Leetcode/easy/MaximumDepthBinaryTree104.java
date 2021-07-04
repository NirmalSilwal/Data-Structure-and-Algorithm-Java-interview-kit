package easy;

import java.util.Stack;

public class MaximumDepthBinaryTree104 {

	public class TreeNode {
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

	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;

		int depth1 = 1 + maxDepth(root.left);
		int depth2 = 1 + maxDepth(root.right);

		return Math.max(depth1, depth2);
	}

	public int maxDepth2(TreeNode root) {

		if (root == null)
			return 0;

		int max = 1;

		Stack<TreeNode> nodeStack = new Stack<>();
		Stack<Integer> depthStack = new Stack<>();

		nodeStack.push(root);
		depthStack.push(1);

		while (!nodeStack.isEmpty()) {

			TreeNode current = nodeStack.pop();
			int depth = depthStack.pop();

			if (current.left == null && current.right == null) {
				max = Math.max(max, depth);
			}

			if (current.left != null) {
				nodeStack.push(current.left);
				depthStack.push(depth + 1);
			}

			if (current.right != null) {
				nodeStack.push(current.right);
				depthStack.push(depth + 1);
			}

		}
		return max;
	}
}
