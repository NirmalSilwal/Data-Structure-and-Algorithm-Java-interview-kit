package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * A fancy number is a number in the sequence 1, 1, 5, 17, 61, … .Note that first
 * two fancy numbers are 1 and any fancy number other than the first two is sum of the three
 * times previous one and two times the one before that.
 */

public class FancyNumber {

	public static void main(String[] args) {
		System.out.println(isFancy(17)); // 1
		System.out.println(isFancy(61)); // 1
		System.out.println(isFancy(1)); // 1
		System.out.println(isFancy(10)); // 0
		System.out.println(isFancy(5)); // 1

	}

	// O(k) Time, where kth fancy number is n | O(1)Space
	static int isFancy(int n) {
		int first = 1;
		int second = 1;
		int temp = first;

		while (second <= n) {
			if (second == n)
				return 1;
			temp = (3 * second) + (2 * first);
			first = second;
			second = temp;
		}

		return 0;
	}
}
