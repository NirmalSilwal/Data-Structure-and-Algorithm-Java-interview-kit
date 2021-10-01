package leetcodeTags.array;

import java.util.Arrays;

/*
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */

public class RunningSumOf1DArray1480 {

	public static int[] runningSum(int[] nums) {
		int[] runningSum = new int[nums.length];

		int currentsum = nums[0];
		runningSum[0] = nums[0];

		for (int i = 1; i < nums.length; i++) {
			currentsum += nums[i];
			runningSum[i] = currentsum;
		}

		return runningSum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(runningSum(arr)));
	}
}
