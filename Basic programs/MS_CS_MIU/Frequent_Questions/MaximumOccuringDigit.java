package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * Write a function named maxOccurDigit that returns the digit that occur the most.
 */

public class MaximumOccuringDigit {

	public static void main(String[] args) {
		System.out.println(maxOccurDigit(327277)); // 7
		System.out.println(maxOccurDigit(33331)); // 3
		System.out.println(maxOccurDigit(5)); // 5
		System.out.println(maxOccurDigit(-9895)); // 9
		System.out.println(maxOccurDigit(3232)); // -1
	}

	static int maxOccurDigit(int n) {
		int tempNum = n;
		if (tempNum < 0)
			tempNum = -tempNum;

		int[] count = new int[10];

		while (tempNum != 0) {
			int rem = tempNum % 10;
			count[rem] = count[rem] + 1;
			tempNum = tempNum / 10;
		}
		int maxCount = count[0];
		int digit = 0;
		for (int i = 1; i < count.length; i++) {
			if (count[i] > maxCount) {
				maxCount = count[i];
				digit = i;
			} else if (count[i] == maxCount)
				digit = -1;
		}
		return digit;
	}
}
