package gfg.Arrays;

import java.util.Arrays;

public class MaximumDifference {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 10, 6, 4, 8, 1 };
		System.out.println(Arrays.toString(arr));
		System.out.println("Max difference: " + maxDiff(arr));
		System.out.println("Max difference: " + maxDiff2(arr));

		int[] arr2 = { 7, 9, 5, 6, 3, 2 };
		System.out.println(Arrays.toString(arr2));
		System.out.println("Max difference: " + maxDiff(arr2));
		System.out.println("Max difference: " + maxDiff2(arr2));

		int[] arr3 = { 10, 20, 30 };
		System.out.println(Arrays.toString(arr3));
		System.out.println("Max difference: " + maxDiff(arr3));
		System.out.println("Max difference: " + maxDiff2(arr3));

		int[] arr4 = { 30, 10, 8, 2 };
		System.out.println(Arrays.toString(arr4));
		System.out.println("Max difference: " + maxDiff(arr4));
		System.out.println("Max difference: " + maxDiff2(arr4));

	}

	// O(N^2) Time | O(1) Space
	public static int maxDiff(int[] arr) {
		int n = arr.length;
		int result = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int restMax = 0;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] > restMax) {
					restMax = arr[j];
				}
			}
			int diff = restMax - arr[i];
			if (diff > result) {
				result = diff;
			}
		}

		return result;
	}

	// O(N) Time | O(1) Space
	public static int maxDiff2(int[] arr) {
		int n = arr.length;
		int result = Integer.MIN_VALUE;
		int currentDiff = 0;
		int currentMin = arr[0];
		int diffWithMin = Integer.MIN_VALUE;

		for (int i = 1; i < n; i++) {
			currentDiff = arr[i] - currentDiff;
			if (arr[i - 1] < currentMin) {
				currentMin = arr[i - 1];
			}
			diffWithMin = arr[i] - currentMin;
			if (diffWithMin > result) {
				result = diffWithMin;
			}
		}

		return result;
	}
}

/* output:
[2, 3, 10, 6, 4, 8, 1]
Max difference: 8
Max difference: 8
[7, 9, 5, 6, 3, 2]
Max difference: 2
Max difference: 2
[10, 20, 30]
Max difference: 20
Max difference: 20
[30, 10, 8, 2]
Max difference: -2
Max difference: -2
*/
