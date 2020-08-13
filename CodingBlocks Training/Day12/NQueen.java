package Lecture12;

public class NQueen {

	public static void main(String[] args) {
		
		int N = 4;
		boolean[][] board = new boolean[N][N];
		int row = 0;
		System.out.println(countNQueens(board, row));	// 2
	}

	public static int countNQueens(boolean[][] board, int row) {
		if (row == board.length) {
			return 1;
		}

		int count = 0;
		for (int col = 0; col < board.length; col++) {
			if (isSafePosition(board, row, col)) {
				board[row][col] = true;
				count = count + countNQueens(board, row + 1);
				board[row][col] = false;
			}
		}
		return count;
	}

	public static boolean isSafePosition(boolean[][] board, int row, int col) {
		// checking column
		for (int i = row; i >= 0; i--) {
			if (board[i][col]) {
				return false;
			}
		}

		// checking left diagonal
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j]) {
				return false;
			}
		}

		// checking right diagonal
		for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j]) {
				return false;
			}
		}

		return true;
	}

	/*
	public static void display(boolean[][] board) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				System.out.print(board[row][col] + " ");
			}
			System.out.println();
		}
	}
	*/
	
}
