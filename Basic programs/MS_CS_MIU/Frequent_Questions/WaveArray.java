package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * A wave array is defined to an array which does not contain two even numbers or two odd
 *  numbers in adjacent locations.
 */

public class WaveArray {

	public static void main(String[] args) {
		int[] arr = { 7, 2, 9, 10, 5 };
		System.out.println(isWave(arr)); // 1

		int[] arr2 = { 4, 11, 12, 1, 6 };
		System.out.println(isWave(arr2)); // 1

		int[] arr3 = { 1, 0, 5 };
		System.out.println(isWave(arr3)); // 1

		int[] arr4 = { 2 };
		System.out.println(isWave(arr4)); // 1

		int[] arr5 = { 2, 6, 3, 4 };
		System.out.println(isWave(arr5)); // 0

		int[] arr6 = { 3, 4, 9, 11, 8 };
		System.out.println(isWave(arr6)); // 0
	}

	// O(N) Time | O(1) Space
	static int isWave(int[] arr) {
		if (arr.length < 1)
			return 0;
		if (arr.length == 1)
			return 1;

		int wave = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (((arr[i] % 2 == 0) && (arr[i + 1] % 2 != 0)) || ((arr[i] % 2 != 0) && (arr[i + 1] % 2 == 0))) {
				wave = 1;
			} else {
				return 0;
			}
		}
		return wave;
	}
}
