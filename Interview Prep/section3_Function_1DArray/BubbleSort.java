package section3_Function_1DArray;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 88, 66, 55, 44, 22 };

		bubbleSort(arr);

		System.out.println(Arrays.toString(arr));
	}

	static void bubbleSort(int[] arr) {

		for (int pass = 1; pass <= arr.length; pass++) {
			for (int j = 0; j < arr.length - pass; j++) {
				if (arr[j] > arr[j + 1])
					swap(arr, j, j + 1);
			}
		}
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
