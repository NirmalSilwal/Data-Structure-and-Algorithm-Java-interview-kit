package Lecture20;

public class binaryTreeClient {

	public static void main(String[] args) {

		binaryTree btree = new binaryTree();

		btree.display();

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
Do you have left child for 68 -> true/false: true
Enter data for left child of 68: 17
Do you have left child for 17 -> true/false: false
Do you have right child for 17 -> true/false: false
Do you have right child for 68 -> true/false: false
Do you have right child for 50 -> true/false: true
Enter data for right child of: 50: 75
Do you have left child for 75 -> true/false: true
Enter data for left child of 75: 48
Do you have left child for 48 -> true/false: false
Do you have right child for 48 -> true/false: false
Do you have right child for 75 -> true/false: true
Enter data for right child of: 75: 39
Do you have left child for 39 -> true/false: false
Do you have right child for 39 -> true/false: false
25 => 50 <= 75
12 => 25 <= 68
END => 12 <= END
17 => 68 <= END
END => 17 <= END
48 => 75 <= 39
END => 48 <= END
END => 39 <= END
*/