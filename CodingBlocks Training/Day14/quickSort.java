package Lecture14;

public class quickSort {

	public static void main(String[] args) {

		int[] arr = { 7, 2, 1, 6, 8, 5, 3, 4 };

		int start = 0, end = arr.length - 1;
		quickSorting(arr, start, end);
		display(arr);
	}

	public static void quickSorting(int[] arr, int startIndex, int endIndex) {
		if (startIndex >= endIndex) {
			return;
		}
		int pindex = partition(arr, startIndex, endIndex);
		quickSorting(arr, startIndex, pindex - 1);
		quickSorting(arr, pindex + 1, endIndex);
	}

	public static int partition(int[] arr, int si, int ei) {
		int pivot = arr[ei];
		int pindex = si;

		for (int index = si; index <= ei - 1; index++) {
			if (arr[index] <= pivot) {
				swap(arr, index, pindex);
				pindex++;
			}
		}
		swap(arr, pindex, ei);
		return pindex;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void display(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
		System.out.println();
	}
}
