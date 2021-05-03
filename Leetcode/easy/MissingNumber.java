package easy;

//LC 268

public class MissingNumber {

	public static int missingNumber(int[] nums) {

		int xoredTotal = 0;
		for (int n = 0; n <= nums.length; n++) {
			xoredTotal = xoredTotal ^ n;
		}

		int numsXoredTotal = 0;
		for (int i = 0; i < nums.length; i++) {
			numsXoredTotal = numsXoredTotal ^ nums[i];
		}
		return numsXoredTotal ^ xoredTotal;
	}

	public static void main(String[] args) {
		int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println(missingNumber(nums)); // 8
	}

}
