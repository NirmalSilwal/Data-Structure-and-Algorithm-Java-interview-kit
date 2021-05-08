package easy;

import java.util.Arrays;

public class MergeSortedArray88 {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		if (n == 0)
			return;

		int totalItems = m + n;
		int[] mergedNums = new int[totalItems];
		int cursor1 = 0, cursor2 = 0;

		for (int i = 0; i < totalItems; i++) {

			if (cursor1 < m && cursor2 < n && nums1[cursor1] < nums2[cursor2]) {
				mergedNums[i] = nums1[cursor1];
				cursor1++;
			} else {
				if (cursor2 < n) {
					mergedNums[i] = nums2[cursor2];
					cursor2++;
				}
			}
		}

		int currentId = cursor1 + cursor2;

		while (cursor1 < m) {
			mergedNums[currentId] = nums1[cursor1];
			currentId++;
			cursor1++;
		}

		while (cursor2 < n) {
			mergedNums[currentId] = nums2[cursor2];
			cursor2++;
			currentId++;
		}
		// copy ans to original array
		for (int i = 0; i < totalItems; i++) {
			nums1[i] = mergedNums[i];
		}
	}

	public static void main(String[] args) {
		int[] nums1 = { 2, 0 };
		int m = 1;
		int[] nums2 = { 1 };
		int n = 1;
		merge(nums1, m, nums2, n);

		System.out.println(Arrays.toString(nums1));
	}

}
