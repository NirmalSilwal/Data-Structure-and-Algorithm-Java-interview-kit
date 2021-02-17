package com.maharishiuniversity.admit.practiceTest.set1;

/*
 * An array is defined to be a Filter array if it meets the following conditions
   a. If it contains 9 then it also contains 11.
   b. If it contains 7 then it does not contain 13.
 */

public class FilterArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 9, 6, 11 };
		System.out.println(isFilter(arr)); // 1

		int[] arr2 = { 1, 2, 3, 4, 10, 11, 13 };
		System.out.println(isFilter(arr2)); // 1

		int[] arr3 = { 3, 4, 6, 7, 14, 16 };
		System.out.println(isFilter(arr3)); // 1

		int[] arr4 = { 9, 6, 18 };
		System.out.println(isFilter(arr4)); // 0

		int[] arr5 = { 4, 7, 13 };
		System.out.println(isFilter(arr5)); // 0
		
		int[] arr6 = {3, 6, 5, 5, 13, 6, 13};
		System.out.println(isFilter(arr6)); // 1
	}

	static int isFilter(int[] arr) {
		boolean has9 = false;
		boolean has11 = false;

		boolean has7 = false;
		boolean has13 = false;
		
		boolean testcase = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 9)
				has9 = true;
			if (arr[i] == 11)
				has11 = true;

			if (arr[i] == 7)
				has7 = true;
			if (arr[i] == 13)
				has13 = true;
		}

		if (has9 == true) {
			if (has11 == true)
				testcase = true;
			else
				return 0;
		}

		if (has7 == true) {
			if (has13 == false)
				testcase = true;
			else
				return 0;
		}

		return 1;
	}

}
