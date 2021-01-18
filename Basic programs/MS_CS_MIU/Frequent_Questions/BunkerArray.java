package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * A Bunker array is defined to be an array in which at least one odd number is
 * immediately followed by a prime number. So {4, 9, 6, 7, 3} is a Bunker array because
 * the odd number 7 is immediately followed by the prime number 3.
 */
public class BunkerArray {

	public static void main(String[] args) {
		int[] arr = { 4, 9, 6, 7, 3 };
		System.out.println(isBunkerArray(arr)); // 1

		int[] arr2 = { 4, 9, 6, 15, 21 };
		System.out.println(isBunkerArray(arr2)); // 0
	}

	static int isBunkerArray(int[] arr) {
		int bunker = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] % 2 != 0) {
				if (isPrime(arr[i + 1]) == 1) {
					bunker = 1;
					break;
				}
			}
		}
		return bunker;
	}

	private static int isPrime(int n) {
		if (n < 2)
			return 0;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return 0;
		}
		return 1;
	}
}
