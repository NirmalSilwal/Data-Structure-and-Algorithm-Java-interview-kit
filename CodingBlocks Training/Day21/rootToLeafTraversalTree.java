package Lecture21;

import Lecture21.binaryTree.Node;

public class rootToLeafTraversalTree {

	public static void main(String[] args) {

		binaryTree btree = new binaryTree();
		System.out.println("\n----------------------------------------\n");
		btree.display();
		System.out.println("\n------- root to leaf traversal -----------\n");
		rootToLeaf(btree.root);
	}

	public static void rootToLeaf(Node node) {
		String initialOutput = "";
		rootToLeaf(node, initialOutput);
	}

	private static void rootToLeaf(Node node, String currentPath) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			currentPath = currentPath + node.data;
			System.out.println(currentPath);
			return;
		}

		rootToLeaf(node.left, currentPath + node.data + " => ");
		rootToLeaf(node.right, currentPath + node.data + " => ");

	}
}



/* output:
Enter data for root node: 50
Do you have left child for 50 -> true/false: true
Enter data for left child of 50: 25
Do you have left child for 25 -> true/false: true
Enter data for left child of 25: 12
Do you have left child for 12 -> true/false: false
Do you have right child for 12 -> true/false: false
Do you have right child for 25 -> true/false: true
Enter data for right child of: 25: 68
Do you have left child for 68 -> true/false: false
Do you have right child for 68 -> true/false: false
Do you have right child for 50 -> true/false: true
Enter data for right child of: 50: 75
Do you have left child for 75 -> true/false: true
Enter data for left child of 75: 39
Do you have left child for 39 -> true/false: false
Do you have right child for 39 -> true/false: false
Do you have right child for 75 -> true/false: true
Enter data for right child of: 75: 49
Do you have left child for 49 -> true/false: false
Do you have right child for 49 -> true/false: true
Enter data for right child of: 49: 63
Do you have left child for 63 -> true/false: false
Do you have right child for 63 -> true/false: false

----------------------------------------

25 => 50 <= 75
12 => 25 <= 68
END => 12 <= END
END => 68 <= END
39 => 75 <= 49
END => 39 <= END
END => 49 <= 63
END => 63 <= END

------- root to leaf traversal -----------

50 => 25 => 12
50 => 25 => 68
50 => 75 => 39
50 => 75 => 49 => 63
*/