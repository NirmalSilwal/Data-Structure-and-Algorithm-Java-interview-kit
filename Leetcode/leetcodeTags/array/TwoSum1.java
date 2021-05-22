package leetcodeTags.array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {

	public static int[] twoSum2(int[] nums, int target) {

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

	public static int[] twoSum(int[] nums, int target) {

		int[] ans = new int[2];

		// number and index
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int index = 0; index < nums.length; index++) {

			if (!map.containsKey(nums[index])) {

				map.put(target - nums[index], index);

			} else {
				ans[0] = index;
				ans[1] = map.get(nums[index]);
				break;
			}
		}

		return ans;
	}

	public static int[] twoSum3(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int index = 0; index < nums.length; index++) {

			int targetSum = target - nums[index];

			if (map.containsKey(targetSum)) {
				return new int[] { index, map.get(targetSum) };
			} else {
				map.put(nums[index], index);
			}
		}
		return new int[2];
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		System.out.println(Arrays.toString(twoSum3(nums, target)));
	}
}
