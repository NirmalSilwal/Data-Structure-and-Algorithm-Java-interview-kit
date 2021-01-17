package com.maharishiuniversity.admit.practiceTest.frequentQn;

public class KSmallFactors {

	public static void main(String[] args) {
		int n = 30;
		int k = 7;
		System.out.println(hasKSmallFactors(k, n)); // true

		System.out.println(hasKSmallFactors(7, 30)); // true

		System.out.println(hasKSmallFactors(6, 14)); // false

		System.out.println(hasKSmallFactors(6, 30)); // false

		System.out.println(hasKSmallFactors(10, 22)); // false

	}

	// O(K) Time | O(1) Space
	static boolean hasKSmallFactors(int k, int n) {
		if (k < 0 || n < 0)
			return false;

		boolean result = false;

		for (int i = 2; i < k; i++) {
			if (n % i == 0) {
				if ((n / i) < k)
					result = true;
			}
		}

		return result;
	}
}
