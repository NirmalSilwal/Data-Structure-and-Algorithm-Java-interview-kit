package section12_Backtracking;

public class NQueenGeneral {

	public static void main(String[] args) {

		int N = 4;
		boolean[][] board = new boolean[N][N];
		int row = 0, col = 0, placedQueens = 0;
		String ans = "";

		nQueens(board, row, col, placedQueens, ans);
	}

	static void nQueens(boolean[][] board, int row, int col, int placedQueens, String ans) {

		if (placedQueens == board.length) {
			System.out.println(ans);
			return;
		}

		if (col == board.length) {
			row++;
			col = 0;
		}

		if (row == board.length)
			return;

		// place queen if safe
		if (isItSafeToPlaceQueen(board, row, col)) {
			board[row][col] = true;
			nQueens(board, row + 1, 0, placedQueens + 1, ans + row + col + " ");
			board[row][col] = false;
		}

		// do not place queen
		nQueens(board, row, col + 1, placedQueens, ans);

	}

	private static boolean isItSafeToPlaceQueen(boolean[][] board, int row, int col) {

		// check vertical upward
		for (int i = row; i >= 0; i--) {
			if (board[i][col])
				return false;
		}

		// check diagonal left
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j])
				return false;
		}

		// check diagonal right
		for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j])
				return false;
		}

		return true;
	}
}

/* output:

01 13 20 32 
02 10 23 31 

*/
