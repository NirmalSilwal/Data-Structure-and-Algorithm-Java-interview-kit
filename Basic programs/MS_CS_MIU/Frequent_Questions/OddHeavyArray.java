package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * An array is defined to be odd-heavy if it contains at least one odd element and
 * every odd element is greater than every even element.
 */
public class OddHeavyArray {

	public static void main(String[] args) {
		int[] arr = { 11, 4, 9, 2, 8 };
		System.out.println(isOddHeavy(arr)); // 1

		int[] arr2 = { 11, 4, 9, 2, 3, 10 };
		System.out.println(isOddHeavy(arr2)); // 0

		int[] arr3 = { 1, 1, 1, 1 };
		System.out.println(isOddHeavy(arr3)); // 1

		int[] arr4 = { -2, -4, -6, -8, -11 };
		System.out.println(isOddHeavy(arr4)); // 0

		int[] arr5 = { 1 };
		System.out.println(isOddHeavy(arr5)); // 1

		int[] arr6 = { 2 };
		System.out.println(isOddHeavy(arr6)); // 0

		int[] arr7 = { 2, 4, 6, 8, 11 };
		System.out.println(isOddHeavy(arr7)); // 1
	}

	// O(N^2) Time | O(1) Space
	static int isOddHeavy(int[] arr) {
		int oddCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddCount++;

				for (int j = 0; j < arr.length; j++) {
					if (arr[j] % 2 == 0) {
						if (arr[j] > arr[i])
							return 0;
					}
				}
			}
		}

		if (oddCount == 0)
			return 0;

		return 1;
	}
}
