package easy;

import java.util.Arrays;

public class NonConstructibleChange {

	// O(NlogN) Time | O(1) Space
	public static int smallestNonConstructibleCoinChange(int[] coins) {

		int maxConstructible = 0;

		int[] mycoin = coins.clone();
		Arrays.sort(mycoin);

		for (int i = 0; i < mycoin.length; i++) {
			if (mycoin[i] > maxConstructible + 1)
				break;
			maxConstructible += mycoin[i];
		}

		return maxConstructible + 1;
	}

	public static void main(String[] args) {
		int[] coins = { 5, 7, 1, 1, 2, 3, 22 }; // 20
		// int[] coins = {1,2,5}; // 4
		// int[] coins = {}; // 1
		System.out.println(smallestNonConstructibleCoinChange(coins));
	}
}
