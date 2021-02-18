package com.maharishiuniversity.admit.practiceTest.set1;

/*
 * A non-empty array a of length n is called an array of all possibilities 
 * if it contains all numbers between 0 and arr.length-1 inclusive.
 */

public class AllPossibilitiesArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 3 };
		System.out.println(isAllPossibilities(arr)); // 1

		int[] arr2 = { 3, 2, 1, 0 };
		System.out.println(isAllPossibilities(arr2)); // 1

		int[] arr3 = { 1, 2, 4, 3 };
		System.out.println(isAllPossibilities(arr3)); // 0

		int[] arr4 = { 0, 2, 3 };
		System.out.println(isAllPossibilities(arr4)); // 0

	}

	static int isAllPossibilities(int[] arr) {
		if (arr.length < 1)
			return 0;

		int n = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] >= 0 && arr[i] <= n) {
				
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j])
						return 0;
				}

			} else
				return 0;
		}

		return 1;
	}
	
	// approach 2
	// O(N^2) Time | O(1) Space
	static int isAllPossibilities2(int[] arr) {
		if (arr.length < 1)
			return 0;

		int n = arr.length - 1;
		int result;
		for (int element = 0; element <= n; element++) {
			result = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == element) {
					result = 1;
					break;
				}
			}
			if (result == 0)
				return result;
		}

		return 1;
	}

}
