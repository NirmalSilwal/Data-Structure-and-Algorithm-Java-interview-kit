package Lecture21;

import Lecture21.binaryTree.Node;

public class diameterOfTree {

	public static void main(String[] args) {

		binaryTree btree = new binaryTree();

		System.out.println("\n----------------------------------------\n");
		btree.display();

		int diameter = findDiameter(btree.root);
		System.out.println("\n-----------------------\ndiameter of tree is: " + diameter);
	}

	public static int findDiameter(Node node) {
		if (node == null) {
			return 0;
		}

		int lheight = findHeight(node.left);
		int rheight = findHeight(node.right);

		// 3 possible path diameter could be answer
		int rootWayDiameter = lheight + rheight + 2;
		int leftSideWayDiameter = findDiameter(node.left);
		int rightSideWayDiameter = findDiameter(node.right);

		int diameter = Math.max(rootWayDiameter,(Math.max(leftSideWayDiameter, rightSideWayDiameter)));

		return diameter;
	}

	public static int findHeight(Node node) {
		if (node == null) {
			return -1;
		}

		int lsubtreeheight = findHeight(node.left);
		int rsubtreeheight = findHeight(node.right);

		int height = Math.max(lsubtreeheight, rsubtreeheight) + 1;

		return height;
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
diameter of tree is: 5
*/