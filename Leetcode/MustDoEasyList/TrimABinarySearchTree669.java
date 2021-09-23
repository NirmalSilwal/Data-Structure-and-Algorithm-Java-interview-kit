package MustDoEasyList;

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

	// correct one
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

	// 1st approach - has bug on it
	/*
	 * public TreeNode trimBST(TreeNode root, int low, int high) {
	 * 
	 * // single node case if (root.left == null && root.right == null) { if
	 * (root.val >= low && root.val <= high) return root; else return new
	 * TreeNode(); }
	 * 
	 * // if current node has no left-subtree present if (root.left == null &&
	 * root.right != null) { // ignore left- subtree and process right half only
	 * if (root.val >= low && root.val <= high) { TreeNode newNode = new
	 * TreeNode(root.val); newNode.right = trimBST(root.right, low, high);
	 * return newNode; } else { if (root.right.val >= low && root.right.val <=
	 * high) { TreeNode newNode = new TreeNode(root.right.val); newNode.left =
	 * trimBST(root.right.left, low, high); newNode.right =
	 * trimBST(root.right.right, low, high); return newNode; } else return null;
	 * } }
	 * 
	 * // if current node has no right-subtree present if (root.right == null &&
	 * root.left != null) { // ignore right- subtree and process left half only
	 * if (root.val >= low && root.val <= high) { TreeNode newNode = new
	 * TreeNode(root.val); newNode.left = trimBST(root.left, low, high); return
	 * newNode; } else { if (root.left.val >= low && root.left.val <= high) {
	 * TreeNode newNode = new TreeNode(root.left.val); newNode.left =
	 * trimBST(root.left.left, low, high); newNode.right =
	 * trimBST(root.left.right, low, high); return newNode; } else return null;
	 * } }
	 * 
	 * // if node has both left and right subtree
	 * 
	 * if (low >= root.val) { // ignore left subtree if (root.val >= low &&
	 * root.val <= high) { TreeNode newNode = new TreeNode(root.val);
	 * newNode.right = trimBST(root.right, low, high); return newNode; } else
	 * return null;
	 * 
	 * } else if (high <= root.val) { // ignore right subtree if (root.val >=
	 * low && root.val <= high) { TreeNode newNode = new TreeNode(root.val);
	 * newNode.left = trimBST(root.left, low, high); return newNode; } else
	 * return null;
	 * 
	 * } else { // this will have node from both left and right subtree if
	 * (root.val >= low && root.val <= high) { TreeNode newNode = new
	 * TreeNode(root.val); newNode.left = trimBST(root.left, low, high);
	 * newNode.right = trimBST(root.right, low, high); return newNode; } else
	 * return null; } }
	 */
}
