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
	}
}


/* output:
Enter the data for root node: 
10 Y 20 Y 40 N N Y 50 N N Y 30 N Y 70 N N
Do you have left child of 10 ?, press Y/N
Enter the data for left child of 10
Do you have left child of 20 ?, press Y/N
Enter the data for left child of 20
Do you have left child of 40 ?, press Y/N
Do you have right child of 40 ?, press Y/N
Do you have right child of 20 ?, press Y/N
Enter the data for right child of 20
Do you have left child of 50 ?, press Y/N
Do you have right child of 50 ?, press Y/N
Do you have right child of 10 ?, press Y/N
Enter the data for right child of 10
Do you have left child of 30 ?, press Y/N
Do you have right child of 30 ?, press Y/N
Enter the data for right child of 30
Do you have left child of 70 ?, press Y/N
Do you have right child of 70 ?, press Y/N

--------------------
20 => 10 <= 30
40 => 20 <= 50
.  => 40 <= .
.  => 50 <= .
.  => 30 <= 70
.  => 70 <= .
--------------------
size: 6
max: 70
found 10: true
found 50: true
found 60: true
found 40: true
found 500: false
found -1: false
height: 2
diameter: 4
diameter: 4
diameter: 4
is Balanced: true
is Balanced: true

pre-order traversal
10 20 40 50 30 70 
in-order traverasl
40 20 50 10 30 70 
post-order traversal
40 50 20 70 30 10 
preorder iterative
10 20 40 50 30 70 
*/