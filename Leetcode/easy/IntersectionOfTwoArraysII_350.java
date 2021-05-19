package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArraysII_350 {

	public static int[] intersect(int[] nums1, int[] nums2) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		ArrayList<Integer> intersection = new ArrayList<>();

		// store all items of nums1 in hashmap with their count
		for (int item1 : nums1) {

			if (!map.containsKey(item1)) {
				map.put(item1, 1);
			} else {
				map.put(item1, map.get(item1) + 1);
			}
		}

		for (int val : nums2) {

			if (map.containsKey(val)) {
				int currentCount = map.get(val);

				if (currentCount >= 1) {
					intersection.add(val);
					// for intersection item that occur more than 1 time
					map.put(val, currentCount - 1);
				}
				// there can be duplicate elements
				if (currentCount == 0) {
					map.remove(val);
				}
			}
		}

		// to return final result, we need array
		int[] ans = new int[intersection.size()];

		// copying intersection result in array from ArrayList
		for (int i = 0; i < ans.length; i++) {
			ans[i] = intersection.get(i);
		}

		return ans;
	}

	public static void main(String[] args) {

		// test case 1
//		int[] nums1 = { 1, 2, 2, 1 };
//		int[] nums2 = { 2, 2 };

		// test case 2
		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };

		int[] intersection = intersect(nums1, nums2);
		System.out.println(Arrays.toString(intersection));
	}
}
