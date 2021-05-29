package array;

import java.util.Arrays;

public class PrefixSum {

	public static void main(String[] args) {

		int[] arr = { -1, 2, 3, 0, 4, 6 };

		int[] psum = findPrefixSum(arr);

		System.out.println((int) Math.ceil((double) 7 / 2));

		System.out.println(Arrays.toString(psum));
	}

	public static int[] findPrefixSum(int[] arr) {

		int[] prefix = new int[arr.length];

		prefix[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			prefix[i] = prefix[i - 1] + arr[i];
		}
		return prefix;
	}
}
