package com.maharishiuniversity.admit.practiceTest.set1;

public class EvenSubsetIntPairs {

	public static void main(String[] args) {
		System.out.println(isEvenSubset(18, 32)); // 0
		System.out.println(isEvenSubset(18, 12)); // 1
		System.out.println(isEvenSubset(16, 24)); // 1

	}

	public static int isEvenSubset(int m, int n) {
		int result = 0;

		for (int i = 2; i <= m / 2; i += 2) {
			if (m % i == 0) {
				if (n % i == 0) {
					result = 1;
				} else {
					result = 0;
					break;
				}
			}
		}
		return result;
	}

}
