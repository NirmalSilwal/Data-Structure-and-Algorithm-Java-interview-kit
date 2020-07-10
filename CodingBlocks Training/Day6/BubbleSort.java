package Lecture6;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 50, 40, 30, 20, 10 };
		display(arr);
		bubbleSort(arr);
		System.out.println("\n");
		display(arr);
	}

	public static void bubbleSort(int[] arr) {
		for (int pass = 1; pass <= arr.length; pass++) {
			for (int j = 0; j < arr.length - pass; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
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
