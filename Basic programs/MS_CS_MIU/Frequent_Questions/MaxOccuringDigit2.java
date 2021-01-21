package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * Find the most frequent digit without using array/string
 */
public class MaxOccuringDigit2 {

	public static void main(String[] args) {
		System.out.println(maxOccuringDigit(327277)); // 7
		System.out.println(maxOccuringDigit(33331)); // 3
		System.out.println(maxOccuringDigit(5)); // 5
		System.out.println(maxOccuringDigit(-9895)); // 9
		System.out.println(maxOccuringDigit(1223355)); // 9

	}

	static int maxOccuringDigit(int n) {
		if (n < 0)
			n = -n;

		int maxCount = 0;
		int digit = 0;

		for (int d = 0; d <= 9; d++) {
			int count = countCurrentDigit(d, n);
			if (count > maxCount) {
				maxCount = count;
				digit = d;
			} else if (count == maxCount) {
				if (d > digit)
					digit = d;
			}
		}
		return digit;
	}

	private static int countCurrentDigit(int d, int n) {
		int count = 0;
		while (n != 0) {
			int rem = n % 10;
			if (rem == d)
				count++;
			n = n / 10;
		}
		return count;
	}
}
