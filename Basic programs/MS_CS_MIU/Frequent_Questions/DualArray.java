package com.maharishiuniversity.admit.practiceTest.frequentQn;

public class DualArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 3, 3, 2 };
		System.out.println(isDual(arr)); // 1

		int[] arr2 = { 2, 5, 2, 5, 5 };
		System.out.println(isDual(arr2)); // 0

		int[] arr3 = { 3, 1, 1, 2, 2 };
		System.out.println(isDual(arr3)); // 0
	}

	// O(N^2) Time | O(1) Space
	// can be solved in O(N) using hashing
	static int isDual(int[] arr) {
		if (arr.length < 2)
			return 0;

		for (int i = 0; i < arr.length; i++) {
			int currCount = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					currCount++;
			}
			if (currCount != 2)
				return 0;
		}
		return 1;
	}

}
