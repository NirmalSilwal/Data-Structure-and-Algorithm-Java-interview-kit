package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * Write a function named minPrimeDistance that returns the smallest distance
 * between two prime factors of a number.
 */
public class MinimumPrimeDistance {

	public static void main(String[] args) {
		System.out.println(minPrimeDistance(8)); // 1
		System.out.println(minPrimeDistance(13013)); // 2
	}

		static int minPrimeDistance2(int n) {
		int minDistance = n;
		int oldFactor = 1;

		for (int currFactor = 2; currFactor <= n; currFactor++) {
			if (n % currFactor == 0) {
				// it means currFactor is one of the factor of n

				if (isPrime(currFactor)) {
					if (currFactor - oldFactor < minDistance) {
						minDistance = currFactor - oldFactor;
					}
					oldFactor = currFactor;
				}
			}
		}
		return minDistance;
	}

	// O(Sqrt(n) Time | O(1) Space
	private static boolean isPrime(int n) {
		if (n < 2)
			return false;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
