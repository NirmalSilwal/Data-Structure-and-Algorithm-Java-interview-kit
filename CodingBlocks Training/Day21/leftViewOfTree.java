package Lecture21;

import Lecture21.binaryTree.Node;

// time complexity: O(N)

public class leftViewOfTree {

	static int MAX_LEVEL = Integer.MIN_VALUE;

	public static void leftView(binaryTree tree) {
		int initial_level = 0;
		leftView(tree.root, initial_level);
	}

	// displays node that are visible when seen from left side of tree
	private static void leftView(Node node, int level) {
		if (node == null) {
			return;
		}

		if (level > MAX_LEVEL) {
			System.out.print(node.data + " ");
			MAX_LEVEL = level;
		}

		leftView(node.left, level + 1);
		leftView(node.right, level + 1);
	}
	
	
	// Driver method
	public static void main(String... seeTreeFromLeftSide) {

		binaryTree tree = new binaryTree();
		System.out.println("\n----------------------------------------\n");
		tree.display();

		System.out.println("\n---------- left view of tree ------------\n");

		leftView(tree);
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

---------- left view of tree ------------

50 25 12 17 
*/