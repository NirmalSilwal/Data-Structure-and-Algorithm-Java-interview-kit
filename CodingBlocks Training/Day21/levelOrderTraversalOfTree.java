package Lecture21;

import java.util.LinkedList;
import java.util.Queue;

import Lecture21.binaryTree.Node;

public class levelOrderTraversalOfTree {

	public static void main(String[] args) {

		binaryTree btree = new binaryTree();
		System.out.println("\n----------------------------------------\n");
		btree.display();
		System.out.println("\n------- Level order traversal -----------\n");
		levelOrderTraversal(btree.root);

	}

	private static void levelOrderTraversal(Node node) {
		/*
		 * Since Queue is an interface, objects cannot be created of the type
		 * queue. We always need a class which extends this list in order to
		 * create an object.
		 */
		Queue<Node> queue = new LinkedList<Node>();

		queue.add(node);

		while (!queue.isEmpty()) {
			Node firstElement = queue.remove();
			System.out.print(firstElement.data + " ");

			if (firstElement.left != null) {
				queue.add(firstElement.left);
			}
			if (firstElement.right != null) {
				queue.add(firstElement.right);
			}
		}
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
Do you have right child for 49 -> true/false: false

----------------------------------------

25 => 50 <= 75
12 => 25 <= 68
END => 12 <= END
END => 68 <= END
39 => 75 <= 49
END => 39 <= END
END => 49 <= END

------- Level order traversal -----------

50 25 75 12 68 39 49 
*/