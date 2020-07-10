package Lecture6;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 3, 9, 1, 6, 8};
		display(arr);
		selectionSort(arr);
		System.out.println("\n");
		display(arr);
	}

	public static void selectionSort(int[] arr) {
		for (int pass = 0; pass < arr.length - 1; pass++) {
			int min_index = pass;
			for (int cursor = pass + 1; cursor < arr.length; cursor++) {
				if (arr[cursor] < arr[min_index]) {
					min_index = cursor;
				}
			}
			swap(arr, min_index, pass);
			// display(arr);
			// System.out.println("\n");
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
