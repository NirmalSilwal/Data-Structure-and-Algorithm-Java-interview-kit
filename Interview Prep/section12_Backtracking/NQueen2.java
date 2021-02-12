package section12_Backtracking;

public class NQueen2 {

	static int count;

	public static void main(String[] args) {
		nQueenCombinations(new boolean[4][4], 0, 0, 4, " ");
	}

	static void nQueenCombinations(boolean[][] board, int row, int queensPlaced, int queens, String ans) {

		if (queensPlaced == queens) {
			System.out.println(++count + ". " + ans);
			return;
		}
		if (row == board.length)
			return;

		for (int col = 0; col < board[0].length; col++) {
			// place queen
			board[row][col] = true;

			nQueenCombinations(board, row + 1, queensPlaced + 1, queens, ans + row + col + " ");

			// backtrack
			board[row][col] = false;
		}
	}
}
