package section12_Backtracking;

public class CoinChangePermutations {

	static int count;

	public static void main(String[] args) {
		coinPermutation(new int[] { 2, 3, 5, 6 }, 10, "", 0);
	}

	static void coinPermutation(int[] coins, int amount, String ans, int currentSum) {

		if (currentSum == amount) {
			count++;
			System.out.println(count + ". " + ans);
			return;
		}
		if (currentSum > amount)
			return;

		for (int coinIdx = 0; coinIdx < coins.length; coinIdx++) {
			coinPermutation(coins, amount, ans + coins[coinIdx], currentSum + coins[coinIdx]);
		}
	}
}

/* output:
1. 22222
2. 2233
3. 226
4. 2323
5. 2332
6. 235
7. 253
8. 262
9. 3223
10. 3232
11. 325
12. 3322
13. 352
14. 523
15. 532
16. 55
17. 622
*/