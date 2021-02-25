package section14_Tree;

public class BinarySearchTreeClient {

	public static void main(String[] args) {

		int[] inOrderArray = { 10, 20, 30, 40, 50, 60, 70 };
		BinarySearchTree bst = new BinarySearchTree(inOrderArray);

		bst.display();
	}

}
