package Lecture21;

import Lecture21.binaryTree.Node;

public class sumOfLeafNodesTree {

	public static void main(String[] args) {

		binaryTree btree = new binaryTree();
		System.out.println("\n----------------------------------------\n");
		btree.display();
		int sum = sumOfLeafs(btree.root);
		System.out.println("\n------- sum of all leaf nodes is :" + sum);

	}

	public static int sumOfLeafs(Node node) {

		if (node == null) {
			return 0; // parent of leaf node having single child
		}
		if (node.left == null && node.right == null) {
			return node.data;
		}
		int leftSum = sumOfLeafs(node.left);
		int rightSum = sumOfLeafs(node.right);

		return leftSum + rightSum;
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

------- sum of all leaf nodes is :117

 */

/*
 * sample input paste below line after running code if you don't want to
 * manually type inputs 50 true 25 true 12 false false true 68 true 17 false
 * false false true 75 true 39 false false true 49 false false
 */

