package leetcodeTags.array;

import java.util.Arrays;

public class ShuffleTheArray1470 {

	// O(N) Time | O(N) Space
	public static int[] shuffle(int[] nums, int n) {

		int[] result = new int[n * 2];
		int start = 0, mid = nums.length / 2, index = 0;

		while (index < nums.length) {

			if (index % 2 == 0) {
				result[index] = nums[start];
				start++;
			} else {
				result[index] = nums[mid];
				mid++;
			}

			index++;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 3, 4, 7 };
		System.out.println(Arrays.toString(shuffle(arr, 3)));

		int[] arr2 = { 1, 2, 3, 4, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(shuffle(arr2, 4)));

		System.out.println(Arrays.toString(shuffle(new int[] { 1, 1, 2, 2 }, 2)));

	}
}
