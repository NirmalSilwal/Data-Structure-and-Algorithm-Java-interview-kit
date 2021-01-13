package com.maharishiuniversity.admit.practiceTest.set1;

public class LargestDifferenceOfEvens2 {

	public static void main(String[] args) {
		int[] arr = { -2, 3, 4, 9 };
		System.out.println(largestDifferenceOfEvens2(arr)); // 6

		int[] arr2 = { 1, 18, 5, 7, 33 };
		System.out.println(largestDifferenceOfEvens2(arr2)); // -1

		int[] arr3 = { 2, 2, 2, 2 };
		System.out.println(largestDifferenceOfEvens2(arr3)); // 0

		int[] arr4 = { 1, 2, 1, 2, 1, 4, 1, 6, 4 };
		System.out.println(largestDifferenceOfEvens2(arr4)); // 4
	}

	// O(N) Time | O(1) Space
	static int largestDifferenceOfEvens2(int[] arr) {
		if (arr.length < 2)
			return -1;

		int firstMax = 0;
		int lastMax = 0;
		int evenCount = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				if (evenCount == 0) {
					firstMax = arr[i];
					lastMax = arr[i];
				}
				evenCount++;

				if (arr[i] > firstMax)
					firstMax = arr[i];
				if (arr[i] < lastMax)
					lastMax = arr[i];
			}
		}
		if (evenCount < 2)
			return -1;

		return firstMax - lastMax;
	}
}
