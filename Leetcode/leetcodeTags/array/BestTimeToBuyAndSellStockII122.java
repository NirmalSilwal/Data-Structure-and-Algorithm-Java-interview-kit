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

	// another approach to keep track of buy and selling date
	public static int maxProfit2(int[] prices) {
		if (prices.length < 2)
			return 0;

		int profit = 0;
		int buyDate = 0, sellDate = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] >= prices[i - 1]) {
				// if stock price is increasing, we can sell current hold of
				// stock in future with higher price
				sellDate++;
			} else {
				// if stock graph starts to decrease, sell the previously hold
				// stock
				profit += (prices[sellDate] - prices[buyDate]);
				// now set new buy and sell date to current date after
				// collecting previous profits
				buyDate = sellDate = i;
			}
		}

		// now collecting profit from final increase in stock prices (final dip)
		profit += (prices[sellDate] - prices[buyDate]);

		return profit;
	}

	public static void main(String[] args) {

		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));

		System.out.println(maxProfit(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println(maxProfit(new int[] { 7, 6, 4, 3, 1 }));

		// testing another approach
		System.out.println();
		System.out.println(maxProfit2(prices));

		System.out.println(maxProfit2(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println(maxProfit2(new int[] { 7, 6, 4, 3, 1 }));

	}
}
