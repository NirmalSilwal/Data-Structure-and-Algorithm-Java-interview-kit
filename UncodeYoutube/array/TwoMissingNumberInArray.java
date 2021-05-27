package array;

public class TwoMissingNumberInArray {

	// O(N) time | O(N) space
	public static void printTwoMissingNumbers(int[] arr) {
		int n = arr.length + 2;
		// initialized with zero
		int[] binaryArr = new int[n + 1];

		// set 1 in binaryArr for existing items in arr
		for (int num : arr) {
			binaryArr[num] = 1;
		}
		// print missing numbers
		for (int i = 1; i <= n; i++) {
			if (binaryArr[i] == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		printTwoMissingNumbers(new int[] { 2, 1, 3, 5 });
	}
}
