package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * An integer is defined to be a Bunker number if it is an element in the infinite sequence 1, 2, 4, 7,
 * 11, 16, 22, … Note that 2-1=1, 4-2=2, 7-4=3
 */
public class BunkerNumber {

	public static void main(String[] args) {
		System.out.println(isBunker(11));
		System.out.println(isBunker(22));
		System.out.println(isBunker(16));
		System.out.println(isBunker(8));

	}

	static int isBunker(int n) {
		if (n < 1)
			return 0;
		if (n == 1)
			return 1;
		
		int index = 1;
		int currentVal = 1;
		while (currentVal < n) {
			currentVal += index;
			index++;
		}
		return currentVal == n ? 1 : 0;
	}

}
