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
		int distance = n;
		int prevFactor = 1;

		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				
				if (i - prevFactor < distance)
					distance = i - prevFactor;

				prevFactor = i;
			}
		}
		return distance;
	}
}
