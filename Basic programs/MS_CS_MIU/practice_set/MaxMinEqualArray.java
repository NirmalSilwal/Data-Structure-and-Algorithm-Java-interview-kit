package com.maharishiuniversity.admit.practiceTest.set1;

public class MaxMinEqualArray {

	public static void main(String[] args) {
		int[] arr = { 11, 4, 9, 11, 8, 5, 4, 10 };
		System.out.println(isMaxMinEqual(arr)); // 1

		int[] arr1 = { 1, 1, 1, 1, 1, 1 };
		System.out.println(isMaxMinEqual(arr1)); // 0

		int[] arr2 = {};
		System.out.println(isMaxMinEqual(arr2)); // 0

		int[] arr3 = { -2, -4, -6, -8, -11 };
		System.out.println(isMaxMinEqual(arr3)); // 1

		int[] arr4 = { 2, 4, 6, 8, 11 };
		System.out.println(isMaxMinEqual(arr4)); // 1

		int[] arr5 = { 2 };
		System.out.println(isMaxMinEqual(arr5)); // 0
	}

	// O(N) Time | O(1) Space
	static int isMaxMinEqual(int[] arr) {
		if (arr.length < 2)
			return 0;

		int maxValue = arr[0];
		int minValue = arr[1];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}

			if (arr[i] < minValue) {
				minValue = arr[i];
			}
		}

		if (maxValue == minValue)
			return 0;

		int maxCount = 0;
		int minCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == maxValue)
				maxCount++;

			if (arr[i] == minValue)
				minCount++;
		}

		return maxCount == minCount ? 1 : 0;
	}

}
