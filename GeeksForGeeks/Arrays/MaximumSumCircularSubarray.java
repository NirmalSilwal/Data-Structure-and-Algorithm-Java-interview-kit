package gfg.Arrays;

public class MaximumSumCircularSubarray {

	public static void main(String[] args) {

		int[] arr = { 10, 5, -5 };
		System.out.println(maxSubarraySumCircular(arr)); // 15
		System.out.println(maxSubarraySumCircular2(arr)); // 15

		int[] arr2 = { 1, -2, 3, -2 };
		System.out.println(maxSubarraySumCircular(arr2)); // 3
		System.out.println(maxSubarraySumCircular2(arr2)); // 15

		int[] arr3 = { 3, -1, 2, -1 };
		System.out.println(maxSubarraySumCircular(arr3)); // 4
		System.out.println(maxSubarraySumCircular2(arr3)); // 15

		int[] arr4 = { 3, -2, 2, -3 };
		System.out.println(maxSubarraySumCircular(arr4)); // 3
		System.out.println(maxSubarraySumCircular2(arr4)); // 15

		int[] arr5 = { 5, -3, 5 };
		System.out.println(maxSubarraySumCircular(arr5)); // 10
		System.out.println(maxSubarraySumCircular2(arr5)); // 15

		int[] arr6 = { -2, -3, -1 };
		System.out.println(maxSubarraySumCircular(arr6)); // -1
		System.out.println(maxSubarraySumCircular2(arr6)); // 15

		int[] arr7 = { 3, -4, 5, 6, -8, 7 };
		System.out.println(maxSubarraySumCircular(arr7)); // 17
		System.out.println(maxSubarraySumCircular2(arr7)); // 15

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

	// O(n^2) Time | O(1) Space
	public static int maxSubarraySumCircular2(int[] arr) {
		int result = arr[0];

		for (int i = 0; i < arr.length; i++) {
			int currMax = arr[i];
			int currSum = arr[i];

			for (int j = 1; j < arr.length; j++) {
				int circularIndex = (i + j) % arr.length;
				currSum += arr[circularIndex];
				currMax = Math.max(currSum, currMax);
			}
			result = Math.max(result, currMax);
		}
		return result;
	}

}
