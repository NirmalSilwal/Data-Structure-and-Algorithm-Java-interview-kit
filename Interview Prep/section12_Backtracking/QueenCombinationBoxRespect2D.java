package section12_Backtracking;

public class QueenCombinationBoxRespect2D {

	public static void main(String[] args) {
		int row = 0, col = 0, queensPlacedSoFar = 0, totalQueens = 2;
		String ans = "";

		queenCombination2D(new boolean[2][2], row, col, totalQueens, queensPlacedSoFar, ans);
	}

	static void queenCombination2D(boolean[][] board, int row, int col, int queens, int placed, String ans) {

		if (queens == placed) {
			System.out.println(ans);
			return;
		}
		
		if (col == board[row].length) {
			row++;
			col = 0;
		}
		
		if (row == board.length)
			return;

		// place queen
		queenCombination2D(board, row, col + 1, queens, placed + 1, ans + row + col + " ");

		// do not place queen
		queenCombination2D(board, row, col + 1, queens, placed, ans);
	}
}

/* output:
00 01 
00 10 
00 11 
01 10 
01 11 
10 11 
*/
