package gfg.Arrays;

public class StockBuyAndSell {

	public static void main(String[] args) {

		int[] price = { 1, 5, 3, 8, 12 };
		int start = 0;
		int end = price.length - 1;
		System.out.println("Max profit is: " + stockMaxProfit(price, start, end));

		int[] price2 = { 30, 20, 10 };
		end = price2.length - 1;
		System.out.println("Max profit is: " + stockMaxProfit(price2, start, end));

		int[] price3 = { 10, 20, 30 };
		end = price3.length - 1;
		System.out.println("Max profit is: " + stockMaxProfit(price3, start, end));

		int[] price4 = { 1, 5, 3, 1, 2, 8 };
		end = price4.length - 1;
		System.out.println("Max profit is: " + stockMaxProfit(price4, start, end));

	}

	public static int stockMaxProfit(int[] price, int start, int end) {
		if (end <= start) {
			return 0;
		}
		int profit = 0;

		for (int i = start; i < end; i++) {

			for (int j = i + 1; j <= end; j++) {

				if (price[j] > price[i]) {

					int currentProfit = (price[j] - price[i]) + stockMaxProfit(price, start, i - 1)
							+ stockMaxProfit(price, j + 1, end);

					if (currentProfit > profit) {
						profit = currentProfit;
					}
				}
			}
		}
		return profit;
	}

}
