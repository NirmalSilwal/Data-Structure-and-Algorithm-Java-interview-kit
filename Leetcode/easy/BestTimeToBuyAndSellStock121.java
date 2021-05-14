package easy;

public class BestTimeToBuyAndSellStock121 {

	// O(N^2) Time | O(1) Space
	public static int maxProfit1(int[] prices) {

		int max = 0;

		for (int curr = 0; curr < prices.length - 1; curr++) {

			for (int future = curr + 1; future < prices.length; future++) {

				int currSell = prices[future] - prices[curr];

				if (currSell > 0 && currSell > max) {
					max = currSell;
				}
			}
		}

		return max;
	}

	// using Kadance's algorithm
	// O(N) Time | O(1) Space
	public static int maxProfit(int[] prices) {

		if (prices.length < 2)
			return 0;

		int max = 0;
		int currentMax = 0;

		for (int i = 1; i < prices.length; i++) {

			currentMax = currentMax + (prices[i] - prices[i - 1]);

			if (currentMax > max) {
				max = currentMax;
			}

			if (currentMax < 0) {
				currentMax = 0;
			}
		}

		return max;
	}
	
	// O(N) Time | O(1) Space
	public static int maxProfit3(int[] prices) {

		int minBuyPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int currentPrice : prices) {

			if (currentPrice < minBuyPrice) {
				minBuyPrice = currentPrice;

			} else if (currentPrice - minBuyPrice > maxProfit) {
				maxProfit = currentPrice - minBuyPrice;
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		// int[] prices = { 7, 1, 5, 3, 6, 4 };
		int[] prices = { 7, 6, 4, 3, 1 };
		System.out.println(maxProfit3(prices));
	}
}
