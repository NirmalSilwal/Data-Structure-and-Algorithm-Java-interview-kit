package Lecture14;

public class mergeSort {

	public static void main(String[] args) {

		int[] arr = { 80, 10, 50, 30, 60, 40, 20, 70 };

		int start = 0, end = arr.length - 1;
		int[] sorted = mergeSorting(arr, start, end);
		display(sorted); // 10 20 30 40 50 60 70 80

	}

	public static int[] mergeSorting(int[] arr, int start, int end) {
		if (start == end) {
			int[] baseResult = new int[1];
			baseResult[0] = arr[start];
			return baseResult;
		}
		int mid = (start + end) / 2;
		int[] firstHalf = mergeSorting(arr, start, mid);
		int[] secondHalf = mergeSorting(arr, mid + 1, end);
		int[] sortedArray = mergeArray(firstHalf, secondHalf);

		return sortedArray;
	}

	public static int[] mergeArray(int[] arr1, int[] arr2) {
		int i = 0, j = 0;
		int[] sorted = new int[arr1.length + arr2.length];
		int index = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				sorted[index] = arr1[i];
				i++;
				index++;
			} else {
				sorted[index] = arr2[j];
				j++;
				index++;
			}
		}

		if (i < arr1.length) {
			for (int pos = i; pos < arr1.length; pos++) {
				sorted[index] = arr1[pos];
				index++;
			}
		} else {
			for (int pos = j; pos < arr2.length; pos++) {
				sorted[index] = arr2[pos];
				index++;
			}
		}

		return sorted;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
