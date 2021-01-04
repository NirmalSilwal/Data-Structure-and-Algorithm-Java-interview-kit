package gfg.Arrays;

import java.util.Arrays;

public class LeftRotateArray1Pos {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("original array: " + Arrays.toString(arr));

		rotateLeft(arr);

		System.out.println("rotated array: " + Arrays.toString(arr));

		int[] arr2 = { 5, 10, 20 };
		System.out.println("original array: " + Arrays.toString(arr2));

		rotateLeft2(arr2);

		System.out.println("rotated array: " + Arrays.toString(arr2));
	}

	// O(n) time | O(1) space
	public static void rotateLeft(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			swap(arr, i, i + 1);
		}
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	// without using swap - O(n) time | O(1) space
	public static void rotateLeft2(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;
	}
}

/* output:
original array: [1, 2, 3, 4, 5]
rotated array: [2, 3, 4, 5, 1]
original array: [5, 10, 20]
rotated array: [10, 20, 5]
 */