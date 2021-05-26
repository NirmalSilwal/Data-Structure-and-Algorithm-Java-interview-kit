package leetcodeTags.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllNumbersDisappearedInArray448 {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int n : nums) {
			if (!map.containsKey(n)) {
				map.put(n, 1);
			} else {
				map.put(n, map.get(n) + 1);
			}
		}

		List<Integer> missingNums = new ArrayList<>();
		for (int i = 1; i <= nums.length; i++) {
			if (!map.containsKey(i)) {
				missingNums.add(i);
			}
		}

		return missingNums;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDisappearedNumbers(nums));
	}
}
