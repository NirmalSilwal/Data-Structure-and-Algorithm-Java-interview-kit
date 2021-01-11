package gfg.Arrays;

public class MaxLenEvenOddSubarray {

	public static void main(String[] args) {

		// int[] arr = { 10, 12, 14, 7, 8 };
		int[] arr = { 1, 3, 5, 6, 7, 10, 12 };
		System.out.println(maxLenEvenOdd(arr)); // 4

		int[] arr2 = { 7, 10, 13, 14 };
		System.out.println(maxLenEvenOdd(arr2)); // 4

		int[] arr3 = { 10, 12, 8, 14, 15 };
		System.out.println(maxLenEvenOdd(arr3)); // 2

		int[] arr4 = { 10, 12, 8, 4 };
		System.out.println(maxLenEvenOdd(arr4)); // 1
	}

	// O(N^2) Time | O(1) Space
	public static int maxLenEvenOdd(int[] arr) {
		int result = 1;

		for (int i = 0; i < arr.length; i++) {
			int count = 1;

			for (int j = i + 1; j < arr.length; j++) {

				if (((arr[j - 1] % 2 == 0) && (arr[j] % 2 != 0)) 
						|| (arr[j - 1] % 2 != 0) && (arr[j] % 2 == 0)) {
					count++;
				} else
					break;
			}
			result = Math.max(result, count);
		}
		return result;
	}
}
