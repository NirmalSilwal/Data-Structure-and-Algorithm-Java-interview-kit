package section24_BinaryTree;

public class BinaryTreeClient {

	public static void main(String[] args) {

		BinaryTree btree = new BinaryTree();

		/* test input: 10 Y 20 Y 40 N N Y 50 N N Y 30 N Y 60 N N */
		
		btree.display();
	}
}




/* output:
Enter the data for root node: 
10 Y 20 Y 40 N N Y 50 N N Y 30 N Y 60 N N
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
Do you have left child of 60 ?, press Y/N
Do you have right child of 60 ?, press Y/N

--------------------
20 => 10 <= 30
40 => 20 <= 50
.  => 40 <= .
.  => 50 <= .
.  => 30 <= 60
.  => 60 <= .
--------------------
*/