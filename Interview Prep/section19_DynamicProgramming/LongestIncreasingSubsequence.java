package section19_DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {

		// int[] arr = { 3, 4, -1, 0, 6, 2, 3 }; // 4 - LIS {-1,0,2,3}
		int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 }; // 4 - LIS {2,3,7,101}

		System.out.println(longestIncSubseq(arr));
	}

	// O(n^2) Time | O(n) Space
	public static int longestIncSubseq(int[] arr) {

		if (arr.length == 0)
			return 0;

		int[] storage = new int[arr.length];
		Arrays.fill(storage, 1);

		int ans = 1;

		for (int idx = 1; idx < arr.length; idx++) {
			int currMax = 1;

			for (int cursor = 0; cursor < idx; cursor++) {
				int max = 1;
				if (arr[idx] > arr[cursor]) {
					max = 1 + storage[cursor];
				}
				if (max > currMax) {
					currMax = max;
				}
			}
			if (currMax > ans)
				ans = currMax;

			storage[idx] = currMax;
		}
		return ans;
	}
}
