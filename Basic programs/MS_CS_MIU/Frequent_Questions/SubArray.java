package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * An Sub array is defined to be an array in which each element is greater than sum of all
 * elements after that.
 */

public class SubArray {

	public static void main(String[] args) {
		int[] arr = { 13, 6, 3, 2 };
		System.out.println(isSub2(arr)); // 1

		int[] arr2 = { 11, 5, 3, 2 };
		System.out.println(isSub2(arr2)); // 0
	}

	// O(N^2) Time | O(1) Space
	static int isSub(int[] arr) {
		if (arr.length < 1)
			return 0;
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			int currSum = 0;

			for (int j = i + 1; j < arr.length; j++) {
				currSum += arr[j];
			}

			if (arr[i] > currSum) {
				result = 1;
			} else {
				return 0;
			}
		}

		return result;
	}

	// O(N) Time | O(1) Space
	static int isSub2(int[] arr) {
		if (arr.length < 1)
			return 0;
		int sum = 0;

		for (int i = arr.length - 1; i > 0; i--) {
			sum += arr[i];
			if (sum >= arr[i - 1])
				return 0;
		}

		return 1;
	}
}
