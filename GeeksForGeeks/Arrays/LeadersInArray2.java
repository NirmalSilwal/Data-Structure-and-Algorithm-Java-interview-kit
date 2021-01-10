package gfg.Arrays;

import java.util.Arrays;

public class LeadersInArray2 {

	public static void main(String[] args) {
		int[] arr = { 7, 10, 4, 3, 10, 5, 2 };
		int[] arr2 = { 10, 20, 30 };
		int[] arr3 = { 30, 20, 10 };
		int[] arr4 = { 7, 10, 4, 5, 1, 2 };

		System.out.println(Arrays.toString(arr));
		leader(arr);
		System.out.println();

		System.out.println(Arrays.toString(arr2));
		leader(arr2);
		System.out.println();

		System.out.println(Arrays.toString(arr3));
		leader(arr3);
		System.out.println();

		System.out.println(Arrays.toString(arr4));
		leader(arr4);
	}

	/*
	 * O(n) Time | O(1) Space - this prints leaders from last of array
	 */
	public static void leader(int[] arr) {
		int n = arr.length;
		int currentMax = arr[n - 1];
		System.out.print(currentMax + " ");

		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > currentMax) {
				currentMax = arr[i];
				System.out.print(currentMax + " ");
			}
		}
	}

}

/* output:
[7, 10, 4, 3, 10, 5, 2]
2 5 10 
[10, 20, 30]
30 
[30, 20, 10]
10 20 30 
[7, 10, 4, 5, 1, 2]
2 5 10 
*/