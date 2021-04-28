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
	}
}

/* output:
Enter the data for root node: 
10 Y 20 Y 40 N N Y 580 N N Y 30 N Y 60 N N
Do you have left child of 10 ?, press Y/N
Enter the data for left child of 10
Do you have left child of 20 ?, press Y/N
Enter the data for left child of 20
Do you have left child of 40 ?, press Y/N
Do you have right child of 40 ?, press Y/N
Do you have right child of 20 ?, press Y/N
Enter the data for right child of 20
Do you have left child of 580 ?, press Y/N
Do you have right child of 580 ?, press Y/N
Do you have right child of 10 ?, press Y/N
Enter the data for right child of 10
Do you have left child of 30 ?, press Y/N
Do you have right child of 30 ?, press Y/N
Enter the data for right child of 30
Do you have left child of 60 ?, press Y/N
Do you have right child of 60 ?, press Y/N

--------------------
20 => 10 <= 30
40 => 20 <= 580
.  => 40 <= .
.  => 580 <= .
.  => 30 <= 60
.  => 60 <= .
--------------------
size: 6
max: 580
found 10: true
found 50: false
found 60: true
found 40: true
found 500: false
found -1: false
height: 2
*/