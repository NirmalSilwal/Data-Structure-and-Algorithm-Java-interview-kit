package gfg.Arrays;

public class StockBuyAndSell2 {

	public static void main(String[] args) {
		int[] price = { 1, 5, 3, 8, 12 };
		System.out.println("Max profit is: " + stockMaxProfit(price));

		int[] price2 = { 30, 20, 10 };
		System.out.println("Max profit is: " + stockMaxProfit(price2));

		int[] price3 = { 10, 20, 30 };
		System.out.println("Max profit is: " + stockMaxProfit(price3));

		int[] price4 = { 1, 5, 3, 1, 2, 8 };
		System.out.println("Max profit is: " + stockMaxProfit(price4));

	}

	// O(n) Time | O(1) space
	public static int stockMaxProfit(int[] price) {
		int profit = 0;
		for (int i = 1; i < price.length; i++) {
			if (price[i] > price[i - 1]) {
				profit = profit + (price[i] - price[i - 1]);
			}
		}
		return profit;
	}
}
