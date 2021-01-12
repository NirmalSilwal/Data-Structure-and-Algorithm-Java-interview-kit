package leetcode.array.medium;

public class MaximumSumCircularSubarray2 {

	public static void main(String[] args) {
		int[] arr = { 1, -2, 3, -2 };
		System.out.println(maxSubarraySumCircular(arr)); // 3
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
