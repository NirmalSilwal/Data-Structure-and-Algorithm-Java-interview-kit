package gfg.Arrays;

public class MaximumSubArraySum3 {

	public static void main(String[] args) {

		int[] arr = { -3, 8, -2, 4, -5, 6 };
		System.out.println(maxSubarraySum(arr)); // 11

		int[] arr2 = { -6, -1, -8 };
		System.out.println(maxSubarraySum(arr2)); // -1

		int[] arr3 = { 1, 2, 3 };
		System.out.println(maxSubarraySum(arr3)); // 6
	}

	// O(n) Time | O(1) Space
	public static int maxSubarraySum(int[] arr) {
		int result = arr[0];
		int maxTillNow = arr[0];
		for (int i = 1; i < arr.length; i++) {
			maxTillNow = Math.max(arr[i], (maxTillNow + arr[i]));
			result = Math.max(result, maxTillNow);
		}
		return result;
	}

}
