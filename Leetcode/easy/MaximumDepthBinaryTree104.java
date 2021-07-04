package easy;

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
}
