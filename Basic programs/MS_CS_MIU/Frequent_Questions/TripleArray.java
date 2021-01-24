package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * Define a Triple array to be an array where every value occurs exactly three times. 
 */

public class TripleArray {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 1, 3, 1, 3, 2, 2 };
		System.out.println(isTriple(arr)); // 1

		int[] arr2 = { 2, 5, 2, 5, 5, 2, 5 };
		System.out.println(isTriple(arr2)); // 0

		int[] arr3 = { 3, 1, 1, 1 };
		System.out.println(isTriple(arr3)); // 0

	}

	// O(N^2) Time | O(1) Space
	static int isTriple(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int currCount = 0;

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					currCount++;
			}

			if (currCount != 3)
				return 0;
		}

		return 1;
	}
}
