package LeetcodeDaily.March2022;

import java.util.Arrays;

public class Day1CountingBitsLC338 {

	// O(N) time | O(N) space
	public static int[] countBits(int n) {

		int[] countOfOnes = new int[n + 1];
		countOfOnes[0] = 0;

		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				// for even number, LSB will be zero, so doing right shift of number by 1 bit
				// will not lose set one bit(1)
				countOfOnes[i] = countOfOnes[i / 2];
			} else {
				// for odd number, LSB will always be one, so doing right shift of number by 1
				// bit will also lose 1 bit
				countOfOnes[i] = 1 + countOfOnes[i / 2];
			}
		}

		return countOfOnes;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(countBits(15)));
	}

}
