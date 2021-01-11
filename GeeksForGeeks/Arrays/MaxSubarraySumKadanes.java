package gfg.Arrays;

public class MaxSubarraySumKadanes {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 5, -2, -4, 6 };
		System.out.println("max sum is: " + kadanesAlgo(arr)); // 9

		int[] arr2 = { -6, -1, -8 };
		System.out.println("max sum is: " + kadanesAlgo(arr2)); // -1

		int[] arr3 = { 1, 2, 3 };
		System.out.println("max sum is: " + kadanesAlgo(arr3)); // 6
	}

	// O(n) Time | O(1) Space
	public static int kadanesAlgo(int[] arr) {
		int result = Integer.MIN_VALUE;
		int currSum = 0;

		for (int i = 0; i < arr.length; i++) {
			currSum += arr[i];

			if (currSum > result) {
				result = currSum;
			}
			if (currSum < 0) {
				currSum = 0;
			}
		}
		return result;
	}

}
