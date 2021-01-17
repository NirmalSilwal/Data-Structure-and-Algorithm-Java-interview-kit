package com.maharishiuniversity.admit.practiceTest.frequentQn;

public class BalancedArray {

	public static void main(String[] args) {
		int[] arr = { -2, 3, 2, -3 };
		System.out.println(isBalanced(arr)); // 1

		int[] arr2 = { -2, 2, 2, 2 };
		System.out.println(isBalanced(arr2)); // 1

		int[] arr3 = { -5, 2, -2 };
		System.out.println(isBalanced(arr3)); // 0
	}

	/*
	 * can be optimized using hashing -> store array in hash table and look up
	 * for its negative of number in constant time
	 */

	// O(N^2) Time | O(1) Space
	static int isBalanced(int[] arr) {
		if (arr.length < 2)
			return 0;
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			int expectedItem = -arr[i];

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == expectedItem) {
					result = 1;
					break;
				}
			}
			if (result == 0)
				return 0;
		}
		return result;
	}
}
