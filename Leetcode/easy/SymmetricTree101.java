package easy;

public class SymmetricTree101 {

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

	public boolean isSymmetric(TreeNode root) {

		if (root.left == null && root.right == null)
			return true;

		if (root.left == null || root.right == null)
			return false;

		return isSymmetric(root.left, root.right);
	}

	private boolean isSymmetric(TreeNode node1, TreeNode node2) {

		if (node1 == null && node2 == null)
			return true;

		if (node1 == null || node2 == null)
			return false;

		if (node1.val != node2.val)
			return false;

		boolean leftright = isSymmetric(node1.left, node2.right);
		boolean rightleft = isSymmetric(node1.right, node2.left);

		return leftright && rightleft;
	}
}
