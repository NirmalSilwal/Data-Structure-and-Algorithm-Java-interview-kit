package leetcodeTags.array;

import java.util.ArrayList;
import java.util.Arrays;

public class SquaresOfASortedArray977 {

	// O(NlogN) time, O(N) space
	public static int[] sortedSquares(int[] nums) {

		int[] output = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			output[i] = nums[i] * nums[i];
		}
		Arrays.sort(output);

		return output;
	}

	// follow up part - O(N) Time | O(N) Space
	public static int[] sortedSquares2(int[] nums) {

		ArrayList<Integer> list1 = new ArrayList<>(); // to store negative items
		ArrayList<Integer> list2 = new ArrayList<>(); // to store positive items
		int[] output = new int[nums.length]; // to store final sorted array

		for (int n : nums) {
			if (n < 0) {
				list1.add(n);
			} else {
				list2.add(n);
			}
		}

		int pos = 0; // position to fill in output array
		int ptr1 = list1.size() - 1, ptr2 = 0;

		/*
		 * here we traverse in reverse for list1 as it has negative elements in
		 * sorted order and from beginning for list2 as it has positive elements
		 */
		while (ptr1 >= 0 && ptr2 < list2.size()) {
			if (Math.abs(list1.get(ptr1)) < Math.abs(list2.get(ptr2))) {
				output[pos] = list1.get(ptr1);
				ptr1--;
			} else {
				output[pos] = list2.get(ptr2);
				ptr2++;
			}
			pos++;
		}

		// for remaining elements in either of two lists
		while (pos < output.length && ptr1 >= 0) {
			output[pos] = list1.get(ptr1);
			ptr1--;
			pos++;
		}
		while (pos < output.length && ptr2 < list2.size()) {
			output[pos] = list2.get(ptr2);
			ptr2++;
			pos++;
		}

		// squaring the sorted elements
		for (int i = 0; i < output.length; i++) {
			output[i] = output[i] * output[i];
		}

		return output;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortedSquares(new int[] { -4, -1, 0, 3, 10 })));
		System.out.println(Arrays.toString(sortedSquares(new int[] { -7, -3, 2, 3, 11 })));

		System.out.println("\ntesting optimal code\n");
		System.out.println(Arrays.toString(sortedSquares2(new int[] { -4, -1, 0, 3, 10 })));
		System.out.println(Arrays.toString(sortedSquares2(new int[] { -7, -3, 2, 3, 11 })));

		int[] arr = { -10, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3 };
		System.out.println(Arrays.toString(sortedSquares2(arr)));
	}
}
