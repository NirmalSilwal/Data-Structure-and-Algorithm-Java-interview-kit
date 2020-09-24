package Lecture21;

import Lecture21.binaryTree.Node;

// time complexity: O(N)

public class diameterOfTree2 {

	public static void main(String[] args) {

		binaryTree tree = new binaryTree();
		System.out.println("\n----------------------------------------\n");
		tree.display();

		int diameter = pairDiameter(tree);
		System.out.println("\n-----------------------\ndiameter of tree is: " + diameter);
	}

	public static int pairDiameter(binaryTree tree) {
		Pair pairAnswer = treeDiameter(tree.root);
		return pairAnswer.diameter;
	}

	private static Pair treeDiameter(Node node) {
		if (node == null) {
			Pair basePair = new Pair(0, -1);
			// for leaf node, diameter = 0, height = -1 as per our height
			// function, since we'r adding 1 to max of height from left/right subtree
			
			return basePair;
		}
		
		Pair leftPair = treeDiameter(node.left);
		Pair rightPair = treeDiameter(node.right);

		// creating Pair object for each node
		Pair mypair = new Pair();

		mypair.height = Math.max(leftPair.height, rightPair.height) + 1;

		mypair.diameter = Math.max(leftPair.height + rightPair.height + 2,
				Math.max(leftPair.diameter, rightPair.diameter));

		return mypair;
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

// test input sample
// 50 true 25 true 12 false false true 68 true 17 false false false true 75 true 39 false false true 49 false false