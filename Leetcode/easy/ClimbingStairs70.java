package easy;

import java.util.Arrays;

public class ClimbingStairs70 {

	// this gives TLE for n >= 42
	public static int climbStairs(int n) {

		if (n == 0)
			return 1;

		if (n < 0)
			return 0;

		int oneStep = climbStairs(n - 1);
		int twoStep = climbStairs(n - 2);

		int totalClimbPossible = oneStep + twoStep;

		return totalClimbPossible;
	}

	// optimal code
	public static int climbStairsDP(int n, int[] storage) {

		if (n == 0)
			return 1;

		if (n < 0)
			return 0;

		if (storage[n] != -1)
			return storage[n];

		int oneStep = climbStairsDP(n - 1, storage);
		int twoStep = climbStairsDP(n - 2, storage);

		int totalClimbPossible = oneStep + twoStep;

		storage[n] = totalClimbPossible;

		return totalClimbPossible;
	}

	public static void main(String[] args) {

		// using Recrusive approach only
		int n = 45;

		// System.out.println(climbStairs(n));

		// using DP
		int[] storage = new int[n + 1];
		Arrays.fill(storage, -1);
		System.out.println(climbStairsDP(n, storage));
	}
}
