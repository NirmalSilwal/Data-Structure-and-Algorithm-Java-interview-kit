package leetcodeTags.array;

import java.util.Arrays;

public class TwoSum1 {

	public static int[] twoSum(int[] nums, int target) {

		if (nums.length < 2)
			return null;

		int[] ans = new int[2];

		for (int i = 0; i < nums.length; i++) {

			int remainingSum = target - nums[i];

			for (int cursor = 0; cursor < nums.length; cursor++) {

				if (cursor != i) {

					if (remainingSum == nums[cursor]) {
						ans[0] = i;
						ans[1] = cursor;
					}
				}
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
}
