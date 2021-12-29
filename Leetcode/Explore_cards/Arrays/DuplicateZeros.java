package Arrays;

import java.util.Arrays;

/*
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 */

public class DuplicateZeros {

	// 1st approach - O(N) time | O(N) Space
	public static void duplicateZeros(int[] arr) {
		int len = arr.length;
		int[] temparr = new int[len];
		int idxans = 0; // track temp output array index
		int currid = 0; // track position in original array item

		for (int i = 0; i < len; i++) {
			if (idxans >= len)
				break;

			if (arr[currid] != 0 && idxans < len) {
				temparr[idxans] = arr[currid];
				idxans++;

				currid++;

			} else if (arr[currid] == 0 && (idxans + 1) < len) {
				temparr[idxans] = 0;
				idxans++;
				temparr[idxans] = 0;
				idxans++;

				currid++;
			}
		}

		for (int i = 0; i < len; i++) {
			arr[i] = temparr[i];
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		duplicateZeros(new int[] { 1, 0, 2, 3, 0, 4, 5, 0 });
		duplicateZeros(new int[] { 8, 4, 5, 0, 0, 0, 0, 7 });
		duplicateZeros(new int[] { 1, 2, 3 });
	}
}
