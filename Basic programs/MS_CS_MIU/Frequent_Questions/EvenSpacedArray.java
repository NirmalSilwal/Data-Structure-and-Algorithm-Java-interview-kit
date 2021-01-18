package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * An integer array is said to be evenSpaced, if the difference between the largest value
 * and the smallest value is an even number.
 */
public class EvenSpacedArray {

	public static void main(String[] args) {
		int[] arr = { 100, 19, 131, 140 };
		System.out.println(isEvenSpaced(arr)); // 0

		int[] arr2 = { 200, 1, 151, 160 };
		System.out.println(isEvenSpaced(arr2)); // 0

		int[] arr3 = { 200, 10, 151, 160 };
		System.out.println(isEvenSpaced(arr3)); // 1

		int[] arr4 = { 100, 19, -131, -140 };
		System.out.println(isEvenSpaced(arr4)); // 1

		int[] arr5 = { 80, -56, 11, -81 };
		System.out.println(isEvenSpaced(arr5)); // 0
	}

	// O(N) Time | O(1) Space
	static int isEvenSpaced(int[] arr) {
		if (arr.length < 2)
			return 0;

		int largest = arr[0];
		int smallest = arr[1];

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];
			if (arr[i] < smallest)
				smallest = arr[i];
		}

		return (largest - smallest) % 2 == 0 ? 1 : 0;
	}
}
