package DailyChallenges.JulyChallenges;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static int lengthOfLIS(int[] nums) {

		int[] dp = new int[nums.length];
		Arrays.fill(dp, 1);
		int ans = 1;

		for (int i = 1; i < dp.length; i++) {

			for (int j = 0; j < i; j++) {

				if (nums[i] > nums[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}

				ans = Math.max(ans, dp[i]);
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
		System.out.println(lengthOfLIS(nums));

		System.out.println(lengthOfLIS(new int[] { 0, 1, 0, 3, 2, 3 }));
		System.out.println(lengthOfLIS(new int[] { 7, 7, 7, 7, 7, 7, 7 }));

	}

	// this code has bug
	/*
	 * public static int lengthOfLIS(int[] nums) { int max = 0;
	 * 
	 * for (int i = 0; i < nums.length; i++) { ArrayList<Integer> list = new
	 * ArrayList<>(); list.add(nums[i]); int currentMaxPointer = 0;
	 * 
	 * for (int j = i + 1; j < nums.length; j++) {
	 * 
	 * if (nums[j] > list.get(currentMaxPointer)) { list.add(nums[j]);
	 * currentMaxPointer++; } }
	 * 
	 * max = Math.max(max, list.size()); }
	 * 
	 * return max; }
	 */
}
