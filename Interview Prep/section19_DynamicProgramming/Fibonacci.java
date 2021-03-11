package section19_DynamicProgramming;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {

		int nth = 7;
		int[] storage = new int[nth + 1];
		System.out.println(fibonacci(nth, storage)); // 13
	}

	// using memoization
	public static int fibonacci(int n, int[] storage) {

		if (n == 0 || n == 1)
			return n;

		if (storage[n] != 0)
			return storage[n];

		int fibnm1 = fibonacci(n - 1, storage);
		int fibnm2 = fibonacci(n - 2, storage);
		int fibb = fibnm1 + fibnm2;

		storage[n] = fibb;
		System.out.println(Arrays.toString(storage));
		return fibb;
	}
}
