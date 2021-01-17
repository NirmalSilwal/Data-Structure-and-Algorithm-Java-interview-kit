package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * A Meera number is a number such that the number of nontrivial factors is a factor of
 * the number
 */
public class MeeraNumber {

	public static void main(String[] args) {
		System.out.println(isMeera(6)); // 1
		System.out.println(isMeera(30)); // 1
		System.out.println(isMeera(21)); // 0

	}

	// O(N) Time | O(1) Space
	static int isMeera(int n) {
		int factorCount = 0;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				factorCount++;
		}

		int checkMeera = n % factorCount == 0 ? 1 : 0;

		return checkMeera;
	}
}
