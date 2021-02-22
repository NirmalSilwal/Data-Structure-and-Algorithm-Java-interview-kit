package section14_Tree;

public class BinaryTreeClient {

	public static void main(String[] args) {

		BinaryTree btree = new BinaryTree();
		System.out.println();
		btree.display();

		/*
		 * 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
		 */
	}

}

/* output:
Enter data for root node: 
50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
Is there left child of 50? Press true/false
Enter data for left node of 50
Is there left child of 25? Press true/false
Enter data for left node of 25
Is there left child of 38? Press true/false
Is there right child of 38? Press true/false
Is there right child of 25? Press true/false
Enter data for right node of 25
Is there left child of 48? Press true/false
Enter data for left node of 48
Is there left child of 18? Press true/false
Is there right child of 18? Press true/false
Is there right child of 48? Press true/false
Is there right child of 50? Press true/false
Enter data for right node of 50
Is there left child of 45? Press true/false
Enter data for left node of 45
Is there left child of 85? Press true/false
Is there right child of 85? Press true/false
Is there right child of 45? Press true/false
Enter data for right node of 45
Is there left child of 60? Press true/false
Is there right child of 60? Press true/false

25 => 50 <= 45
38 => 25 <= 48
NULL => 38 <= NULL
18 => 48 <= NULL
NULL => 18 <= NULL
85 => 45 <= 60
NULL => 85 <= NULL
NULL => 60 <= NULL
*/