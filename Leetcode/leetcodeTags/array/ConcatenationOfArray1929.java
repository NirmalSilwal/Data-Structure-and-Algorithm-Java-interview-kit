package leetcodeTags.array;

import java.util.Arrays;

public class ConcatenationOfArray1929 {

	public static int[] getConcatenation(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n * 2];

		int id = 0;
		for (int i = 0; i < ans.length; i++) {
			if (i < n) {
				ans[i] = nums[i];
			} else {
				ans[i] = nums[id];
				id++;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1 };
		System.out.println(Arrays.toString(getConcatenation(arr)));
		System.out.println(Arrays.toString(getConcatenation(new int[] { 1, 3, 2, 1 })));

	}
}
