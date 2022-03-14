package seanPrashadList;

import java.util.HashMap;
import java.util.Map;

/*
Example 1:

Input: nums = [1,2,3,1]
Output: true

Example 2:

Input: nums = [1,2,3,4]
Output: false
 */

public class ContainsDuplicateLC217 {

	public static boolean containsDuplicate(int[] nums) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int currnum : nums) {
			if (!map.containsKey(currnum)) {
				map.put(currnum, 1);
			} else {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 2, 3, 4, 1 };

		System.out.println(containsDuplicate(arr));
		System.out.println(containsDuplicate(arr2));
	}
}
