package section19_DynamicProgramming;

public class LongestIncSubsequenceOptimal {

	public static void main(String[] args) {

		// int[] arr = { 3, 4, -1, 0, 6, 2, 3 }; // 4 - LIS {-1,0,2,3}
		// int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 }; // 4 - LIS {2,3,7,101}

		int[] arr = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		// 6 - LIS {0,1,3,7,11,15}

		int result = longestIncSubseq(arr);
		System.out.println("\nlongest increasing subsequence length is : " + result);
	}

	public static int longestIncSubseq(int[] arr) {
		if (arr.length == 0)
			return 0;

		int[] lastElements = new int[arr.length];

		lastElements[0] = arr[0];
		int len = 1;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > lastElements[len - 1]) {
				lastElements[len] = arr[i]; // insert operation
				len++;
			} else {
				int index = binarySearch(lastElements, 0, len - 1, arr[i]);
				lastElements[index] = arr[i]; // replace operation
			}

			System.out.print(arr[i] + ": ");
			for (int val : lastElements) {
				System.out.print(val + " ");
			}
			System.out.println();

		}

		return len;
	}

	// returns index
	private static int binarySearch(int[] arr, int si, int ei, int item) {
		int low = si;
		int high = ei;

		while (low <= high) {

			int mid = (high + low) / 2;

			if (item > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low;
	}
}

/*
 * output: 8: 0 8 0 0 0 0 0 0 0 0 0 0 0 0 0 0 4: 0 4 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 12: 0 4 12 0 0 0 0 0 0 0 0 0 0 0 0 0 2: 0 2 12 0 0 0 0 0 0 0 0 0 0 0 0 0 10:
 * 0 2 10 0 0 0 0 0 0 0 0 0 0 0 0 0 6: 0 2 6 0 0 0 0 0 0 0 0 0 0 0 0 0 14: 0 2 6
 * 14 0 0 0 0 0 0 0 0 0 0 0 0 1: 0 1 6 14 0 0 0 0 0 0 0 0 0 0 0 0 9: 0 1 6 9 0 0
 * 0 0 0 0 0 0 0 0 0 0 5: 0 1 5 9 0 0 0 0 0 0 0 0 0 0 0 0 13: 0 1 5 9 13 0 0 0 0
 * 0 0 0 0 0 0 0 3: 0 1 3 9 13 0 0 0 0 0 0 0 0 0 0 0 11: 0 1 3 9 11 0 0 0 0 0 0
 * 0 0 0 0 0 7: 0 1 3 7 11 0 0 0 0 0 0 0 0 0 0 0 15: 0 1 3 7 11 15 0 0 0 0 0 0 0
 * 0 0 0
 * 
 * longest increasing subsequence length is : 6
 */