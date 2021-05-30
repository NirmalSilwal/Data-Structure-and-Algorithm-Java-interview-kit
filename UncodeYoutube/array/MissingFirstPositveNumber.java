package array;

import java.util.Arrays;

public class MissingFirstPositveNumber {

	// O(NlogN) time | O(1) space
	public static int findMissingFirst(int[] arr) {
		Arrays.sort(arr);
		int ans = -1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1] + 1) {
				ans = arr[i - 1] + 1;
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 20, 5, 1, 4 };
		System.out.println(findMissingFirst(arr));
	}
}
