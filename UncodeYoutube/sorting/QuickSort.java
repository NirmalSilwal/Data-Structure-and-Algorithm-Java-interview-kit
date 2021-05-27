package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private static void quickSort(int[] arr, int start, int end) {
		if (start >= end)
			return;
		int pivotIndex = partition(arr, start, end);
		quickSort(arr, start, pivotIndex - 1);
		quickSort(arr, pivotIndex + 1, end);
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int pivotIndex = start;
		for (int i = start; i < end; i++) {
			if (arr[i] < pivot) {
				swap(arr, pivotIndex, i);
				pivotIndex++;
			}
		}
		swap(arr, pivotIndex, end);
		return pivotIndex;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, -13, 2, 0, -1, 32, 6984, 8, -1, 3 };
		quickSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
