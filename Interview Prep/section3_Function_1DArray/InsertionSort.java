package section3_Function_1DArray;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 88, 66, 55, 44, 22 };

		insertionSort(arr);

		System.out.println(Arrays.toString(arr));
	}

	static void insertionSort(int[] arr) {

		for (int pass = 0; pass < arr.length - 1; pass++) {

			for (int j = pass + 1; j > 0 && arr[j] < arr[j - 1]; j--) {

				swap(arr, j, j - 1);
			}
		}
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
