package com.maharishiuniversity.admit.practiceTest.set1;

/*
 * Write a function called goodSpread that returns 1 if no value in its array argument occurs more than 3 times in the array.
 */
public class GoodSpreadArray {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 2, 5, 2, 1, 5, 9 };
		System.out.println(goodSpread(arr)); // 1

		int[] arr2 = { 3, 1, 3, 1, 3, 5, 5, 3 };
		System.out.println(goodSpread(arr2)); // 0
	}

	static int goodSpread(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > 3) {
				result = 0;
				break;
			} else
				result = 1;
		}

		return result;
	}
}
