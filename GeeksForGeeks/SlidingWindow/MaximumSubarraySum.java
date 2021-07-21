package SlidingWindow;

public class MaximumSubarraySum {

	// brute force approch - O(N*k) Time | O(1) Space
	public static int maxSubarraySum(int[] arr, int k) {

		int maxsum = Integer.MIN_VALUE;

		for (int i = 0; i <= arr.length - k; i++) {
			int windowsum = 0;

			for (int window = 0; window < k; window++) {
				windowsum += arr[i + window];
			}
			maxsum = Math.max(maxsum, windowsum);
		}

		return maxsum;
	}

	// O(N) Time | O(1) Space
	public static int maxSubarraySum2(int[] arr, int k) {

		int maxsum = Integer.MIN_VALUE;
		int head = 0, tail = k, n = arr.length;

		int windowSum = 0;
		for (int i = 0; i < k; i++) {
			windowSum += arr[i];
		}
		maxsum = Math.max(maxsum, windowSum);

		for (int slide = 1; slide <= n - k; slide++) {

			if (head < n && tail < n) {
				windowSum -= arr[head];
				windowSum += arr[tail];
				head++;
				tail++;
			}
			maxsum = Math.max(maxsum, windowSum);
		}

		return maxsum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 10, 23, 3, 1, 0, 20 };
		// int[] arr = { 100, 200, 300, 400 };
		int windowSize = 4;

		System.out.println(maxSubarraySum(arr, windowSize));
		System.out.println(maxSubarraySum2(arr, windowSize));
	}
}
