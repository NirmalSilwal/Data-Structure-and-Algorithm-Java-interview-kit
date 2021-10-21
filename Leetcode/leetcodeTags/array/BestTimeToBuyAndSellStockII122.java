package leetcodeTags.array;

public class BestTimeToBuyAndSellStockII122 {

	public static int maxProfit(int[] prices) {
		if (prices.length < 2)
			return 0;

		int total = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i - 1] < prices[i]) {
				total += prices[i] - prices[i - 1];
			}
		}
		return total;
	}

	public static void main(String[] args) {

		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));

		System.out.println(maxProfit(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println(maxProfit(new int[] { 7, 6, 4, 3, 1 }));

	}
}
