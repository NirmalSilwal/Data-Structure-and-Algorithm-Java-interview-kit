package gfg.Arrays;

public class MaximumSumCircularSubarray {

	public static void main(String[] args) {

		int[] arr = { 10, 5, -5 };
		System.out.println(maxSubarraySumCircular(arr)); // 15

		int[] arr2 = { 1, -2, 3, -2 };
		System.out.println(maxSubarraySumCircular(arr2)); // 3

		int[] arr5 = { 5, -3, 5 };
		System.out.println(maxSubarraySumCircular(arr5)); // 10

		int[] arr3 = { 3, -1, 2, -1 };
		System.out.println(maxSubarraySumCircular(arr3)); // 4

		int[] arr4 = { 3, -2, 2, -3 };
		System.out.println(maxSubarraySumCircular(arr4)); // 3

		int[] arr6 = { -2, -3, -1 };
		System.out.println(maxSubarraySumCircular(arr6)); // -1

	}

	// O(n^2) Time | O(1) Space
	public static int maxSubarraySumCircular(int[] arr) {
		int result = arr[0];
		for (int i = 0; i < arr.length; i++) {
			int currSum = 0;
			for (int j = i; j < arr.length; j++) {
				currSum += arr[j];
				result = Math.max(currSum, result);
			}
			for (int k = 0; k < i; k++) {
				currSum += arr[k];
				result = Math.max(currSum, result);
			}
		}
		return result;
	}
}
