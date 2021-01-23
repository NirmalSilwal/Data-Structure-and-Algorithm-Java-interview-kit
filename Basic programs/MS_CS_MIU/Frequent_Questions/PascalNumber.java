package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * A Pascal number is a number that is the sum of the integers from 1 to i for some i
 */

public class PascalNumber {

	public static void main(String[] args) {
		System.out.println(isPascal(6)); // 1
		System.out.println(isPascal(15)); // 1
		System.out.println(isPascal(7)); // 0

	}

	static int isPascal(int n) {
		int sum = 0;
		int nthVal = 1;
		while (sum < n) {
			sum = sum + nthVal;
			nthVal++;
		}
		return sum == n ? 1 : 0;
	}
}
