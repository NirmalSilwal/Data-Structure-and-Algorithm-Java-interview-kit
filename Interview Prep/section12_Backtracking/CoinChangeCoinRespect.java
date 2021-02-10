package section12_Backtracking;

public class CoinChangeCoinRespect {

	public static void main(String[] args) {
		int[] denominations = { 2, 3, 5, 6 };
		int amount = 10;
		String ans = "";
		int currentCoinPosition = 0;

		coinChange(denominations, amount, ans, currentCoinPosition);

	}

	static void coinChange(int[] coins, int amount, String ans, int coinIndex) {

		if (amount < 0)
			return;

		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		if (coinIndex > coins.length - 1)
			return;

		// include current coin
		coinChange(coins, amount - coins[coinIndex], ans + coins[coinIndex], coinIndex);

		// do not include current coin
		coinChange(coins, amount, ans, coinIndex + 1);

	}
}

/* output:
22222
2233
226
235
55
*/
