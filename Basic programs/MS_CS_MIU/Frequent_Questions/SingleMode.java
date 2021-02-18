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

	
	// O(N^2) Time
	static int hasSingleMode(int[] arr) {

		int uniqueCount = findUniqueCount(arr);
		int[] uniqueItems = uniqueElements(arr, uniqueCount);
		int[] modeCounts = new int[uniqueCount];

		int index = 0;
		for (int i = 0; i < uniqueItems.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (uniqueItems[i] == arr[j])
					count++;
			}
			modeCounts[index] = count;
			index++;
		}

		int mode = modeCounts[0];
		for (int i = 1; i < modeCounts.length; i++) {
			if (modeCounts[i] > mode)
				mode = modeCounts[i];
		}

		int duplicateModes = 0;
		for (int i = 0; i < modeCounts.length; i++) {
			if (modeCounts[i] == mode)
				duplicateModes++;
		}

		return duplicateModes == 1 ? 1 : 0;
	}

	// O(N^2) Time
	private static int[] uniqueElements(int[] arr, int uniqueCount) {
		int[] ans = new int[uniqueCount];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (arr[i] == arr[j])
					break;
			}
			if (i == j) {
				ans[index] = arr[i];
				index++;
			}
		}
		return ans;
	}

	// O(N^2) Time
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
