package section3_Function_1DArray;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 88, 66, 55, 44, 22 };

		selectionSort(arr);

		System.out.println(Arrays.toString(arr));
	}

	static void selectionSort(int[] arr) {

		for (int pass = 0; pass < arr.length - 1; pass++) {
			
			int min_index = pass;

			for (int j = pass + 1; j < arr.length; j++) {

				if (arr[j] < arr[min_index])
					min_index = j;
			}
			swap(arr, pass, min_index);
		}
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
