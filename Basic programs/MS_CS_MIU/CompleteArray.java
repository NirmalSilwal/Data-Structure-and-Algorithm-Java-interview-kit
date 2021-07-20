package com.maharishiuniversity.admit;

/*
 3. An array is defined to be complete if the conditions (a), (d) and (e) below hold.
 a. The array contains even numbers
 b. Let min be the smallest even number in the array.
 c. Let max be the largest even number in the array.
 d. min does not equal max
 e. All numbers between min and max are in the array
 */

public class CompleteArray {

	static int isComplete(int[] a) {

		boolean hasEven = false;
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

		for (int num : a) {

			if (num % 2 == 0) {
				if (hasEven == false) {
					hasEven = true;
				}
				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}
			}
		}

		if (hasEven == false)
			return 0; // non-complete array

		if (min == max) {
			return 0; // non-complete array
		} else {
			// checking condition (e)
			// checking all numbers between max and min in given array
			for (int val = min + 1; val <= max; val++) {

				boolean exists = false;

				// see if val is in array
				for (int i = 0; i < a.length; i++) {

					if (val == a[i]) {
						exists = true;
						break;
					}
				}

				if (exists == false)
					return 0;
			}
		}
		return 1; // complete-array
	}

	public static void main(String[] args) {
		int[] arr = { -5, 6, 2, 3, 2, 4, 5, 11, 8, 7 };
		int[] arr2 = { 5, 7, 9, 13 };

		System.out.println(isComplete(arr));
		System.out.println(isComplete(arr2));
	}
}
