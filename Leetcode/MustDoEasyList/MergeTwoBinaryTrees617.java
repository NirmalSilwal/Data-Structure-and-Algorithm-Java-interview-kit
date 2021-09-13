package MustDoEasyList;

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

public class MergeTwoBinaryTrees617 {

	public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return null;
		if (root1 == null && root2 != null)
			return root2;
		if (root2 == null && root1 != null)
			return root1;

		TreeNode merged = new TreeNode();

		merged.val = root1.val + root2.val;

		merged.left = mergeTrees(root1.left, root2.left);

		merged.right = mergeTrees(root1.right, root2.right);

		return merged;
	}
}
