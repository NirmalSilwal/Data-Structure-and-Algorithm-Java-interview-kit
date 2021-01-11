package gfg.Arrays;

public class MaxLenEvenOddSubarray2 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6, 7, 10, 12 };
		System.out.println(maxLenEvenOdd(arr)); // 4

		int[] arr2 = { 7, 10, 13, 14 };
		System.out.println(maxLenEvenOdd(arr2)); // 4

		int[] arr3 = { 10, 12, 8, 14, 15 };
		System.out.println(maxLenEvenOdd(arr3)); // 2

		int[] arr4 = { 10, 12, 8, 4 };
		System.out.println(maxLenEvenOdd(arr4)); // 1

		int[] arr5 = { 2, 3, 5, 6, 7, 9, 10, 11, 12 };
		System.out.println(maxLenEvenOdd(arr5)); // 4
	}

	// O(N) Time | O(1) Space
	// kadanes approach
	public static int maxLenEvenOdd(int[] arr) {
		int result = 1;
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (((arr[i - 1] % 2 == 0) && (arr[i] % 2 != 0)) || (arr[i - 1] % 2 != 0) && (arr[i] % 2 == 0)) {
				count++;
				result = Math.max(count, result);
			} else {
				count = 1;
			}
		}
		return result;
	}

}
