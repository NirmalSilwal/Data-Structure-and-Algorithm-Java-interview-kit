package Leetcode.Youtube;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement_LC169 {

	// approach 1 - O(N) time | O(N) space
	public static int majorityElement(int[] nums) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // number, count

		for (int n : nums) {
			if (!map.containsKey(n)) {
				map.put(n, 1);
			} else {
				map.put(n, map.get(n) + 1);
			}
		}

		for (Map.Entry<Integer, Integer> entries : map.entrySet()) {
			if (entries.getValue() > Math.floor(nums.length / 2))
				return entries.getKey();
		}

		return -1;
	}

	// approach 2 - O(NlogN) time | O(1) space
	public static int majorityElement2(int[] nums) {

		int[] numscopy = nums.clone();

		Arrays.sort(numscopy);

		int middle = numscopy[numscopy.length / 2];
		/*
		 * you can return middle from here assuming majority element always exists in
		 * given array
		 * 
		 * return middle;
		 */

		// verify majority element count
		int count = 0;
		for (int n : nums) {
			if (n == middle)
				count++;
		}

		if (count > Math.floor(nums.length / 2))
			return middle;
		else
			return -1;
	}

	// approach 3 - Moore's voting algo
	// O(N) time | O(1) space
	public static int majorityElement3(int[] nums) {

		int candidate = nums[0];
		int votes = 1;

		for (int i = 1; i < nums.length; i++) {
			// see if next element is same as candidate
			if (nums[i] == candidate) {
				votes++;
			} else {
				votes--;
			}

			// reset candidate if their vote get down to zero, find new candidate
			if (votes == 0) {
				candidate = nums[i];
				votes = 1;
			}
		}

		return candidate;
	}

	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
		System.out.println(majorityElement(new int[] { 3, 2, 3 }));

		System.out.println();

		System.out.println(majorityElement2(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
		System.out.println(majorityElement2(new int[] { 3, 2, 3 }));

		System.out.println();

		System.out.println(majorityElement3(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
		System.out.println(majorityElement3(new int[] { 3, 2, 3 }));

	}
}
