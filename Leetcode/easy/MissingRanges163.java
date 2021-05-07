package easy;

import java.util.ArrayList;
import java.util.List;

//LC#163 Missing Ranges

public class MissingRanges163 {

	// O(N) Time
	public static List<String> findMissingRanges(int[] nums, int lower, int upper) {

		ArrayList<String> ans = new ArrayList<>();

		if (nums == null || nums.length == 0) {
			ans.add(addRange(lower, upper));
			return ans;
		}
		if (nums[0] > lower) {
			ans.add(addRange(lower, nums[0] - 1));
		}

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i + 1] > nums[i] + 1) {
				ans.add(addRange(nums[i] + 1, nums[i + 1] - 1));
			}
		}

		if (nums[nums.length - 1] < upper) {
			ans.add(addRange(nums[nums.length - 1] + 1, upper));
		}

		return ans;
	}

	private static String addRange(int lower, int upper) {
		if (lower == upper)
			return lower + "";
		else
			return lower + "->" + upper;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2 };
		int low = 0;
		int high = 9;
		System.out.println(findMissingRanges(nums, low, high));
		System.out.println(findMissingRanges(new int[] { 0, 1 }, 0, 1));
		System.out.println(findMissingRanges(new int[] { -1 }, -2, 0));
		System.out.println(findMissingRanges(new int[] {}, 1, 1));
		System.out.println(findMissingRanges(new int[] { -1 }, -2, -1));
		System.out.println(findMissingRanges(new int[] { -1 }, -2, 0));
		System.out.println(findMissingRanges(new int[] { -1 }, -1, -1));
		System.out.println(findMissingRanges(new int[] { 0, 1, 3, 50, 75 }, 0, 99));

	}
}