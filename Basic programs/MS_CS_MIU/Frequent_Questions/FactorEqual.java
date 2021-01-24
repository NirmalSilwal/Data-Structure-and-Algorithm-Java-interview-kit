package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * Two integers are defined to be factor equal, if they have the same number of factors.
 */

public class FactorEqual {

	public static void main(String[] args) {
		System.out.println(factorEqual(10, 33)); // 1
		System.out.println(factorEqual(9, 10)); // 0

	}

	// O(n+m) Time | O(1) Space	
	static int factorEqual(int n, int m) {
		int nCount = 0;
		int mCount = 0;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				nCount++;
		}

		for (int i = 2; i <= m / 2; i++) {
			if (m % i == 0)
				mCount++;
		}

		return nCount == mCount ? 1 : 0;
	}
}
