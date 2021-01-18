package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * A Bean array is defined to be an array where for every value n in the array, 
 * there is also an element n-1 or n+1 in the array.
 */

public class BeanArray2 {

	public static void main(String[] args) {
		int[] arr = { 2, 10, 9, 3 };
		System.out.println(isBean(arr)); // 1

		int[] arr2 = { 2, 2, 3, 3, 3 };
		System.out.println(isBean(arr2)); // 1

		int[] arr3 = { 1, 1, 1, 2, 1, 1 };
		System.out.println(isBean(arr3)); // 1

		int[] arr4 = { 0, -1, 1 };
		System.out.println(isBean(arr4)); // 1

		int[] arr5 = { 3, 4, 5, 7 };
		System.out.println(isBean(arr5)); // 0
	}

	// O(N^2) Time | O(1) Space
	static int isBean(int[] arr) {
		if (arr.length < 2)
			return 0;
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			int less = arr[i] - 1;
			int more = arr[i] + 1;

			result = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == less || arr[j] == more) {
					result = 1;
					break;
				}
			}
			if (result == 0)
				return 0;
		}
		return result;
	}

}
