package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * Consider the prime number 11. Note that 13 is also a prime and 13 – 11 = 2. So, 11 and 13 are
 * known as twin primes. Similarly, 29 and 31 are twin primes. So is 71 and 73. However, there are
 * many primes for which there is no twin. Examples are 23, 67. A twin array is defined to an array
 * in which every prime that has a twin appear with a twin. 
 * {3, 5, 8, 10, 27}, // 3 and 5 are twins and both are present
 * {13, 14, 15, 3, 5} // 13 has a twin prime and it is missing in the array
 * {5, 3, 14, 7, 18, 67}. // 3 and 5 are twins, 5 and 7 are twins, 67 has no twin

 */

public class TwinArray {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 8, 10, 27 };
		System.out.println(isTwin(arr)); // 1

		int[] arr2 = { 11, 9, 12, 13, 23 };
		System.out.println(isTwin(arr2)); // 1

		int[] arr3 = { 5, 3, 14, 7, 18, 67 };
		System.out.println(isTwin(arr3)); // 1

		int[] arr4 = { 13, 14, 15, 3, 5 };
		System.out.println(isTwin(arr4)); // 0

		int[] arr5 = { 1, 17, 8, 25, 67 };
		System.out.println(isTwin(arr5)); // 0

	}

	static int isTwin(int[] arr) {
		int result = 0;

		for (int i = 0; i < arr.length; i++) {

			if (isPrime(arr[i])) {

				if (isTwinPrime(arr[i])) {

					int currentTwinPrime;

					if (isPrime(arr[i] - 2)) {
						currentTwinPrime = arr[i] - 2;
					} else
						currentTwinPrime = arr[i] + 2;

					for (int j = 0; j < arr.length; j++) {
						if (arr[j] == currentTwinPrime) {
							result = 1;
							break;
						}
					}

					if (result == 0)
						return result;
				}
			}
		}

		return result;
	}

	private static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	private static boolean isTwinPrime(int n) {
		if (isPrime(n - 2) || isPrime(n + 2))
			return true;
		return false;
	}
}
