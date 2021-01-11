package gfg.Arrays;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 1, 0, 1, 0 };
		System.out.println("Max consecutive 1s is: " + maxOnesBinaryArray(arr)); // 2

		int[] arr2 = { 0, 1, 1, 1, 0, 1, 0 };
		System.out.println("Max consecutive 1s is: " + maxOnesBinaryArray(arr2)); // 3

		int[] arr3 = { 1, 1, 1, 1 };
		System.out.println("Max consecutive 1s is: " + maxOnesBinaryArray(arr3)); // 4

		int[] arr4 = { 0, 0, 0 };
		System.out.println("Max consecutive 1s is: " + maxOnesBinaryArray(arr4)); // 0

		int[] arr5 = { 1, 0, 1, 1, 1, 1, 0, 1, 1 };
		System.out.println("Max consecutive 1s is: " + maxOnesBinaryArray(arr5)); // 4
	}

	// O(n) Time | O(n) Space
	public static int maxOnesBinaryArray(int[] arr) {
		int count = 0;
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
				continue;
			}
			result = Math.max(result, count);
			count = 0;
		}

		if (result == 0) {
			return count;
		}
		return result;
	}

}
