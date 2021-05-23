package leetcodeTags.array;

import java.util.Arrays;

public class MoveZeroes283 {

	public static void moveZeroes(int[] nums) {

		if (nums.length == 1)
			return;

		int zeropointer = 0, current = 1;

		while (current < nums.length) {

			if (nums[zeropointer] == 0) {
				if (nums[current] != 0) {
					swap(nums, zeropointer, current);
					zeropointer++;
				}
			} else {
				zeropointer++;
			}
			current++;
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// int[] nums = { 0, 1, 0, 3, 12 };
		int[] nums = { 0, 2, 4, 1, 0, 0, 4, 5, 6, 7 };
		System.out.println("before: " + Arrays.toString(nums));

		moveZeroes(nums);
		System.out.println("after: " + Arrays.toString(nums));
	}
}
