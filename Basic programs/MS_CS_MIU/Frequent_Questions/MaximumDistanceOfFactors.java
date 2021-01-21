package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * Write a function named maxDistance that returns the largest distance between two
 * non -trivial factors of a number.
 * maxDistance (8) would return 2 because the non-trivial  factors of 8 are 2 and 4 and 
 * the largest distance between any two non-trivial factors is 2 (4 - 2 = 2).
 */

public class MaximumDistanceOfFactors {

	public static void main(String[] args) {
		System.out.println(maxDistance(1001)); // 136
		System.out.println(maxDistance(8)); // 2
		System.out.println(maxDistance(7)); // -1
		System.out.println(maxDistance(49)); // 0

	}

	// O(N) Time | O(1) Space
	static int maxDistance(int n) {
		int firstFactor = 0;
		int lastFactor = 0;
		int count = 0;

		for (int currentFactor = 2; currentFactor <= n / 2; currentFactor++) {
			if (n % currentFactor == 0) {

				if (count == 0)
					firstFactor = currentFactor;

				count++;

				lastFactor = currentFactor;
			}
		}

		if (count == 0)
			return -1;

		if (count == 1)
			return 0;

		return lastFactor - firstFactor;
	}
}
