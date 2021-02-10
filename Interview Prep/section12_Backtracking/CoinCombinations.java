package section12_Backtracking;

public class CoinCombinations {

	static int count = 0;

	public static void main(String[] args) {

		int[] denominations = { 2, 3, 5, 6 };
		int amount = 10;
		String ans = "";
		int currentSum = 0;
		int lastCoinIdx = 0;
		coinCombinations(denominations, amount, ans, currentSum, lastCoinIdx);
	}

	static void coinCombinations(int[] coins, int amount, String ans, int currentSum, int lastCoinIdx) {

		if (currentSum == amount) {
			count++;
			System.out.println(count + ". " + ans);
			return;
		}

		if (currentSum > amount) {
			return;
		}

		for (int currentCoin = lastCoinIdx; currentCoin < coins.length; currentCoin++) {

			coinCombinations(coins, amount, ans + coins[currentCoin], currentSum + coins[currentCoin], currentCoin);
		}

	}

}

/*output 
1. 22222
2. 2233
3. 226
4. 235
5. 55
 */
