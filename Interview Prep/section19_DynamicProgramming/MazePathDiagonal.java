package section19_DynamicProgramming;

import java.util.Arrays;

public class MazePathDiagonal {

	public static void main(String[] args) {
		int n = 500;
		int cr = 0, cc = 0, er = n, ec = n;

		// System.out.println(mazePathDiagonalRecursive(cr, cc, er, ec));
		System.out.println(mazePathDiagonalTopDownDP(cr, cc, er, ec, new int[n + 1][n + 1]));
		System.out.println(mazePathDiagBottomUpDP(er, ec));
		System.out.println(mazePathDiagBottomUpSpaceEfficient(er, ec));
	}

	// O(3^(er + ec)) Time | recursion extra space
	public static int mazePathDiagonalRecursive(int cr, int cc, int er, int ec) {

		if (cr > er || cc > ec) {
			return 0;
		}

		if (cr == er && cc == ec) {
			return 1;
		}

		int horizontalCount = mazePathDiagonalRecursive(cr, cc + 1, er, ec);
		int verticalCount = mazePathDiagonalRecursive(cr + 1, cc, er, ec);
		int diagonalCount = mazePathDiagonalRecursive(cr + 1, cc + 1, er, ec);

		int totalPaths = horizontalCount + verticalCount + diagonalCount;

		return totalPaths;
	}

	// O(er*ec) Time | O(er*ec) Space + recursion extra space
	public static int mazePathDiagonalTopDownDP(int cr, int cc, int er, int ec, int[][] storage) {

		if (cr > er || cc > ec) {
			return 0;
		}
		if (cr == er && cc == ec) {
			return 1;
		}
		if (storage[cr][cc] != 0) {
			return storage[cr][cc];
		}

		int horizontalCount = mazePathDiagonalTopDownDP(cr, cc + 1, er, ec, storage);
		int verticalCount = mazePathDiagonalTopDownDP(cr + 1, cc, er, ec, storage);
		int diagonalCount = mazePathDiagonalTopDownDP(cr + 1, cc + 1, er, ec, storage);

		int totalPaths = horizontalCount + verticalCount + diagonalCount;

		storage[cr][cc] = totalPaths;

		return totalPaths;
	}

	// O(er*ec) Time | O(er*ec) Space
	public static int mazePathDiagBottomUpDP(int er, int ec) {

		int[][] storage = new int[er + 2][ec + 2];

		for (int row = er; row >= 0; row--) {

			for (int col = ec; col >= 0; col--) {

				if (row == er && col == ec) {
					storage[row][col] = 1;
				} else {
					storage[row][col] = storage[row][col + 1] + storage[row + 1][col] + storage[row + 1][col + 1];
				}
			}
		}

		return storage[0][0];
	}

	// O(er*ec) Time | O(ec) Space
	public static int mazePathDiagBottomUpSpaceEfficient(int er, int ec) {
		int[] storage = new int[ec + 1];

		Arrays.fill(storage, 1);

		for (int slide = er - 1; slide >= 0; slide--) {

			int diagonalvalue = 1;

			for (int col = ec; col >= 0; col--) {

				if (col == ec) {
					storage[col] = 1;
				} else {
					int sum = storage[col] + storage[col + 1] + diagonalvalue;
					diagonalvalue = storage[col];
					storage[col] = sum;
				}
			}
		}

		return storage[0];
	}
}
