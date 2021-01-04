package gfg.Arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = { 10, 5, 7, 30, 20 };
		System.out.println("original array: " + Arrays.toString(arr));

		reverse(arr);

		System.out.println("reversed array: " + Arrays.toString(arr));
	}

	// O(n) time | O(1) space
	public static void reverse(int[] arr) {
		int front = 0;
		int back = arr.length - 1;

		for (int i = 0; i < arr.length / 2; i++) {
			swap(arr, front, back);
			front++;
			back--;
		}
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}


/* output:
original array: [10, 5, 7, 30, 20]
reversed array: [20, 30, 7, 5, 10]
*/