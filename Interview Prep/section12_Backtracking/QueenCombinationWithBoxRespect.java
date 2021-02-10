package section12_Backtracking;

public class QueenCombinationWithBoxRespect {

	public static void main(String[] args) {

		boolean[] board = new boolean[4];
		int queens = 2;
		int queenPlacedSoFar = 0;
		String ans = "";
		int currentBox = 0;

		queenCombinationBox(board, currentBox, queens, queenPlacedSoFar, ans);

	}

	static void queenCombinationBox(boolean[] board, int currBox, int q, int placed, String ans) {

		if (q == placed) {
			System.out.println(ans);
			return;
		}
		if (currBox > board.length - 1)
			return;

		// placing the queen
		board[currBox] = true;
		queenCombinationBox(board, currBox + 1, q, placed + 1, ans + "b" + currBox);

		// not placing the queen
		board[currBox] = false;
		queenCombinationBox(board, currBox + 1, q, placed, ans);

	}
}

/* output:

b0b1
b0b2
b0b3
b1b2
b1b3
b2b3

 */