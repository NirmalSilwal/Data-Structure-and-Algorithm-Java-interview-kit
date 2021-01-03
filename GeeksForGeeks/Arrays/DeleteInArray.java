package gfg.Arrays;

import java.util.Arrays;

public class DeleteInArray {

	public static void main(String[] args) {

		int[] arr = { 3, 8, 12, 5, 6 };

		System.out.println(Arrays.toString(arr));
		deleteElement(arr, 12);
		System.out.println(Arrays.toString(arr));
	}

	// O(n) time
	public static int deleteElement(int[] arr, int element) {
		int index = Integer.MIN_VALUE;
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			if (arr[i] == element) {
				index = i;
				break;
			}
		}

		for (int j = index; j < len - 1; j++) {
			arr[j] = arr[j + 1];
		}
		arr[len - 1] = Integer.MIN_VALUE;
		return len - 1;
	}

}
