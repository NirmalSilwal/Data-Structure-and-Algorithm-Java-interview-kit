package section24_BinaryTree;

public class BinaryTreeClient {

	public static void main(String[] args) {

		BinaryTree btree = new BinaryTree();

		/* test input: 10 Y 20 Y 40 N N Y 50 N N Y 30 N Y 60 N N */

		btree.display();

		System.out.println("size: " + btree.size());

		/* test input: 10 Y 20 Y 40 N N Y 580 N N Y 30 N Y 60 N N */
		System.out.println("max: " + btree.max());

		System.out.println("found 10: " + btree.find(10));
		System.out.println("found 50: " + btree.find(50));
		System.out.println("found 60: " + btree.find(30));
		System.out.println("found 40: " + btree.find(40));
		System.out.println("found 500: " + btree.find(500));
		System.out.println("found -1: " + btree.find(-1));

		/* test input: 10 Y 20 Y 40 N N Y 50 N N Y 30 N Y 60 N Y 111 N N */
		System.out.println("height: " + btree.height());

		/* test input: 10 Y 20 Y 40 N N Y 50 N Y 70 N N Y 30 N Y 60 N N */
		/*
		 * test input: 10 Y 20 Y 40 Y 60 Y 80 N N N N Y 50 N Y 70 N Y 90 N N Y
		 * 30 N N
		 */

		System.out.println("diameter: " + btree.diameter());
		System.out.println("diameter: " + btree.diameter2());
		System.out.println("diameter: " + btree.diameter3());

		/* test input: 10 Y 20 Y 40 N N Y 50 N N Y 30 N Y 60 N N */
		System.out.println("is Balanced: " + btree.isBalanced());
		System.out.println("is Balanced: " + btree.isBalanced3());

		/* test input: 10 Y 20 Y 40 N N Y 50 N N Y 30 N Y 70 N N */
		System.out.println("\npre-order traversal");
		btree.preorder();
		System.out.println("\nin-order traverasl");
		btree.inorder();
		System.out.println("\npost-order traversal");
		btree.postorder();

		System.out.println("\npreorder iterative");
		btree.preorderIterative();

		/* test input: 100 Y 20 Y -40 N N Y 50 N N Y -30 N Y 70 N N */
		System.out.println("\n\nSum: " + btree.sum());

		/*
		 * test input: 10 Y 20 Y 40 Y 2 N N Y 3 N N Y -60 N N Y -30 Y 50 Y 60 Y
		 * 80 N N N Y 70 N N Y -100 N N
		 */

		System.out.println("\nmax subtree sum: " + btree.maxSubtreeSum1());
		System.out.println("\nmax subtree sum: " + btree.maxSubtreeSum2());
		System.out.println("\nmax subtree sum: " + btree.maxSubtreeSum3());

		System.out.println("\nTree construction using preorder & inorder traversal");

		int[] preorderTraversal = { 10, 20, 40, 30, 50, 60, 70 };
		int[] inorderTraversal = { 40, 20, 10, 50, 30, 60, 70 };

		BinaryTree btree2 = new BinaryTree(inorderTraversal, preorderTraversal);

		btree2.display();

		int[] in = { 40, 20, 50, 10, 30, 70 };
		int[] pre = { 10, 20, 40, 50, 30, 70 };
		BinaryTree btree3 = new BinaryTree(in, pre);
		btree3.display();
	}
}
