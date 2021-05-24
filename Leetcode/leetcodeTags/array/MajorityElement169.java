package leetcodeTags.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {

	// First approach - O(N) Time | O(N) Space
	public static int majorityElement(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int n : nums) {
			if (!map.containsKey(n)) {
				map.put(n, 1);
			} else {
				map.put(n, map.get(n) + 1);
			}
		}

		int max = nums[0];
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int count = entry.getValue();
			if (count > (nums.length / 2)) {
				max = entry.getKey();
			}
		}

		return max;
	}

	// approach 2 - using sorting - O(NlogN) Time | O(1) Space
	public static int majorityElement2(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

	// approach 3 - Moore's voting algorithm - O(N) Time | O(1) Space
	public static int majorityElement3(int[] nums) {

		int majority = nums[0], count = 1;

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] != majority) {
				count--;
			}
			if (count == 0) {
				majority = nums[i];
			}
			if (majority == nums[i]) {
				count++;
			}
		}
		return majority;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums));
		System.out.println(majorityElement2(nums));
		System.out.println(majorityElement3(nums));
	}
}
