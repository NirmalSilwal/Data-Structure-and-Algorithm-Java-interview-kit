package gfg.Arrays;

import java.util.Arrays;

public class MoveZerosToEnd2 {

	public static void main(String[] args) {

		int[] arr = { 8, 5, 0, 10, 0, 20 };

		System.out.println("original array: " + Arrays.toString(arr));

		moveZerosToRight(arr);

		System.out.println("\nafter moving zeros to end: " + Arrays.toString(arr));
	}

	// O(n) time
	public static void moveZerosToRight(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				swap(arr, i, count);
				count++;
			}
		}
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}

/*
 * output: original array: [8, 5, 0, 10, 0, 20]
 * 
 * after moving zeros to end: [8, 5, 10, 20, 0, 0]
 */