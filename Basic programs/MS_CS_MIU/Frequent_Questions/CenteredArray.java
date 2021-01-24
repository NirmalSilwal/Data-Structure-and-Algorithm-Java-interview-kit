package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * An array with an odd number of elements is said to be centered if all elements (except the middle
 * one) are strictly greater than the value of the middle element.
 */

public class CenteredArray {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 3, 4, 5 };
		System.out.println(isCentered(arr)); // 0

		int[] arr2 = { 3, 2, 1, 4, 5 };
		System.out.println(isCentered(arr2)); // 1

		int[] arr3 = { 3, 2, 1, 1, 4, 6 };
		System.out.println(isCentered(arr3)); // 0

		int[] arr4 = { 3, 2, 1, 4, 1 };
		System.out.println(isCentered(arr4)); // 0

		int[] arr5 = { 4 };
		System.out.println(isCentered(arr5)); // 1
	}

	// O(N) Time | O(1) Space
	static int isCentered(int[] arr) {
		if (arr.length % 2 == 0)
			return 0;

		int midElement = arr[arr.length / 2];
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length / 2) {
				if (arr[i] <= midElement)
					return 0;
			}
		}

		return 1;
	}
}
