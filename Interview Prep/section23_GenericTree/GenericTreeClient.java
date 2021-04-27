package section23_GenericTree;

public class GenericTreeClient {

	public static void main(String[] args) {

		GenericTree tree = new GenericTree();

		/* test input: 10 3 20 2 50 0 60 0 30 0 40 1 70 0 */
		tree.display();

		System.out.println("size of tree is: " + tree.size());

		/* test input2: 10 3 20 2 50 0 80 0 30 0 400 1 70 0 */
		System.out.println("max data is: " + tree.max());

		int searchItem = 70;
		System.out.println("found " + searchItem + ": " + tree.find(searchItem));

		int searchItem2 = 90;
		System.out.println("found " + searchItem2 + ": " + tree.find(searchItem2));

		int searchItem3 = 10;
		System.out.println("found " + searchItem3 + ": " + tree.find(searchItem3));

		/* test input3: 10 3 20 2 50 0 60 1 80 0 30 0 40 1 70 0 */
		System.out.println("height: " + tree.height());
	}

}
