package LeetcodeDaily.March2022;

import java.util.HashMap;

public class Day5DeleteAndEarnLC740 {

	public static int deleteAndEarn2(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int n : nums) {
			if (!map.containsKey(n)) {
				map.put(n, 1);
			} else {
				map.put(n, map.get(n) + 1);
			}
		}

		int maxpoints = 0;

		return maxpoints;
	}

	public static int deleteAndEarn(int[] nums) {
		if (nums.length == 1)
			return nums[0];

		int[] maxrange = new int[10001];

		for (int n : nums) {
			maxrange[n] += n;
		}

		int twoback = maxrange[0];
		int oneback = Math.max(twoback, maxrange[1]);
		int temp = oneback;

		for (int i = 2; i < maxrange.length; i++) {
			temp = Math.max(maxrange[i] + twoback, oneback);
			twoback = oneback;
			oneback = temp;
		}

		return temp;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 2, 3, 3, 3, 4 };
		System.out.println(deleteAndEarn(arr));
	}
}
