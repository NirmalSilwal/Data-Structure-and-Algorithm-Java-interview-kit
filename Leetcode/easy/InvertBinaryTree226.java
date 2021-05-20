package easy;

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
}
