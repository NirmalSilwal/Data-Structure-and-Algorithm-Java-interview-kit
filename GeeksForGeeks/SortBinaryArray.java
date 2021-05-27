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

	public static void main(String[] args) {
		// int[] arr = { 1, 0, 0, 1, 0, 1, 0, 1, 1, 1 };
		// int[] arr = { 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0 };
		// int[] arr = { 1, 1, 0, 1, 0, 0 };
		int[] arr = { 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0 };
		sortBinaryArr(arr);
		System.out.println(Arrays.toString(arr));
	}
}
