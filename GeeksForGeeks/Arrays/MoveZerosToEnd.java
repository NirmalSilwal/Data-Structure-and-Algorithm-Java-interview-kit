package gfg.Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {

		int[] arr = { 8, 5, 0, 10, 0, 20 };
		
		System.out.println("original array: " + Arrays.toString(arr));

		moveZerosToRight(arr);

		System.out.println("\nafter moving zeros to end: " + Arrays.toString(arr));
	}

	// O(n) time
	public static void moveZerosToRight(int[] arr) {
		if (arr.length < 1) {
			return;
		}
		int reader = 0;
		int writer = 0;

		while (reader < arr.length) {
			if (arr[reader] != 0) {
				arr[writer] = arr[reader];
				writer++;
			}
			reader++;
		}

		while (writer < arr.length) {
			arr[writer] = 0;
			writer++;
		}
	}
}
