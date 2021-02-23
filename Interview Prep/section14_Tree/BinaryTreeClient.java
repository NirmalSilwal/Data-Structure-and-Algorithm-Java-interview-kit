package section14_Tree;
/*
 * Input sample: binary tree
 * 
 * 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
 * 
 * input sample: binary search tree
 * 
 * 50 true 25 true 12 false false true 37 false false true 75 true 62 false false true 87 false false
 * 
 */

public class BinaryTreeClient {

	public static void main(String[] args) {

		BinaryTree btree = new BinaryTree();
		System.out.println();
		btree.display();

		System.out.println("\nHeight of tree: " + btree.height());

		System.out.println("\nPre-order traversal");
		btree.preOrderTraversal();

		System.out.println("\n\nIn-order traversal");
		btree.inOrderTraversal();

		System.out.println("\n\nPost-order traversal");
		btree.postOrderTraversal();

		System.out.println("\n\nLevel-order traversal");
		btree.levelOrderTraversal();

		System.out.println("\n\nisBST: " + btree.isBinaryTreeTheBST());

		System.out.println("isBST: " + btree.isBST());

		System.out.println("\nIn-order iterative: ");
		btree.inOrderIterative();

		System.out.println("\nsum of leafs: " + btree.sumOfLeafs());

	}

}

/* output:

Enter data for root node: 
50 true 25 true 12 false false true 37 false false true 75 true 62 false false true 87 false false
Is there left child of 50? Press true/false
Enter data for left node of 50
Is there left child of 25? Press true/false
Enter data for left node of 25
Is there left child of 12? Press true/false
Is there right child of 12? Press true/false
Is there right child of 25? Press true/false
Enter data for right node of 25
Is there left child of 37? Press true/false
Is there right child of 37? Press true/false
Is there right child of 50? Press true/false
Enter data for right node of 50
Is there left child of 75? Press true/false
Enter data for left node of 75
Is there left child of 62? Press true/false
Is there right child of 62? Press true/false
Is there right child of 75? Press true/false
Enter data for right node of 75
Is there left child of 87? Press true/false
Is there right child of 87? Press true/false

25 => 50 <= 75
12 => 25 <= 37
NULL => 12 <= NULL
NULL => 37 <= NULL
62 => 75 <= 87
NULL => 62 <= NULL
NULL => 87 <= NULL

Height of tree: 2

Pre-order traversal
50 25 12 37 75 62 87 

In-order traversal
12 25 37 50 62 75 87 

Post-order traversal
12 37 25 62 87 75 50 

Level-order traversal
50 25 75 12 37 62 87 

isBST: true
isBST: true

In-order iterative: 
[12, 25, 37, 50, 62, 75, 87]

sum of leafs: 198
*/