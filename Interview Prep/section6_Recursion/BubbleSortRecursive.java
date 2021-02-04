package section6_Recursion;

import java.util.Arrays;

public class BubbleSortRecursive {

	public static void main(String[] args) {
		
		int[] arr = { 5, 4, 3, 2, 1 };
		int startIndex = 0;
		int lastIndex = arr.length - 1;

		bubbleSort(arr, startIndex, lastIndex);

		System.out.println(Arrays.toString(arr));
	}

	static void bubbleSort(int[] arr, int si, int li) {
		if (li == 0)
			return;

		if (si == li) {
			bubbleSort(arr, 0, li - 1);
			return;
		}

		if (arr[si] > arr[si + 1])
			swap(arr, si, si + 1);

		bubbleSort(arr, si + 1, li);
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
