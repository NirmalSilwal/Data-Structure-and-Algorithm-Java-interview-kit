package section19_DynamicProgramming;

import java.util.Arrays;

public class MazePath {

	public static void main(String[] args) {
		int n = 1000;
		int cr = 0, cc = 0, er = n, ec = n;

		// System.out.println(mazePathRecursion(cr, cc, er, ec)); // 6, for n=2
//		 System.out.println(mazePathTopDownDP(cr, cc, er, ec, new int[n + 1][n + 1]));
		System.out.println(mazePathBottomUpDP(er, ec));
		System.out.println(mazePathBottomUpSpaceEfficient(er, ec));
	}

	// O(2^(er+ec)) Time
	public static int mazePathRecursion(int currentRow, int currentCol, int endRow, int endCol) {
		// base case
		if (currentRow == endRow && currentCol == endCol) {
			return 1;
		}
		if (currentRow > endRow || currentCol > endCol) {
			return 0;
		}

		int horizontalCount = mazePathRecursion(currentRow, currentCol + 1, endRow, endCol);
		int verticalCount = mazePathRecursion(currentRow + 1, currentCol, endRow, endCol);

		int totalPaths = horizontalCount + verticalCount;
		return totalPaths;
	}

	// top down DP / Memoization
	// it gives out of memeory exception for large inputs as recursion Stack gets full

	// O(er*ec) Time | O(er*ec) Space + recursion extra space
	public static int mazePathTopDownDP(int currentRow, int currentCol, int endRow, int endCol, int[][] storage) {
		// base case
		if (currentRow == endRow && currentCol == endCol) {
			return 1;
		}
		if (currentRow > endRow || currentCol > endCol) {
			return 0;
		}
		if (storage[currentRow][currentCol] != 0) {
			return storage[currentRow][currentCol];
		}

		int horizontalCount = mazePathTopDownDP(currentRow, currentCol + 1, endRow, endCol, storage);
		int verticalCount = mazePathTopDownDP(currentRow + 1, currentCol, endRow, endCol, storage);

		int totalPaths = horizontalCount + verticalCount;
		// store
		storage[currentRow][currentCol] = totalPaths;

		return totalPaths;
	}

	// bottom-up DP / Tabulation
	// O(er*ec) Time | O(er*ec) Space
	public static int mazePathBottomUpDP(int er, int ec) {
		// to handle negative base cases size is 1 more of storage
		int[][] storage = new int[er + 2][ec + 2];

		for (int row = er; row >= 0; row--) {

			for (int col = ec; col >= 0; col--) {

				if (row == er && col == ec) {
					storage[row][col] = 1;
				} else {
					storage[row][col] = storage[row][col + 1] + storage[row + 1][col];
				}
			}
		}

		return storage[0][0];
	}

	// O(er*ec) Time | O(ec) Space
	public static int mazePathBottomUpSpaceEfficient(int er, int ec) {
		int[] storage = new int[ec + 1];

		Arrays.fill(storage, 1);

		for (int slide = er - 1; slide >= 0; slide--) {

			storage[ec] = storage[ec];
			for (int col = ec - 1; col >= 0; col--) {
				storage[col] = storage[col + 1] + storage[col];
			}
		}
		return storage[0];
	}
}
