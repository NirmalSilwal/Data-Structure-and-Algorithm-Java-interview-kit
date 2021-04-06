package section19_DynamicProgramming;

public class Knapsack {

	public static void main(String[] args) {
		int[] weight = { 1, 3, 4, 5 };
		int[] price = { 1, 4, 5, 7 };
		int bagCapacity = 7;
		int virtualIndex = 0;

		System.out.println(knapsack01Rec(weight, price, bagCapacity, virtualIndex)); // 9
	}

	public static int knapsack01Rec(int[] weight, int[] price, int capacity, int vidx) {
		/*
		 * 1. if no item left
		 * 
		 * 2. if current capacity is less than item weight to be included
		 */
		if (vidx == weight.length || capacity < weight[vidx]) {
			return 0;
		}

		// exclude item
		int excludeProfit = knapsack01Rec(weight, price, capacity, vidx + 1);
		// include item
		int includeProfit = price[vidx] + knapsack01Rec(weight, price, capacity - weight[vidx], vidx + 1);

		int profit = Math.max(excludeProfit, includeProfit);

		return profit;
	}
}
