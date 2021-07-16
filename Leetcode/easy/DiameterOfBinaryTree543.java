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

	// approach 1
	public int diameterOfBinaryTree1(TreeNode root) {
		if (root == null)
			return 0;

		if (root.left == null && root.right == null)
			return 0;

		int diameter = height(root.left) + height(root.right);
		if (diameter > ans)
			ans = diameter;

		diameterOfBinaryTree1(root.left);
		diameterOfBinaryTree1(root.right);

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

	// approach 2
	private int height1(TreeNode node) {
		if (node == null)
			return -1;

		int lheight = height1(node.left);
		int rheight = height1(node.right);

		return Math.max(lheight, rheight) + 1;
	}

	public int diameterOfBinaryTree2(TreeNode root) {
		if (root == null)
			return 0;
		// max distance between two nodes of LHS
		int leftDia = diameterOfBinaryTree2(root.left);
		// max distance between two nodes of RHS
		int rightDia = diameterOfBinaryTree2(root.right);

		// diameter that passes through the root node
		int rootWayDia = height1(root.left) + height1(root.right) + 2;

		int dia = Math.max(rootWayDia, Math.max(leftDia, rightDia));

		return dia;
	}

	// 3rd approach
	static class DiaPair {
		int pairHeight;
		int pairDiameter;
	}

	public int diameterOfBinaryTree(TreeNode root) {
		DiaPair result = diameter(root);
		return result.pairDiameter;
	}

	public DiaPair diameter(TreeNode node) {
		if (node == null) {
			DiaPair basePair = new DiaPair();
			basePair.pairHeight = -1;
			basePair.pairDiameter = 0;
			return basePair;
		}

		DiaPair leftPair = diameter(node.left);
		DiaPair rightPair = diameter(node.right);

		DiaPair mypair = new DiaPair();

		mypair.pairHeight = Math.max(leftPair.pairHeight, rightPair.pairHeight) + 1;

		// find diameter of mypair
		int rootWayDia = leftPair.pairHeight + rightPair.pairHeight + 2;
		mypair.pairDiameter = Math.max(rootWayDia, Math.max(leftPair.pairDiameter, rightPair.pairDiameter));

		return mypair;
	}
}
