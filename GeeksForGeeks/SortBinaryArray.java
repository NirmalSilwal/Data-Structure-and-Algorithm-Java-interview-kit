import java.util.Arrays;

public class SortBinaryArray {

	// O(N) Time | O(1) Space
	public static void sortBinaryArr(int[] arr) {
		int zeroid = 0, nonzero = 0;

		while (zeroid < arr.length && nonzero < arr.length) {
			if (arr[zeroid] != 0) {
				zeroid++;
			}
			if (arr[nonzero] != 1) {
				nonzero++;
			}
			if (zeroid < arr.length && nonzero < arr.length) {
				if (arr[zeroid] == 0 && arr[nonzero] == 1) {
					swap(arr, zeroid, nonzero);
				}
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// approach 2- O(N) Time | O(1) Space
	public static void sortBinaryArr2(int[] arr) {
		int zeroth = 0;

		// replacing all initial items with zero with total zeros available
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[zeroth] = 0;
				zeroth++;
			}
		}
		// making all 1's after all zeros
		for (int i = zeroth; i < arr.length; i++) {
			arr[i] = 1;
		}
	}

	// using partitioning logic of quick sort
	// O(N) time | O(1) Space
	public static void sortBinaryArr3(int[] arr) {

		int pivotElement = 1;
		int pivotIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < pivotElement) {
				swap(arr, i, pivotIndex);
				pivotIndex++;
			}
		}
	}

	public static void main(String[] args) {

		// int[] arr = { 1, 0, 0, 1, 0, 1, 0, 1, 1, 1 };
		// int[] arr = { 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0 };
		// int[] arr = { 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0 };

		int[] arr = { 1, 1, 0, 1, 0, 0 };
		sortBinaryArr3(arr);
		System.out.println(Arrays.toString(arr));
	}
}
