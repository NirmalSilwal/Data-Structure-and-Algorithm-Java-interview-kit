package easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {

	public static int majorityElement(int[] nums) {

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

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums));

		System.out.println(majorityElement(new int[] { 3, 2, 3 }));

		System.out.println(majorityElement(new int[] { 2, 2 }));

	}
}
