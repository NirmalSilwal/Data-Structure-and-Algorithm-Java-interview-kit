package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * Write a function named minDistance that returns the smallest distance between two factors 
 * of a number. 
 */
public class MinimumDistance {

	public static void main(String[] args) {
		System.out.println(minDistance(1001));
	}

	static int minDistance(int n) {
		int fcount = 0;
		int minimum = n;
		int currFactor = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				if (fcount == 0)
					currFactor = i;

				fcount++;

				if (fcount > 1) {
					if (minimum > i - currFactor)
						minimum = i - currFactor;

					currFactor = i;
				}
			}
		}

		return minimum;
	}
}
