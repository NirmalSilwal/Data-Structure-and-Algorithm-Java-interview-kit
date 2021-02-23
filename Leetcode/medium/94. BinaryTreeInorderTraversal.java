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
 // iterative approach
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        // edge case
        if (root == null) {
            ArrayList<Integer> baseResult = new ArrayList<Integer>();
            return baseResult;
        }
        
        ArrayList<Integer> traversal = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        while (true) {
            
            if (root != null) {
                stack.add(root);
                root = root.left; 
                
            } else {  
                if (stack.isEmpty())
                    break;
                else {
                    root = stack.pop();
                    traversal.add(root.val);
                    root = root.right;
                }    
            }
        }
        return traversal;
    }
}