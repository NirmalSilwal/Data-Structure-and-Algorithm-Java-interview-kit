package com.maharishiuniversity.admit.practiceTest.set1;

/*
 * A Meera array is defined to be an array such that for all values n in the array, the value 2*n is not in the array.
 */
public class MeeraArray2 {

	public static void main(String[] args) {
		int[] arr = { 3, 5, -2 };
		System.out.println(isMeera2(arr)); // 1

		int[] arr2 = { 8, 3, 4 };
		System.out.println(isMeera2(arr2)); // 0
	}

	// O(N^2) Time | O(1) Space
	static int isMeera2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int currentItem = 2 * arr[i];

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == currentItem) {
					return 0;
				}
			}
		}

		return 1;
	}
}
