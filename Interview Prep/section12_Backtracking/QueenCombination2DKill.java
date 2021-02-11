package section12_Backtracking;

public class QueenCombination2DKill {

	public static void main(String[] args) {
		int row = 0, col = 0, queens = 3, queenPlaced = 0;
		boolean[][] board = new boolean[3][4];
		String ans = "";
		queenCombination2DKill(board, row, col, queens, queenPlaced, ans);
	}

	static void queenCombination2DKill(boolean[][] board, int row, int col, int queens, int queenPlaced, String ans) {

		if (queens == queenPlaced) {
			System.out.println(ans);
			return;
		}

		if (col == board[row].length) {
			row++;
			col = 0;
		}

		if (row == board.length)
			return;

		// place only if it is safe
		if (isItSafeToPlaceQueen(board, row, col)) {
			board[row][col] = true;
			queenCombination2DKill(board, row, col + 1, queens, queenPlaced + 1, ans + row + col + " ");
		}
		// do not place queen
		board[row][col] = false;
		queenCombination2DKill(board, row, col + 1, queens, queenPlaced, ans);

	}

	// checks if given board position is safe to place the queen so no other
	// queen can kill it
	static boolean isItSafeToPlaceQueen(boolean[][] board, int row, int col) {

		// check vertical upward
		for (int i = row; i >= 0; i--) {
			if (board[i][col])
				return false;
		}

		// check horizontal left
		for (int i = col; i >= 0; i--) {
			if (board[row][i])
				return false;
		}

		// check diagonal left
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j])
				return false;
		}

		// check diagonal right
		for (int i = row, j = col; i >= 0 && j < board[0].length; i--, j++) {
			if (board[i][j])
				return false;
		}

		return true;
	}
}

/* output:
00 13 21 
01 13 20 
02 10 23 
03 10 22 
 */