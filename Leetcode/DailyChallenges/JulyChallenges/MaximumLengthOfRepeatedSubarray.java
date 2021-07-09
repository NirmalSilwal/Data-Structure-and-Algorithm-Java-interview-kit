package DailyChallenges.JulyChallenges;

public class MaximumLengthOfRepeatedSubarray {

	// using DP
	public static int findLength(int[] nums1, int[] nums2) {
		// by default fills with zero in dp
		int[][] dp = new int[nums1.length + 1][nums2.length + 1];
		int max = 0;

		for (int i = 1; i < dp.length; i++) {

			for (int j = 1; j < dp[0].length; j++) {

				// if last element matches in both subarray
				if (nums1[i - 1] == nums2[j - 1]) {
					dp[i][j] = 1 + dp[i - 1][j - 1]; // upper left diagonal
				}
				max = Math.max(max, dp[i][j]);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 2, 1 };
		int[] nums2 = { 3, 2, 1, 4, 7 };

		int[] nums3 = { 0, 0, 0, 0, 0 };
		int[] nums4 = { 0, 0, 0, 0, 0 };

		System.out.println(findLength(nums1, nums2));
		System.out.println(findLength(nums3, nums4));

		System.out.println(findLength(new int[] { 0, 1, 1, 1, 1 }, new int[] { 1, 0, 1, 0, 1 }));
		System.out.println(findLength(new int[] { 0, 1, 0, 1, 0 }, new int[] { 0, 0, 1, 0, 0 }));
		System.out.println(
				findLength(new int[] { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 }, new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 }));

	}
}
