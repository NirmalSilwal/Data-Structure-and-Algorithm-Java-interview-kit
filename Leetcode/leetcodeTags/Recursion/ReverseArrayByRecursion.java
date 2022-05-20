package RecursionSeries;

import java.util.Arrays;

public class ReverseArrayByRecursion {

	public static void reverseArray(int[] arr) {
		reverseRecursion(arr, 0, arr.length - 1);
	}

	// using two pointers in recursion
	private static void reverseRecursion(int[] arr, int l, int r) {
		if (l > r)
			return;
		swap(arr, l, r);
		reverseRecursion(arr, l + 1, r - 1);
	}

	private static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
	}
}
