package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * An array is defined to be complete if all its elements are greater than 0 and all even numbers 
 * that are less than the maximum even number are in the array.
 */
public class CompleteArray {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 2, 4, 11, 6, 10, 9, 8 };
		System.out.println(isComplete(arr)); // 1

		int[] arr2 = { 2, 3, 3, 6 };
		System.out.println(isComplete(arr2)); // 0

		int[] arr3 = { 2, -3, 4, 3, 6 };
		System.out.println(isComplete(arr3)); // 0
	}

	// O(N^2) Time | O(1) Space
	static int isComplete(int[] arr) {

		int maxEven = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				if (arr[i] % 2 == 0 && arr[i] > maxEven) {
					maxEven = arr[i];
				}
			} else
				return 0;
		}

		int startEven = 2;
		while (startEven < maxEven) {
			boolean found = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == startEven) {
					found = true;
					break;
				}
			}
			if (found == false)
				return 0;

			startEven += 2;
		}

		return 1;
	}
}
