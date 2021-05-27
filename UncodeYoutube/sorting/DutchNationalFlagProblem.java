package sorting;

import java.util.Arrays;

public class DutchNationalFlagProblem {

	// algorithm to sort array having only 0's, 1's and 2's
	// O(N) time | O(1) space
	public static void sortZerosOnesTwosDutchAlgo(int[] nums) {

		int start = 0, end = nums.length - 1;
		int pivotElement = 1, pivotIndex = 0;

		while (pivotIndex <= end) {

			if (nums[pivotIndex] < pivotElement) { // if zero
				swap(nums, start, pivotIndex);
				start++;
				pivotIndex++;

			} else if (nums[pivotIndex] > pivotElement) { // if two
				swap(nums, end, pivotIndex);
				end--;

			} else { // if one
				pivotIndex++;
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
		sortZerosOnesTwosDutchAlgo(nums);
		System.out.println(Arrays.toString(nums));
	}

}
