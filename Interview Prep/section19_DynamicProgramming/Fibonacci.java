package section19_DynamicProgramming;

public class Fibonacci {

	public static void main(String[] args) {

		int nth = 7;
		int[] storage = new int[nth + 1];
		System.out.println(fibonacci(nth, storage)); // 13
		System.out.println(fibonacciIterativeDP(nth)); // 13
		System.out.println(fibonacciNormal(nth)); // 13

	}

	// using memoization - recursive approach
	// O(N) Time | O(N) Space
	public static int fibonacci(int n, int[] storage) {

		if (n == 0 || n == 1)
			return n;

		if (storage[n] != 0)
			return storage[n];

		int fibnm1 = fibonacci(n - 1, storage);
		int fibnm2 = fibonacci(n - 2, storage);
		int fibb = fibnm1 + fibnm2;

		storage[n] = fibb;
		// System.out.println(Arrays.toString(storage));
		return fibb;
	}

	// DP - iterative storage approach - DP
	// O(N) Time | O(N) Space
	public static int fibonacciIterativeDP(int n) {
		int[] storage = new int[n + 1];

		// seed values
		storage[0] = 0;
		storage[1] = 1;

		for (int nth = 2; nth <= n; nth++) {
			storage[nth] = storage[nth - 1] + storage[nth - 2];
		}

		return storage[n];
	}

	// without DP
	// O(2^N) Time | O(1) Space
	public static int fibonacciNormal(int n) {
		if (n == 0 || n == 1)
			return n;

		int fibnm1 = fibonacciNormal(n - 1);
		int fibnm2 = fibonacciNormal(n - 2);
		int fibb = fibnm1 + fibnm2;

		return fibb;
	}
}
