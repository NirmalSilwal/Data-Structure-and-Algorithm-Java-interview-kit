package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * write function which outputs true if the sum of the elements in the 
 * input array arr is a power of 2, false otherwise. 
 */

public class SumIsPower {

	public static void main(String[] args) {
		int[] arr = { 8, 8, 8, 8 };
		System.out.println(sumIsPower2(arr)); // true

		int[] arr2 = { 8, 8, 8 };
		System.out.println(sumIsPower2(arr2)); // false
	}

	// O(N) Time | O(1) Space
	static boolean sumIsPower(int[] arr) {
		if (arr == null || arr.length < 1)
			return false;

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		while (sum > 1) {
			if (sum % 2 == 0)
				sum = sum / 2;
			else
				return false;
		}
		return true;
	}

	// second approach - // O(N) Time | O(1) Space
	static boolean sumIsPower2(int[] arr) {
		if (arr == null || arr.length < 1)
			return false;

		int sum = 0;
		int power = 2;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			power *= 2;
		}

		if (sum == power)
			return true;
		else
			return false;
	}

}
