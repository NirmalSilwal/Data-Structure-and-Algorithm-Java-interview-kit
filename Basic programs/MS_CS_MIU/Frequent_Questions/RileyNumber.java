package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * A Riley number is an integer whose digits are all even. For example 2426 is a
 * Riley number but 3224 is not.
 */

public class RileyNumber {

	public static void main(String[] args) {
		System.out.println(isRiley(2426)); // 1
		System.out.println(isRiley(3224)); // 0
	}

	static int isRiley(int n) {
		while (n != 0) {
			int remainder = n % 10;
			if (remainder % 2 != 0)
				return 0;
			n = n / 10;
		}
		return 1;
	}

}
