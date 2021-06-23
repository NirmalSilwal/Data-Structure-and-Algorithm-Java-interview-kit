package easy;

import java.util.Arrays;

public class CountingBits338 {

	public static int[] countBits(int n) {
		int[] ans = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			ans[i] = countBinaryOnes(i);
		}
		return ans;
	}

	private static int countBinaryOnes(int num) {
		int count = 0;
		int mask = 1;

		while (num != 0) {
			if ((num & mask) != 0)
				count++;

			num = num >> 1; // right shift
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(countBits(2)));
		System.out.println(Arrays.toString(countBits(5)));
		System.out.println(Arrays.toString(countBits(0)));
	}
}

/* output:
[0, 1, 1]
[0, 1, 1, 2, 1, 2]
[0]
*/