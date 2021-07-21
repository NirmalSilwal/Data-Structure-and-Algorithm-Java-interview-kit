package practice.revisited;

// leetcode 53. Maximum Subarray
public class MaximumSubarrayLC53 {

	public static int maxSubArray1(int[] nums) {

		int maxsum = Integer.MIN_VALUE;
		int currsum = 0;

		for (int n : nums) {

			currsum += n;
			maxsum = Math.max(currsum, maxsum);

			if (currsum < 0)
				currsum = 0;
		}

		return maxsum;
	}

	// using DP - O(N) Time | O(N) Space
	public static int maxSubArray(int[] nums) {

		int[] dp = new int[nums.length];
		dp[0] = nums[0];

		int maxsum = nums[0];

		for (int i = 1; i < nums.length; i++) {

			// dp[i] = (nums[i] > dp[i - 1]) ? nums[i] : nums[i] + dp[i - 1];
			dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);

			maxsum = Math.max(maxsum, dp[i]);
		}

		return maxsum;
	}

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(arr));

		System.out.println(maxSubArray(new int[] { 1 }));
		System.out.println(maxSubArray(new int[] { 5, 4, -1, 7, 8 }));
	}
}
