package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * An isSym (even/odd Symmetric) array is defined to be an array in which even numbers
 * and odd numbers appear in the same order from “both directions”. You can assume array
 * has at least one element.
 */
public class SymmetricArray {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 9, 10, 11, 5, 8 };
		System.out.println(isSym(arr)); // 1

		int[] arr2 = { 9, 8, 7, 13, 14, 17 };
		System.out.println(isSym(arr2)); // 1

		int[] arr3 = { 2, 7, 8, 9, 11, 13, 10 };
		System.out.println(isSym(arr3)); // 0
	}

	// O(N) Time | O(1) Space
	static int isSym(int[] arr) {
		if (arr.length < 1)
			return 0;

		int last = arr.length - 1;
		int first = 0;

		while (first < last) {
			if (((arr[first] % 2 == 0) && (arr[last] % 2 == 0)) || ((arr[first] % 2 != 0) && (arr[last] % 2 != 0))) {

				first++;
				last--;
			} else
				return 0;
		}
		return 1;
	}
}
