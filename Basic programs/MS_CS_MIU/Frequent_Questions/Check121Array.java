package com.maharishiuniversity.admit.practiceTest.frequentQn;

public class Check121Array {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 2, 1, 1 };
		System.out.println(is121Array(arr)); // 1

		int[] arr2 = { 1, 2, 1 };
		System.out.println(is121Array(arr2)); // 1

		int[] arr3 = { 1, 1, 2, 2, 2, 1, 1, 1 };
		System.out.println(is121Array(arr3)); // 0

		int[] arr4 = { 1, 1, 1, 1, 1, 1 };
		System.out.println(is121Array(arr4)); // 0

		int[] arr5 = { 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1 };
		System.out.println(is121Array(arr5)); // 0

		int[] arr6 = { 1, 1, 1, 2, 2, 2, 1, 1, 1, 3 };
		System.out.println(is121Array(arr6)); // 0
	}

	// O(N) Time | O(1) Space
	static int is121Array(int[] arr) {
		if (arr.length < 3)
			return 0;
		if (arr[0] != 1)
			return 0;

		int count1s = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1)
				count1s++;
			else
				break;
		}

		if (count1s == arr.length)
			return 0;

		for (int i = count1s; i < arr.length - count1s; i++) {
			if (arr[i] != 2)
				return 0;
		}

		for (int i = arr.length - 1; i > arr.length - 1 - count1s; i--) {
			if (arr[i] != 1)
				return 0;
		}
		return 1;
	}
}
