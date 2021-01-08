package gfg.Arrays;

import java.util.Arrays;

public class LeftRotationOptimalGeneral {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println("original array: " + Arrays.toString(arr));

		rotateLeft(arr, 2);
		System.out.println("rotated array: " + Arrays.toString(arr));

		int[] arr2 = { 10, 5, 30, 15 };
		System.out.println("original array: " + Arrays.toString(arr2));

		rotateLeft(arr2, 3);
		System.out.println("rotated array: " + Arrays.toString(arr2));
	}

	// 0(n) Time, O(1) Space
	public static void rotateLeft(int[] arr, int d) {
		int n = arr.length;
		reverseArray(arr, 0, d - 1);
		reverseArray(arr, d, n - 1);
		reverseArray(arr, 0, n - 1);
	}

	public static void reverseArray(int[] arr, int low, int high) {
		while (low < high) {
			swap(arr, low, high);
			low++;
			high--;
		}
	}

	public static void swap(int[] arr, int low, int high) {
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}
}

/* output:
original array: [1, 2, 3, 4, 5, 6]
rotated array: [3, 4, 5, 6, 1, 2]
original array: [10, 5, 30, 15]
rotated array: [15, 10, 5, 30]
*/