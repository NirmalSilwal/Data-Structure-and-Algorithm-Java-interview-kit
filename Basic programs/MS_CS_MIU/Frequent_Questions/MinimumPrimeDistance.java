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

	static int minPrimeDistance(int n) {
		int minDistance = n;
		int factorCount = 0;
		int oldFactor = 0;

		for (int currentFactor = 1; currentFactor <= n; currentFactor++) {

			if (n % currentFactor == 0) {

				if (factorCount == 0)
					oldFactor = currentFactor;

				factorCount++;

				if (isPrime(currentFactor)) {

					if (factorCount > 1) {

						if (currentFactor - oldFactor < minDistance)
							minDistance = currentFactor - oldFactor;

						oldFactor = currentFactor;
					}
				}
			}
		}
		return minDistance;
	}

	// O(Sqrt(n) Time | O(1) Space
	private static boolean isPrime(int n) {
		if (n == 1)
			return true;
		if (n < 1)
			return false;

		int loop = (int) Math.sqrt(n);
		for (int i = 2; i <= loop; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
