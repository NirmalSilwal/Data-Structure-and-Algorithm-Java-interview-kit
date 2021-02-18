package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * A primeproduct is a positive integer that is the product of exactly two primes greater than 1. For
 * example, 22 is primeproduct since 22 = 2 times 11 and both 2 and 11 are primes greater than 1.
 */
public class PrimeProduct {

	public static void main(String[] args) {
		System.out.println(isPrimeProduct(22)); // 1
		System.out.println(isPrimeProduct(40)); // 0
	}

	static int isPrimeProduct(int n) {

		int primeFactorCount = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0 && isPrime(i) == 1)
				primeFactorCount++;
		}
		int[] factors = new int[primeFactorCount];

		int index = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0 && isPrime(i) == 1) {
				factors[index] = i;
				index++;
			}
		}

		int left = n;
		for (int i = 0; i < factors.length; i++) {
			if (factors[i] == left)
				return 1;
			left = left / factors[i];
			for (int j = i + 1; j < factors.length; j++) {
				if (factors[j] == left)
					return 1;
			}
		}

		return 0;
	}

	private static int isPrime(int n) {
		if (n < 2)
			return 0;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return 0;
		}

		return 1;
	}
}
