package gfg.Arrays;

import java.util.Arrays;

public class LeftRotateByNPosition {

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
	
	public static void rotateLeft(int[] arr, int d) {
		
	}
	

	// O(nd) Time, O(1) Space
	public static void rotateLeft2(int[] arr, int d) {
		int n = arr.length;
		if (d > n) {
			d = d - n;
		}
		if (d == n) {
			return;
		}
		for (int rotation = 0; rotation < d; rotation++) {
			int temp = arr[0];
			for (int i = 1; i < n; i++) {
				arr[i - 1] = arr[i];
			}
			arr[n - 1] = temp;
		}
	}

	// O(n+d) = O(d) Time, O(n) space, where d is length of array, n is number of rotation
	public static void rotateLeft3(int[] arr, int n) {
		if (n == arr.length) {
			return;
		}
		int[] temp = new int[n];
		for (int j = 0; j < n; j++) {
			temp[j] = arr[j];
		}

		/*
		int forward = 0;
		for (int i = 0; i < arr.length - n; i++) {
			if (i + n < arr.length) {
				forward = i + n;
			}
			if (forward >= arr.length) {
				forward = arr.length - 1;
			}
			swap(arr, i, forward);
		} */ 
		
		// use below code block for above commented part - both have same result
		for (int i = n; i < arr.length; i++) {
			arr[i - n] = arr[i];
		}
		// till here
		
		for (int k = arr.length - n, i = 0; k < arr.length; k++, i++) {
			arr[k] = temp[i];
		}
	}

	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	} 
}
