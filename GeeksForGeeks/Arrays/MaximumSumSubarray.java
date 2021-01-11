package gfg.Arrays;

public class MaximumSumSubarray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };
		System.out.println("max sum of subarray: " + maxSum(arr)); // 6

		int[] arr2 = { 2, 3, -8, 7, -1, 2, 3 };
		System.out.println("max sum of subarray: " + maxSum(arr2)); // 11

		int[] arr3 = { 5, 8, 3 };
		System.out.println("max sum of subarray: " + maxSum(arr3)); // 16

		int[] arr4 = { -6, -1, -8 };
		System.out.println("max sum of subarray: " + maxSum(arr4)); // -1
	}

	// O(n^2) Time | O(n) Space
	public static int maxSum(int[] arr) {
		int result = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			int currSum = 0;
			for (int j = i; j < arr.length; j++) {
				currSum += arr[j];

				if (currSum > result)
					result = currSum;
			}
		}

		return result;
	}

}
