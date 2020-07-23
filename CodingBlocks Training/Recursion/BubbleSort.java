package Recursion;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 50, 40, 30, 20, 10 };

		display(arr);
		bubbleSort(arr, 0, arr.length - 1);
		System.out.println();
		display(arr);
	}

	public static void bubbleSort(int[] arr, int si, int li) {
		if (li == 0) {
			return;
		}

		if (si == li) {
			bubbleSort(arr, 0, li - 1);
			return;
		}

		if (arr[si] > arr[si + 1]) {
			swap(arr, si, si + 1);
		}
		bubbleSort(arr, si + 1, li);
	}

	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
