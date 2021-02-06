package section8_PrintRecursion;

public class CountNQueens {

	public static void main(String[] args) {

		int N = 4;
		boolean[][] board = new boolean[N][N];
		int initialRow = 0;

		int count = countNQueens(board, initialRow);
		System.out.println(count); // 2
	}

	static int countNQueens(boolean[][] board, int row) {
		if (row == board.length) {
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[row].length; col++) {
			if (isSafeToPlace(board, row, col)) {
				board[row][col] = true;
				count = count + countNQueens(board, row + 1);

				// backtracking, reseting previous position
				board[row][col] = false;
			}
		}

		return count;
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
