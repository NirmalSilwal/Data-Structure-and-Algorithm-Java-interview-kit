package leetcodeTags.array;

import java.util.Arrays;

public class SquaresOfASortedArray977 {

	public static int[] sortedSquares(int[] nums) {

		int[] output = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			output[i] = nums[i] * nums[i];
		}
		Arrays.sort(output);

		return output;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortedSquares(new int[] { -4, -1, 0, 3, 10 })));
		System.out.println(Arrays.toString(sortedSquares(new int[] { -7, -3, 2, 3, 11 })));

	}
}
