package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * An array a is called paired if its even numbered elements (a[0], a[2], etc.)
 * are odd and its odd numbered elements (a[1], a[3], etc.) are even.
 */

public class PairedArray {

	public static void main(String[] args) {
		int[] arr = { 7, 2, 3, 6, 7 };
		System.out.println(isPaired(arr)); // 1

		int[] arr2 = { 7, 15, 9, 2, 3 };
		System.out.println(isPaired(arr2)); // 0

		int[] arr3 = { 17, 6, 2, 4 };
		System.out.println(isPaired(arr3)); // 0
	}

	// O(N) Time | O(1) Space
	static int isPaired(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (((i % 2 != 0) && (arr[i] % 2 != 0)) || ((i % 2 == 0) && (arr[i] % 2 == 0)))
				return 0;
		}

		return 1;
	}
}
