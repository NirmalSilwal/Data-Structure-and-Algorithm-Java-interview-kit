package com.maharishiuniversity.admit;

/* Question:
 * Write a function that accepts an array of non-negative integers and returns the second largest 
 * integer in the array. Return -1 if there is no second largest.
 * The signature of the function is
 * int f(int[ ] a)
 */

public class SecondLargestElement {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 1 };
		int[] arr3 = { 4, 1, 2, 3 };
		int[] arr4 = { 1, 1, 2, 2 };
		int[] arr6 = { 1 };
		int[] arr7 = {};

		SecondLargestElement obj = new SecondLargestElement();

		System.out.println(obj.f(arr));
		System.out.println(obj.f(arr2));
		System.out.println(obj.f(arr3));
		System.out.println(obj.f(arr4));
		System.out.println(obj.f(arr6));
		System.out.println(obj.f(arr7));

	}

	int f(int[] a) {
		if (a.length <= 1) {
			return -1;
		}

		int first = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > first) {
				first = a[i];
			}
		}

		int second = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > second && a[i] < first) {
				second = a[i];
			}
		}
		if (second == Integer.MIN_VALUE) {
			return -1;
		} else {
			return second;
		}
	}
}
