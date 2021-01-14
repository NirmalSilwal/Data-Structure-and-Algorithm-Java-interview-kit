package com.maharishiuniversity.admit.practiceTest.set1;

public class MeeraArray {

	public static void main(String[] args) {
		int[] arr = { 4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6 };
		System.out.println(isMeera(arr)); // 1

		int[] arr2 = { 2, 4, 6, 8, 6 };
		System.out.println(isMeera(arr2)); // 0

		int[] arr3 = { 2, 8, 7, 10, -4, 6 };
		System.out.println(isMeera(arr3)); // 0

	}

	// O(N) Time | O(1) Space
	static int isMeera(int[] arr) {
		int result = 0;

		int totalEvenStart = 0;
		boolean isOdd = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				totalEvenStart++;
			} else {
				isOdd = true;
				break;
			}
		}

		if (isOdd == false)
			return 0;

		if (arr[arr.length - 1 - totalEvenStart] % 2 == 0) {
			return 0;
		}

		for (int i = arr.length - totalEvenStart; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				result = 1;
				continue;
			} else {
				result = 0;
				break;
			}
		}

		return result;
	}
}
