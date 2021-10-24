package leetcodeTags.array;

import java.util.Arrays;

public class FibonacciNumber509 {

	// using recursion
	public static int fib(int n) {
		if (n == 0 || n == 1)
			return n;

		int fibonacci = fib(n - 1) + fib(n - 2);
		return fibonacci;
	}

	// using DP
	public static int fibDP(int n) {
		if (n == 0 || n == 1)
			return n;

		int[] storage = new int[n + 1];
		Arrays.fill(storage, -1); // initializing DP array with -1

		// filling first two positions
		storage[0] = 0;
		storage[1] = 1;
		
		return fibTopDown(n, storage);
	}

	private static int fibTopDown(int n, int[] storage) {
		if (n == 0 || n == 1)
			return n;

		if (storage[n] != -1)
			return storage[n];

		int fibonacci = fibTopDown(n - 1, storage) + fibTopDown(n - 2, storage);
		storage[n] = fibonacci;

		return fibonacci;
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 7; i++) {
			System.out.println(fib(i));
		}

		System.out.println("\ntesting DP code\n");
		for (int i = 0; i <= 7; i++) {
			System.out.println(fibDP(i));
		}
	}
}
