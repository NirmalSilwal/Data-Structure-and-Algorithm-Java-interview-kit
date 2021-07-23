package leetcodeTags.array;

import java.util.Arrays;

public class BuildArrayFromPermutation1920 {

	public static int[] buildArray1(int[] nums) {

		int[] ans = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[nums[i]];
		}

		return ans;
	}

	public static int[] buildArray(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			int curr = nums[i];
			swap(nums, i, curr);
		}

		return nums;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
//		 int[] result = buildArray(new int[] { 0, 2, 1, 5, 3, 4 });
		int[] result = buildArray(new int[] { 5, 0, 1, 2, 3, 4 });

		System.out.println(Arrays.toString(result));
	}
}
