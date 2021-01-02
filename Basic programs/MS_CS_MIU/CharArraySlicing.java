package com.maharishiuniversity.admit;

import java.util.Arrays;

/* Question:
 * Write a function that accepts a character array, a zero-based start position and a length. 
 * It should return a character array containing containing length characters starting with the 
 * start character of the input array. The function should do error checking on the start position 
 * and the length and return null if the either value is not legal 
 * The function signature is:
 * char[ ] sliceArray(char[ ] arr, int start, int len)
 */
public class CharArraySlicing {

	public static void main(String[] args) {

		char[] arr = { 'a', 'b', 'c' };

		System.out.println(Arrays.toString(sliceArray(arr, 0, 4)));
		System.out.println(Arrays.toString(sliceArray(arr, 0, 3)));
		System.out.println(Arrays.toString(sliceArray(arr, 0, 2)));
		System.out.println(Arrays.toString(sliceArray(arr, 0, 1)));
		System.out.println(Arrays.toString(sliceArray(arr, 1, 3)));
		System.out.println(Arrays.toString(sliceArray(arr, 1, 2)));
		System.out.println(Arrays.toString(sliceArray(arr, 1, 1)));
		System.out.println(Arrays.toString(sliceArray(arr, 2, 2)));
		System.out.println(Arrays.toString(sliceArray(arr, 2, 1)));
		System.out.println(Arrays.toString(sliceArray(arr, 3, 1)));
		System.out.println(Arrays.toString(sliceArray(arr, 1, 0)));
		System.out.println(Arrays.toString(sliceArray(arr, -1, 2)));
		System.out.println(Arrays.toString(sliceArray(arr, -1, -2)));

		char[] arr2 = {};
		System.out.println(Arrays.toString(sliceArray(arr2, 0, 1)));

	}

	public static char[] sliceArray(char[] arr, int start, int len) {
		if (arr.length < 0 || start < 0 || len < 0 || start >= arr.length || start + len > arr.length) {
			return null;
		}

		char[] output = new char[len];
		int index = 0;
		
		for (int i = start; i < start + len; i++) {
			output[index] = arr[i];
			index++;
		}
		return output;
	}
}


/* output:
null
[a, b, c]
[a, b]
[a]
null
[b, c]
[b]
null
[c]
null
[]
null
null
null
*/