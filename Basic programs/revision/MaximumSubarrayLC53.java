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
	public static int maxSubArray2(int[] nums) {

		int[] dp = new int[nums.length];
		dp[0] = nums[0];

		int maxsum = nums[0];

		for (int i = 1; i < nums.length; i++) {

			dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);

			maxsum = Math.max(maxsum, dp[i]);
		}

		return maxsum;
	}

	// using divide and conquer
	private static int[] numsArr;

	public static int maxSubArray(int[] nums) {

		numsArr = nums;

		return findMaxSubarray(0, numsArr.length - 1);
	}

	// helper recusive method
	private static int findMaxSubarray(int left, int right) {
		if (left > right)
			return Integer.MIN_VALUE;

		int mid = left + (right - left) / 2;
		int currSum = 0;
		int leftMaxSum = 0, rightMaxSum = 0;

		// finding max subarray sum in left half
		for (int i = mid - 1; i >= left; i--) {
			currSum += numsArr[i];
			leftMaxSum = Math.max(leftMaxSum, currSum);
		}

		// finding in right half
		currSum = 0;
		for (int i = mid + 1; i <= right; i++) {
			currSum += numsArr[i];
			rightMaxSum = Math.max(rightMaxSum, currSum);
		}
		// considering middle element also
		int combinedSum = numsArr[mid] + leftMaxSum + rightMaxSum;

		int leftHalfSum = findMaxSubarray(left, mid - 1);
		int rightHalfSum = findMaxSubarray(mid + 1, right);

		int result = Math.max(combinedSum, Math.max(leftHalfSum, rightHalfSum));
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(arr));

		System.out.println(maxSubArray(new int[] { 1 }));
		System.out.println(maxSubArray(new int[] { 5, 4, -1, 7, 8 }));
	}
}
