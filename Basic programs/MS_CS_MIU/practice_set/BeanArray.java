package com.maharishiuniversity.admit.practiceTest.set1;

/*
 * A Bean array is defined to be an integer array where for every value n in the array, there is also an element 2n, 2n+1 or n/2 in the array.
 */
public class BeanArray {

	public static void main(String[] args) {
		int[] arr = { 4, 9, 8 };
		System.out.println(isBean(arr)); // 1

		int[] arr2 = { 3, 8, 4 };
		System.out.println(isBean(arr2)); // 0
	}

	// O(N^2) Time | O(1) Space
	static int isBean(int[] arr) {
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			int twice = 2 * arr[i];
			int twicePlus = twice + 1;
			int half = arr[i] / 2;

			result = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == twice || arr[j] == twicePlus || arr[j] == half) {
					result = 1;
					break;
				}
			}
			if (result == 0)
				return result;
		}

		return result;
	}

}
