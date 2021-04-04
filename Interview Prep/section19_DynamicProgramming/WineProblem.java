package section19_DynamicProgramming;

public class WineProblem {

	public static void main(String[] args) {

//		int[] winePrice = { 2, 3, 5, 1, 4 };
		// int[] winePrice = { 1, 4, 2, 3 };

		int[] wineLarge = new int[1000];
		for (int i = 0; i < wineLarge.length; i++) {
			wineLarge[i] = i;
		}

		int startIndex = 0, endIndex = wineLarge.length - 1;
		// int startYear = 1;

		// using recursion
		// System.out.println(wineRecursion(winePrice, 0, winePrice.length,
		// startYear));
		// System.out.println(wineRecursion2(wineLarge, startIndex, endIndex));

		// using DP
		int[][] storage = new int[endIndex + 1][endIndex + 1];
		System.out.println(wineTopDownDP(wineLarge, startIndex, endIndex, storage));
		System.out.println(wineBottomUpDP(wineLarge));

	}

	/*
	 * virtually breaking the array using array indexes
	 * 
	 * @param arr : wine price array
	 * 
	 * @param si : start index in wine array
	 * 
	 * @param ei : end index in wine array
	 * 
	 * @param year : current yr to sell wine, as wine price increases every year
	 * 
	 * this code will fail for large wine inputs
	 */
	// O(2^n) Time, n is wine array length
	public static int wineRecursion(int[] arr, int si, int ei, int year) {

		if (si == ei) {
			return arr[si] * year;
		}

		// sell leftmost wine
		int leftMostSell = arr[si] * year + wineRecursion(arr, si + 1, ei, year + 1);
		// sell rightmost wine
		int rightMostSell = arr[ei] * year + wineRecursion(arr, si, ei - 1, year + 1);

		int profit = Math.max(leftMostSell, rightMostSell);

		return profit;
	}

	/*
	 * Without using year parameter. | O(2^n) Time, n is wine array length.
	 */
	public static int wineRecursion2(int[] wine, int si, int ei) {
		// (ei-si+1) gives total left wines after selling, +1 for current year
		int year = wine.length - (ei - si + 1) + 1;

		if (si == ei) {
			return wine[si] * year;
		}

		int leftMostSell = wine[si] * year + wineRecursion2(wine, si + 1, ei);
		int rightMostSell = wine[ei] * year + wineRecursion2(wine, si, ei - 1);

		int profit = Math.max(leftMostSell, rightMostSell);

		return profit;
	}

	public static int wineTopDownDP(int[] arr, int si, int ei, int[][] storage) {
		int year = arr.length - (ei - si + 1) + 1;

		if (si == ei) {
			return arr[si] * year;
		}
		if (storage[si][ei] != 0) { // re-use
			return storage[si][ei];
		}

		int leftMostSell = arr[si] * year + wineTopDownDP(arr, si + 1, ei, storage);
		int rightMostSell = arr[ei] * year + wineTopDownDP(arr, si, ei - 1, storage);

		int profit = Math.max(leftMostSell, rightMostSell);

		storage[si][ei] = profit; // store

		return profit;
	}

	// O (n^2) Time | O(n^2) Space
	public static int wineBottomUpDP(int[] arr) {
		int n = arr.length;
		int[][] storage = new int[n][n];

		// filling diagonally
		for (int slide = 0; slide < n; slide++) {

			for (int si = 0; si <= n - slide - 1; si++) {

				int ei = si + slide;
				// same logic copied from top down DP approach
				int year = n - (ei - si + 1) + 1;

				if (si == ei) {
					storage[si][ei] = arr[si] * year;
				} else {
					int leftMostSell = arr[si] * year + storage[si + 1][ei];
					int rightMostSell = arr[ei] * year + storage[si][ei - 1];
					int profit = Math.max(leftMostSell, rightMostSell);
					storage[si][ei] = profit; // store
				}
			}
		}
		return storage[0][n - 1];
	}
}
