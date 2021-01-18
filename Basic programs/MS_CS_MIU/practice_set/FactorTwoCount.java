package com.maharishiuniversity.admit.practiceTest.set1;

/*
Write a function named factorTwoCount that returns the number of times that 2 divides
the argument.
*/
public class FactorTwoCount {

	public static void main(String[] args) {
		System.out.println(factorTwoCount(48)); // 4
		System.out.println(factorTwoCount(27)); // 0

	}
	
	// O(logn) time | O(1) space
	static int factorTwoCount(int n) {
		int count = 0;
		while (n > 1) {
			if (n % 2 == 0) {
				count++;
				n = n / 2;
			} else
				break;
		}
		return count;
	}
}
