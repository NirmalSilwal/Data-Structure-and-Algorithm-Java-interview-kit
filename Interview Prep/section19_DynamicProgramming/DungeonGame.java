package section19_DynamicProgramming;

public class DungeonGame {

	public static void main(String[] args) {

		int[][] dungeon = { { -2, -3, 3 }, { -5, -10, 1 }, { 10, 30, -5 } };
		int currRow = 0, currCol = 0;
		int endRow = dungeon.length - 1, endCol = dungeon[0].length - 1;

		System.out.println(knightMinHealthRecursion(dungeon, currRow, currCol, endRow, endCol));

		// top down DP
		int[][] storage = new int[endRow + 1][endCol + 1];
		System.out.println(knightMinHealthTopDownDP(dungeon, 0, 0, endRow, endCol, storage));

		// bottom up DP
		System.out.println(knightMinHealthBottomUpDP(dungeon));
	}

	public static int knightMinHealthRecursion(int[][] dungeon, int cr, int cc, int er, int ec) {

		if (cr > er || cc > ec) {
			return Integer.MAX_VALUE;
		}
		if (cr == er && cc == ec) {
			if (dungeon[cr][cc] <= 0) {
				return 1 - dungeon[cr][cc];
			}
			return 1;
		}

		int moveRight = knightMinHealthRecursion(dungeon, cr, cc + 1, er, ec);
		int moveBottom = knightMinHealthRecursion(dungeon, cr + 1, cc, er, ec);

		int minPath = Math.min(moveRight, moveBottom);

		int healthAlreadyHave = minPath - dungeon[cr][cc];

		int minHealthRequired;

		if (healthAlreadyHave > 0) {
			minHealthRequired = healthAlreadyHave;
		} else {
			minHealthRequired = 1;
		}

		return minHealthRequired;
	}

	public static int knightMinHealthTopDownDP(int[][] dungeon, int cr, int cc, int er, int ec, int[][] storage) {

		if (cr > er || cc > ec) {
			return Integer.MAX_VALUE;
		}
		if (cr == er && cc == ec) {
			if (dungeon[cr][cc] <= 0) {
				return 1 - dungeon[cr][cc];
			}
			return 1;
		}
		if (storage[cr][cc] != 0) {
			return storage[cr][cc];
		}
		int moveRight = knightMinHealthTopDownDP(dungeon, cr, cc + 1, er, ec, storage);
		int moveBottom = knightMinHealthTopDownDP(dungeon, cr + 1, cc, er, ec, storage);

		int minPath = Math.min(moveRight, moveBottom);

		int healthAlreadyHave = minPath - dungeon[cr][cc];

		int minHealthRequired;

		if (healthAlreadyHave > 0) {
			minHealthRequired = healthAlreadyHave;
		} else {
			minHealthRequired = 1;
		}

		storage[cr][cc] = minHealthRequired;

		return minHealthRequired;
	}

	public static int knightMinHealthBottomUpDP(int[][] dungeon) {
		int n = dungeon.length;
		int[][] storage = new int[n + 1][n + 1];

		for (int row = n; row >= 0; row--) {

			for (int col = storage[row].length - 1; col >= 0; col--) {

				// base cases
				if (row == storage.length - 1 || col == storage[row].length - 1) {
					storage[row][col] = Integer.MAX_VALUE;

				} else if (row == storage.length - 2 && col == storage[row].length - 2) {
					int val = 1;
					if (dungeon[row][col] < 0) {
						val = -dungeon[row][col] + 1;
					}
					storage[row][col] = val;

				} else {
					// logic from top down

					int moveRight = storage[row][col + 1];
					int moveBottom = storage[row + 1][col];

					int minPath = Math.min(moveRight, moveBottom);

					int healthAlreadyHave = minPath - dungeon[row][col];

					int minHealthRequired;

					if (healthAlreadyHave > 0) {
						minHealthRequired = healthAlreadyHave;
					} else {
						minHealthRequired = 1;
					}

					storage[row][col] = minHealthRequired;
				}
			}
		}

		return storage[0][0];
	}
}
