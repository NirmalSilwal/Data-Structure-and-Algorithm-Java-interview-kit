/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean flipEquiv(TreeNode node1, TreeNode node2) {
        
        // base case
        // if both nodes are null, they are flip equivalent
		if (node1 == null && node2 == null) {
			return true;
		}
		// if either of node is null, they are not flip equivalent
		if (node1 == null || node2 == null) {
			return false;
		}

		if (node1.val != node2.val) {
			return false;
		}
		// case 1 - node is not flipped

		// left subtree of node1 & left subtree of node2
		boolean leftleft = flipEquiv(node1.left, node2.left);
		// right subtree of node1 & right subtree of node2
		boolean rightright = flipEquiv(node1.right, node2.right);

		if (leftleft && rightright)
			return true;
		
		// case 2 - node is flipped

		// left subtree of node1 & right subtree of node2
		boolean leftright = flipEquiv(node1.left, node2.right);
		// right subtree of node1 & left subtree of node2
		boolean rightleft = flipEquiv(node1.right, node2.left);

		return (leftleft && rightright) || (leftright && rightleft);
	
    }
}