package section19_DynamicProgramming;

public class Knapsack {

	public static void main(String[] args) {
		int[] weight = { 1, 3, 4, 5 };
		int[] price = { 1, 4, 5, 7 };
		int bagCapacity = 7;
		int virtualIndex = 0;

		int[][] strg = new int[weight.length][bagCapacity + 1];

		System.out.println(knapsack01Rec(weight, price, bagCapacity, virtualIndex)); // 9
		System.out.println(knapsackTopDown(weight, price, bagCapacity, virtualIndex, strg)); // 9
		System.out.println(knapsackBottomUpDP(weight, price, bagCapacity)); // 9

		System.out.println("\ntesting large inputs...\n" + "");

		int n = 1000;
		int[] wt = new int[n];
		int[] p = new int[n];
		int cap = 70;
		for (int i = 0; i < n; i++) {
			wt[i] = i + 1;
			p[i] = i + 2;
		}

		// using DP
		int[][] storage = new int[wt.length][cap + 1];

		long start = System.currentTimeMillis();
		// System.out.println(knapsack01Rec(wt, p, cap, 0));
		System.out.println(knapsackTopDown(wt, p, cap, 0, storage));
		long end = System.currentTimeMillis();
		System.out.println("time taken by top down: " + (end - start) + " msec");

		start = System.currentTimeMillis();
		System.out.println(knapsackBottomUpDP(wt, p, cap));
		end = System.currentTimeMillis();
		System.out.println("time taken by bottom up: " + (end - start) + " msec");

	}

	/*
	 * Big O analysis shortcut for recursive solution-
	 * 
	 * time = no. of function frames * time taken by 1 function frame
	 * 
	 * no. of function frame = total calls ^ (recursion tree height)
	 */

	// O(2^n) Time, n = total items in bag
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

	public static int knapsackTopDown(int[] weight, int[] price, int capacity, int vidx, int[][] storage) {

		if (vidx == weight.length || capacity == 0) {
			return 0;
		}
		if (storage[vidx][capacity] != 0) {
			return storage[vidx][capacity];
		}

		int excludeProfit = knapsackTopDown(weight, price, capacity, vidx + 1, storage);

		int includeProfit = 0;

		if (capacity >= weight[vidx])
			includeProfit = price[vidx] + knapsackTopDown(weight, price, capacity - weight[vidx], vidx + 1, storage);

		int profit = Math.max(excludeProfit, includeProfit);
		storage[vidx][capacity] = profit;

		return profit;
	}

	// O(NM) Time, N is total items, M is total capacity | O(NM) Space
	public static int knapsackBottomUpDP(int[] weight, int[] price, int capacity) {
		int[][] storage = new int[weight.length + 1][capacity + 1];

		// filling bottom up, left to right
		for (int row = weight.length - 1; row >= 0; row--) {

			for (int col = 1; col <= capacity; col++) {

				int exclude = storage[row + 1][col];

				int include = 0;
				if (col >= weight[row])
					include = storage[row + 1][col - weight[row]] + price[row];

				int ans = Math.max(exclude, include);

				storage[row][col] = ans;
			}
		}

		return storage[0][capacity];
	}
}
