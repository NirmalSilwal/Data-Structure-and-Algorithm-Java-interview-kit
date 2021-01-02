package com.maharishiuniversity.admit;

/* Question:
 * Write a function that takes an array of integers as an argument and returns a value based on the 
 * sums of the even and odd numbers in the array. Let X = the sum of the odd numbers in the array 
 * and let Y = the sum of the even numbers. The function should return X - Y
 */

public class OddEvenSumDifference {

	public static void main(String[] args) {

		int[] arr = { 1 };
		int[] arr1 = { 1, 2 };
		int[] arr2 = { 1, 2, 3 };
		int[] arr3 = { 1, 2, 3, 4 };
		int[] arr4 = { 3, 3, 4, 4 };
		int[] arr5 = { 3, 2, 3, 4 };
		int[] arr6 = { 1, 1 };
		int[] arr7 = {};

		System.out.println(oddEvenDiff(arr));
		System.out.println(oddEvenDiff(arr1));
		System.out.println(oddEvenDiff(arr2));
		System.out.println(oddEvenDiff(arr3));
		System.out.println(oddEvenDiff(arr4));
		System.out.println(oddEvenDiff(arr5));
		System.out.println(oddEvenDiff(arr6));
		System.out.println(oddEvenDiff(arr7));

	}

	public static int oddEvenDiff(int[] arr) {
		if (arr.length < 1) {
			return 0;
		}
		int oddSum = 0, evenSum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenSum += arr[i];
			} else {
				oddSum += arr[i];
			}
		}

		return oddSum - evenSum;
	}
}

/*output: 
1
-1
2
-2
-2
0
2
0
 */