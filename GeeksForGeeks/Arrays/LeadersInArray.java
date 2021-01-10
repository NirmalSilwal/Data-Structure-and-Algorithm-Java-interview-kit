package gfg.Arrays;

import java.util.Arrays;

public class LeadersInArray {

	public static void main(String[] args) {

		int[] arr = { 7, 10, 4, 3, 10, 5, 2 };
		int[] arr2 = { 10, 20, 30 };
		int[] arr3 = { 30, 20, 10 };
		int[] arr4 = { 7, 10, 4, 5, 1, 2 };

		System.out.println(Arrays.toString(arr));
		// leaderArray(arr);
		leader(arr);
		System.out.println();

		System.out.println(Arrays.toString(arr2));
		// leaderArray(arr2);
		leader(arr2);
		System.out.println();

		System.out.println(Arrays.toString(arr3));
		// leaderArray(arr3);
		leader(arr3);
		System.out.println();

		System.out.println(Arrays.toString(arr4));
		// leaderArray(arr4);
		leader(arr4);
	}

	// O(n^2) Time | O(1) Space
	public static void leaderArray(int[] arr) {
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

	/*
	 * making above code clean - O(n^2) Time | O(1) Space
	 */
	public static void leader(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] >= arr[i]) {
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

/* output:
[7, 10, 4, 3, 10, 5, 2]
10 5 2 
[10, 20, 30]
30 
[30, 20, 10]
30 20 10 
[7, 10, 4, 5, 1, 2]
10 5 2 
*/