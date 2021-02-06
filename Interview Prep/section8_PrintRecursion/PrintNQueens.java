package section8_PrintRecursion;

public class PrintNQueens {

	public static void main(String[] args) {

		int N = 4;
		boolean[][] board = new boolean[N][N];
		int initialRow = 0;
		String result = "";
		printNQueens(board, initialRow, result);
	}

	static void printNQueens(boolean[][] board, int row, String ans) {
		if (row == board.length) {
			System.out.println(ans);
			return;
		}

		for (int col = 0; col < board[row].length; col++) {
			if (isSafeToPlace(board, row, col)) {
				board[row][col] = true;
				printNQueens(board, row + 1, ans + "{" + (row + 1) + "-" + (col + 1) + "}; ");

				// backtracking
				board[row][col] = false;
			}
		}
	}

	static boolean isSafeToPlace(boolean[][] board, int row, int col) {

		// check vertical position to place the Queen
		for (int i = row; i >= 0; i--) {
			if (board[i][col])
				return false;
		}

		// check left diagonals to place the Queen
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j])
				return false;
		}

		// check right diagonals to place the Queen
		for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j])
				return false;
		}

		return true;
	}

}

/*
 * output:
 {1-2}; {2-4}; {3-1}; {4-3}; 
{1-3}; {2-1}; {3-4}; {4-2}; 
*/
