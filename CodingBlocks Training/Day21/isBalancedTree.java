package Lecture21;

import Lecture21.binaryTree.Node;

public class isBalancedTree {

	public static boolean isbalanced(binaryTree tree) {
		return isbalanced(tree.root).isbalanced;
	}

	private static PairBalanced isbalanced(Node node) {
		if (node == null) {
			PairBalanced basepair = new PairBalanced(0, true);
			return basepair;
		}

		PairBalanced leftSubtreeCheck = isbalanced(node.left);
		PairBalanced rightSubtreeCheck = isbalanced(node.right);

		PairBalanced nodepair = new PairBalanced();

		nodepair.height = Math.max(leftSubtreeCheck.height,
				rightSubtreeCheck.height) + 1;

		if (Math.abs(leftSubtreeCheck.height - rightSubtreeCheck.height) <= 1
				&& leftSubtreeCheck.isbalanced && rightSubtreeCheck.isbalanced) {
			nodepair.isbalanced = true;
		} else {
			nodepair.isbalanced = false;
		}

		return nodepair;
	}

	// Driver method
	public static void main(String[] args) {
		binaryTree tree = new binaryTree();
		System.out.println("\n----------------------------------------\n");
		tree.display();

		boolean balanced = isbalanced(tree);
		System.out.println("\n-----------------------\ntree is balanced: " + balanced);
	}

}



/* output:
Enter data for root node: 50 true 25 true 12 false false true 68 true 17 false false false true 75 true 39 false false true 49 false false
Do you have left child for 50 -> true/false: Enter data for left child of 50: Do you have left child for 25 -> true/false: Enter data for left child of 25: Do you have left child for 12 -> true/false: Do you have right child for 12 -> true/false: Do you have right child for 25 -> true/false: Enter data for right child of: 25: Do you have left child for 68 -> true/false: Enter data for left child of 68: Do you have left child for 17 -> true/false: Do you have right child for 17 -> true/false: Do you have right child for 68 -> true/false: Do you have right child for 50 -> true/false: Enter data for right child of: 50: Do you have left child for 75 -> true/false: Enter data for left child of 75: Do you have left child for 39 -> true/false: Do you have right child for 39 -> true/false: Do you have right child for 75 -> true/false: Enter data for right child of: 75: Do you have left child for 49 -> true/false: Do you have right child for 49 -> true/false: 
----------------------------------------

25 => 50 <= 75
12 => 25 <= 68
END => 12 <= END
17 => 68 <= END
END => 17 <= END
39 => 75 <= 49
END => 39 <= END
END => 49 <= END

-----------------------
tree is balanced: true
*/