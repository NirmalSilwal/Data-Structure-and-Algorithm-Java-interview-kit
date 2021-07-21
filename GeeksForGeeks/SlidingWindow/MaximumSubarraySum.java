package SlidingWindow;

public class MaximumSubarraySum {

	// brute force approch - O(N^2) Time | O(1) Space
	public static int maxSubarraySum(int[] arr, int k) {

		int maxsum = Integer.MIN_VALUE;

		for (int i = 0; i <= arr.length - k; i++) {
			int currsum = 0;

			for (int window = 0; window < k; window++) {
				currsum += arr[i + window];
			}
			maxsum = Math.max(maxsum, currsum);
		}

		return maxsum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 10, 23, 3, 1, 0, 20 };
		int windowSize = 4;
		System.out.println(maxSubarraySum(arr, windowSize));
	}
}
