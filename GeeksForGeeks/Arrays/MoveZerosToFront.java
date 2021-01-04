package gfg.Arrays;

import java.util.Arrays;

public class MoveZerosToFront {

	public static void main(String[] args) {
		int[] arr = { 8, 5, 0, 10, 0, 20 };

		System.out.println("original array: " + Arrays.toString(arr));

		moveZerosToLeft(arr);

		System.out.println("\nafter moving zeros to front: " + Arrays.toString(arr));
	}

	// O(n) time | O(1) space
	public static void moveZerosToLeft(int[] arr) {
		int tracker = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				swap(arr, i, tracker);
				tracker--;
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
 * after moving zeros to front: [0, 0, 8, 5, 10, 20]
 */