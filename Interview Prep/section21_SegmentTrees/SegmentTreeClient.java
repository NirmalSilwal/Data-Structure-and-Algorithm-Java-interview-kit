package section21_SegmentTrees;

public class SegmentTreeClient {

	public static void main(String[] args) {

		int[] arr = { 3, 8, 7, 6, -2, -8, 4, 9 };

		SegmentTree tree = new SegmentTree(arr);

		tree.display();
		System.out.println("\n------------------------------------------");

		int rangeSum = tree.query(2, 6); // startIndex, endIndex of array
		System.out.println("sum of array in range is: " + rangeSum); // 7
		System.out.println("sum of array in range is: " + tree.query(4, 5)); // -10
		System.out.println("sum of array in range is: " + tree.query(0, 0)); // 3

		System.out.println("\nafter update operation...\n");
		System.out.println("\n------------------------------------------");

		int updateIndex = 3, updateNewValue = 14;
		tree.update(updateIndex, updateNewValue);
		tree.display();
		System.out.println("\n-------------");
		System.out.println("sum of array in range is: " + tree.query(2, 6)); // 15

	}

}
