package easy;

public class BestTimeToBuyAndSellStock121 {

	// O(N^2) Time | O(1) Space
	public static int maxProfit(int[] prices) {

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

	public static void main(String[] args) {
		// int[] prices = { 7, 1, 5, 3, 6, 4 };
		int[] prices = { 7, 6, 4, 3, 1 };
		System.out.println(maxProfit(prices));
	}
}
