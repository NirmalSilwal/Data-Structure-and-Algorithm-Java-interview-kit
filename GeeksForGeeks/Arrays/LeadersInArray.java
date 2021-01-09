package gfg.Arrays;

import java.util.Arrays;

public class LeadersInArray {

	public static void main(String[] args) {

		int[] arr = { 7, 10, 4, 3, 10, 5, 2 };
		int[] arr2 = { 10, 20, 30 };
		int[] arr3 = { 30, 20, 10 };
		int[] arr4 = { 7, 10, 4, 5, 1, 2 };

		System.out.println(Arrays.toString(arr));
		ladderArray(arr);
		System.out.println();

		System.out.println(Arrays.toString(arr2));
		ladderArray(arr2);
		System.out.println();

		System.out.println(Arrays.toString(arr3));
		ladderArray(arr3);
		System.out.println();

		System.out.println(Arrays.toString(arr4));
		ladderArray(arr4);
	}

	// O(n^2) Time | O(1) Space
	public static void ladderArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = i; j < arr.length; j++) {
				if (arr[i] < arr[j] || (j > i && arr[i] == arr[j])) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
