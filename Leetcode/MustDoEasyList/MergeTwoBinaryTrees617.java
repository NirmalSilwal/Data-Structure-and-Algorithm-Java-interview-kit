package MustDoEasyList;

import java.util.LinkedList;
import java.util.Queue;

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

	// recursive approach
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

	// iterative approach, using BFS
	public TreeNode mergeTreesItr(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return root1;
		if (root1 == null && root2 != null)
			return root2;
		if (root2 == null && root1 != null)
			return root1;

		// Queue implementation using LinkedList
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root1);
		queue.add(root2);

		while (!queue.isEmpty()) {
			TreeNode a = queue.poll(); // root1 as merged tree
			TreeNode b = queue.poll();

			a.val = a.val + b.val;

			if (a.left != null && b.left != null) {
				queue.add(a.left);
				queue.add(b.left);
			}

			if (a.right != null && b.right != null) {
				queue.add(a.right);
				queue.add(b.right);
			}

			if (a.left == null && b.left != null) {
				a.left = b.left;
				queue.add(b.left);
				queue.add(new TreeNode(0));
			}

			if (a.right == null && b.right != null) {
				a.right = b.right;
				queue.add(b.right);
				queue.add(new TreeNode(0));
			}
			// not checking with b.left and b.right as our final tree is 'a'
		}

		return root1;
	}
}
