package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * A twinoid is defined to be an array that has exactly two even values that are adjacent to one
 * another.
 */
public class Twinoid {

	public static void main(String[] args) {
		int[] arr = { 3, 3, 2, 6, 7 };
		System.out.println(isTwinoid(arr)); // 1

		int[] arr2 = { 3, 3, 2, 6, 6, 7 };
		System.out.println(isTwinoid(arr2)); // 0

		int[] arr3 = { 3, 3, 2, 7, 6, 7 };
		System.out.println(isTwinoid(arr3)); // 0

		int[] arr4 = { 3, 8, 5, 7, 3 };
		System.out.println(isTwinoid(arr4)); // 0
	}

	// O(N) Time | O(1) Space
	static int isTwinoid(int[] arr) {
		int result = 0;
		int evenCount = 0;
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;

				if (found == false) {
					if (arr[i + 1] % 2 == 0) {
						found = true;
						result = 1;
					} else {
						return 0;
					}
				}

			}
		}
		if (evenCount != 2)
			result = 0;

		return result;
	}
}
