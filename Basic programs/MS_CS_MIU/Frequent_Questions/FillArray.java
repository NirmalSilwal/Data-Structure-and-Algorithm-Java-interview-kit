package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * It returns an integer array arr2 of length n whose first k elements
 * are the same as the first k elements of arr, and whose remaining elements consist of
 * repeating blocks of the first k elements.
 */

import java.util.Arrays;

public class FillArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 9, 12, -2, -1 };
		int[] filledArray = fill(arr, 3, 10);
		System.out.println(Arrays.toString(filledArray));

		int[] arr2 = { 4, 2, -3, 12 };
		int[] filledArray2 = fill(arr2, 1, 5);
		System.out.println(Arrays.toString(filledArray2));

		int[] arr3 = { 2, 6, 9, 0, -3 };
		int[] filledArray3 = fill(arr3, 0, 4);
		System.out.println(Arrays.toString(filledArray3));
	}

	// O(N) Time | O(N) Space
	static int[] fill(int[] arr, int k, int n) {
		int[] arr2 = null;
		if (arr.length < 1 || k < 1 || n < 1)
			return arr2;

		arr2 = new int[n];

		for (int i = 0; i < k; i++) {
			arr2[i] = arr[i];
		}

		int index = k;
		while (index < n) {
			int currentPosition = index % k;
			arr2[index] = arr[currentPosition];
			index++;
		}

		return arr2;
	}
}

/* output:
* [1, 2, 3, 1, 2, 3, 1, 2, 3, 1]
* [4, 4, 4, 4, 4]
* null
*/
