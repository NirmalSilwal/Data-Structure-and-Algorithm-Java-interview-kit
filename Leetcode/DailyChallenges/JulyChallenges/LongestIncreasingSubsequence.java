package DailyChallenges.JulyChallenges;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestIncreasingSubsequence {

	// O(N^2) Time | O(N) Space
	public static int lengthOfLIS1(int[] nums) {

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

	// optimizing using binary search
	// O(NlogN) Time | O(N) Space
	public static int lengthOfLIS(int[] nums) {

		ArrayList<Integer> sublist = new ArrayList<>();
		sublist.add(nums[0]);

		for (int i = 1; i < nums.length; i++) {

			int curr = nums[i];

			// if current element is greater than max value in sublist, add it
			// in sublist
			if (curr > sublist.get(sublist.size() - 1)) {
				sublist.add(curr);
			} else {
				int positionToInsert = binarySearch(sublist, curr);
				sublist.set(positionToInsert, curr);
			}
		}

		return sublist.size();
	}

	private static int binarySearch(ArrayList<Integer> sublist, int curr) {
		int left = 0, right = sublist.size() - 1;

		while (left < right) {

			int mid = left + (right - left) / 2;

			if (sublist.get(mid) == curr) {
				return mid;
			}

			if (sublist.get(mid) > curr) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}

		return left;
	}

	public static void main(String[] args) {
		int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
		System.out.println(lengthOfLIS(nums));

		System.out.println(lengthOfLIS(new int[] { 0, 1, 0, 3, 2, 3 }));
		System.out.println(lengthOfLIS(new int[] { 7, 7, 7, 7, 7, 7, 7 }));

		System.out.println(lengthOfLIS(new int[] { 3, 5, 6, 2, 5, 4, 19, 5, 6, 7, 12 }));

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
