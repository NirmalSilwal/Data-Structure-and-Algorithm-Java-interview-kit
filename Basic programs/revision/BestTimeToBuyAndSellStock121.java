package practice.revisited;

/*
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */

public class BestTimeToBuyAndSellStock121 {

	public static int maxProfit(int[] prices) {
		if (prices.length < 2)
			return 0;
		int profit = 0;
		int currlow = prices[0];
		int sell = 0;

		for (int curr = 1; curr < prices.length; curr++) {

			if (prices[curr] < currlow) {
				currlow = prices[curr];
			}
			sell = prices[curr] - currlow;
			profit = Math.max(profit, sell);
		}
		return profit;
	}

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));
		System.out.println(maxProfit(new int[] { 7, 6, 4, 3, 1 }));
	}
}
