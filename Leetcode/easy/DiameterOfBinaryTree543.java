package easy;

public class DiameterOfBinaryTree543 {
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

	int ans = 0;

	public int diameterOfBinaryTree(TreeNode root) {
		if (root == null)
			return 0;

		if (root.left == null && root.right == null)
			return 0;

		int diameter = height(root.left) + height(root.right);
		if (diameter > ans)
			ans = diameter;

		diameterOfBinaryTree(root.left);
		diameterOfBinaryTree(root.right);

		return ans;
	}

	private int height(TreeNode node) {
		if (node == null)
			return 0;

		if (node.left == null && node.right == null)
			return 1;

		int lheight = 1 + height(node.left);
		int rheight = 1 + height(node.right);

		return Math.max(lheight, rheight);
	}
}
