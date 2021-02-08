package section9_Time_Space_Complexity;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 12, 4, 5, 2, 6, 7, 3, 98, 45, -1 };
		int start = 0, end = arr.length - 1;

		int[] ans = mergeSort(arr, start, end);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] mergeSort(int[] arr, int start, int end) {

		if (start == end) {
			int[] base = new int[1];
			base[0] = arr[start];
			return base;
		}

		int mid = start + (end - start) / 2;

		int[] firstHalf = mergeSort(arr, start, mid);
		int[] secondHalf = mergeSort(arr, mid + 1, end);

		int[] mergedArray = mergeArray(firstHalf, secondHalf);

		return mergedArray;
	}

	public static int[] mergeArray(int[] arr1, int[] arr2) {
		int[] merged = new int[arr1.length + arr2.length];
		int i = 0, j = 0, index = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				merged[index] = arr1[i];
				i++;
				index++;
			} else {
				merged[index] = arr2[j];
				j++;
				index++;
			}
		}

		if (i < arr1.length) {
			for (int idx = i; idx < arr1.length; idx++) {
				merged[index] = arr1[idx];
				index++;
			}
		} else {
			for (int idx = j; idx < arr2.length; idx++) {
				merged[index] = arr2[idx];
				index++;
			}
		}

		return merged;
	}
}
