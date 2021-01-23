package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * Mode is the most frequently appearing value. Write a function
 * named hasSingleMode that takes an array argument and returns 1 if the mode value in its
 * array argument occurs exactly once in the array, otherwise it returns 0.
 */

public class SingleMode {

	public static void main(String[] args) {
		int[] arr = { 1, -29, 8, 5, -29, 6 };
		System.out.println(hasSingleMode(arr));

		int[] arr2 = { 1, 2, 3, 4, 2, 4, 7 };
		System.out.println(hasSingleMode(arr2));

		int[] arr3 = { 1, 2, 3, 4, 6 };
		System.out.println(hasSingleMode(arr3));

		int[] arr4 = { 7, 1, 2, 1, 7, 4, 2, 7 };
		System.out.println(hasSingleMode(arr4));

	}

	static int hasSingleMode(int[] arr) {
		int[] allModesValues = new int[arr.length];

		int maxCount = 0;
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			int currCount = 0;

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					currCount++;
			}
			if (currCount > maxCount) {
				maxCount = currCount;
				allModesValues[0] = arr[i];
				index++;
			} else if (currCount == maxCount) {
				allModesValues[index] = arr[i];
				index++;
			}
		}

		int uniqueCount = findUniqueCount(allModesValues);

		return uniqueCount - 1 == 1 ? 1 : 0;

	}

	private static int findUniqueCount(int[] arr) {
		int res = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (arr[i] == arr[j])
					break;
			}
			if (i == j)
				res++;
		}
		return res;
	}
}
