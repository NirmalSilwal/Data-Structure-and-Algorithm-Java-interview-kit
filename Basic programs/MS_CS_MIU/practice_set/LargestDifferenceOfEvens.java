package com.maharishiuniversity.admit.practiceTest.set1;

public class LargestDifferenceOfEvens {

	public static void main(String[] args) {
		int[] arr = { -2, 3, 4, 9 };
		System.out.println(largestDifferenceOfEvens(arr)); // 6

		int[] arr2 = { 1, 18, 5, 7, 33 };
		System.out.println(largestDifferenceOfEvens(arr2)); // -1

		int[] arr3 = { 2, 2, 2, 2 };
		System.out.println(largestDifferenceOfEvens(arr3)); // 0

		int[] arr4 = { 1, 2, 1, 2, 1, 4, 1, 6, 4 };
		System.out.println(largestDifferenceOfEvens(arr4)); // 4
	}

	static int largestDifferenceOfEvens(int[] arr) {
		if (arr.length < 2)
			return -1;
		int difference = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {

				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] % 2 == 0) {
						difference = Math.max(difference, (arr[i] - arr[j]));
					}
				}

				for (int j = 0; j < i; j++) {
					if (arr[j] % 2 == 0) {
						difference = Math.max(difference, (arr[i] - arr[j]));
					}
				}
			}
		}
		if (difference == Integer.MIN_VALUE)
			return -1;

		return difference;
	}
}
