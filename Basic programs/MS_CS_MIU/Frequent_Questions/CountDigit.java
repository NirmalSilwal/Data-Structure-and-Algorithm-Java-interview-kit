package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * Write a function named countDigit that returns the number of times that a given digit
 * appears in a positive number.
 */
public class CountDigit {

	public static void main(String[] args) {
		System.out.println(countDigit(32121, 1)); // 2
		System.out.println(countDigit(33331, 3)); // 4
		System.out.println(countDigit(33331, 6)); // 0
		System.out.println(countDigit(3, 3)); // 1
	}

	// O(k) Time where k is number of digits in n | O(1) Space
	static int countDigit(int n, int digit) {
		if (n < 0 | digit < 1)
			return -1;

		int nCopy = n;
		int count = 0;

		while (nCopy > 1) {
			int remainder = nCopy % 10;
			nCopy = nCopy / 10;

			if (remainder == digit)
				count++;
		}
		return count;
	}
}
