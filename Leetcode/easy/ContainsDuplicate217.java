package easy;

import java.util.HashMap;

public class ContainsDuplicate217 {

	// O(N^2) Time
	public static boolean containsDuplicate1(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j])
					count++;
			}
			if (count > 1)
				return true;
		}
		return false;
	}

	// O(N) Time, runtime: 6ms
	public static boolean containsDuplicate(int[] nums) {
		// number as key and count as value
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		System.out.println(containsDuplicate(nums));

	}
}
