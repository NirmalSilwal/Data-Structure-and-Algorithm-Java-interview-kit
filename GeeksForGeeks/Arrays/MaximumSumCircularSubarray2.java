package gfg.Arrays;

public class MaximumSumCircularSubarray2 {

	public static void main(String[] args) {
		int[] arr = { 10, 5, -5 };
		System.out.println(maxSubarraySumCircular(arr)); // 15

		int[] arr2 = { 1, -2, 3, -2 };
		System.out.println(maxSubarraySumCircular(arr2)); // 3

		int[] arr3 = { 3, -1, 2, -1 };
		System.out.println(maxSubarraySumCircular(arr3)); // 4

		int[] arr4 = { 3, -2, 2, -3 };
		System.out.println(maxSubarraySumCircular(arr4)); // 3

		int[] arr5 = { 5, -3, 5 };
		System.out.println(maxSubarraySumCircular(arr5)); // 10

		int[] arr6 = { -2, -3, -1 };
		System.out.println(maxSubarraySumCircular(arr6)); // -1

		int[] arr7 = { 3, -4, 5, 6, -8, 7 };
		System.out.println(maxSubarraySumCircular(arr7)); // 17
	}

	// O(N) Time | O(1) Space
	public static int maxSubarraySumCircular(int[] arr) {
		int maxNormalSum = normalMaxSubarraySumKadanes(arr);
		if (maxNormalSum < 0) {
			return maxNormalSum;
		}

		// now finding circular sum
		int arrayTotal = 0;
		int[] arrCopy = arr.clone();
		for (int i = 0; i < arr.length; i++) {
			arrayTotal += arr[i];
			arrCopy[i] = -arrCopy[i];
		}

		int minSubarraySum = normalMaxSubarraySumKadanes(arrCopy);
		int maxCircularSum = arrayTotal + minSubarraySum;

		int result = Math.max(maxNormalSum, maxCircularSum);

		return result;
	}

	// O(n) time operation
	public static int normalMaxSubarraySumKadanes(int[] arr) {
		int result = arr[0];
		int subarraySum = 0;
		for (int i = 0; i < arr.length; i++) {
			subarraySum += arr[i];
			result = Math.max(subarraySum, result);
			if (subarraySum < 0) {
				subarraySum = 0;
			}
		}
		return result;
	}
}
