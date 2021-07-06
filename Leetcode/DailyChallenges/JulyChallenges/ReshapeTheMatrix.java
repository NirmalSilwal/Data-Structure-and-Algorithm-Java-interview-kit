package DailyChallenges.JulyChallenges;

import java.util.Arrays;

/*
You are given an m x n matrix mat and two integers r and c representing the row number and 
column number of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same 
row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped
matrix; Otherwise, output the original matrix.

Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]

Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]
 */

public class ReshapeTheMatrix {

	// O(rc) Time | O(rc) Space
	public static int[][] matrixReshape(int[][] mat, int r, int c) {

		int totalRows = mat.length, totalCols = mat[0].length;

		// if you can't reshape
		if ((totalRows * totalCols) != (r * c)) {
			return mat;
		} else {
			int[][] output = new int[r][c];
			int currentRow = 0, currentCol = 0; // current row, current column

			for (int row = 0; row < r; row++) {

				for (int col = 0; col < c; col++) {

					output[row][col] = mat[currentRow][currentCol];

					// preparation for next step
					currentCol++;
					if (currentCol == totalCols) {
						currentRow++;
						currentCol = 0;
					}
				}
			}
			return output;
		}
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 2 }, { 3, 4 } };
		int rows = 2, cols = 4;
		int[][] ans = matrixReshape(mat, rows, cols);
		display(ans);

		System.out.println();

		int[][] mat2 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		int rows2 = 5, cols2 = 3;
		int[][] ans2 = matrixReshape(mat2, rows2, cols2);
		display(ans2);
	}

	private static void display(int[][] mat) {
		for (int i = 0; i < mat.length; i++)
			System.out.println(Arrays.toString(mat[i]));
	}
}
