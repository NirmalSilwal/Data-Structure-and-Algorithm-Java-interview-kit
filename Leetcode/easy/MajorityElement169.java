package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {

	// O(N) Time | O(N) Space
	public static int majorityElement1(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int n : nums) {
			if (!map.containsKey(n)) {
				map.put(n, 1);
			} else {
				map.put(n, map.get(n) + 1);
			}
		}

		double maxLimit = Math.ceil(nums.length / 2.0);
		int ans = Integer.MAX_VALUE;

		for (Map.Entry<Integer, Integer> entries : map.entrySet()) {
			if (entries.getValue() >= maxLimit)
				ans = entries.getKey();
		}
		return ans;
	}

	// O(NlogN) Time | O(1) Space
	public static int majorityElement2(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

	// optimizing using Boyer-Moore Voting Algorithm
	// O(N) Time | O(1) Space
	public static int majorityElement(int[] nums) {
		
		int candidate = nums[0];
		int votes = 1;

		for (int i = 1; i < nums.length; i++) {
			int curr = nums[i];

			if (curr == candidate) {
				votes++;
			} else {
				votes--;
			}

			if (votes == 0) {
				candidate = curr;
				votes = 1;
			}
		}

		// verifying candidate votes count
		int count = 0;
		for (int n : nums) {
			if (n == candidate)
				count++;
		}

		if (count > nums.length / 2) {
			return candidate;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums));

		System.out.println(majorityElement(new int[] { 3, 2, 3 }));
		//
		System.out.println(majorityElement(new int[] { 2, 2 }));

	}
}
