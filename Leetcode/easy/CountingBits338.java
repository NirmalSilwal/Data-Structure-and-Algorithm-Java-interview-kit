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

	// optimal code using DP
	public static int[] countBitsDP(int n) {
		int[] ans = new int[n + 1];
		ans[0] = 0;

		for (int index = 1; index <= n; index++) {
			if (index % 2 == 0) { // even
				ans[index] = ans[index / 2];
			} else { // odd
				ans[index] = 1 + ans[index / 2];
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(countBits(2)));
		System.out.println(Arrays.toString(countBits(5)));
		System.out.println(Arrays.toString(countBits(0)));
		
		System.out.println("\noptimal\n");

		System.out.println(Arrays.toString(countBitsDP(2)));
		System.out.println(Arrays.toString(countBitsDP(5)));
		System.out.println(Arrays.toString(countBitsDP(0)));
	}
}
