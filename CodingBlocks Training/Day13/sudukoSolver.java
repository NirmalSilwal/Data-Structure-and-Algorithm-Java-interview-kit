package Lecture13;

public class sudukoSolver {

	public static void main(String[] args) {

		int[][] board = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
							{ 6, 0, 0, 1, 9, 5, 0, 0, 0 }, 
							{ 0, 9, 8, 0, 0, 0, 0, 6, 0 },
							{ 8, 0, 0, 0, 6, 0, 0, 0, 3 }, 
							{ 4, 0, 0, 8, 0, 3, 0, 0, 1 },
							{ 7, 0, 0, 0, 2, 0, 0, 0, 6 }, 
							{ 0, 6, 0, 0, 0, 0, 2, 8, 0 },
							{ 0, 0, 0, 4, 1, 9, 0, 0, 5 }, 
							{ 0, 0, 0, 0, 8, 0, 0, 7, 9 } };
		// here 0 in board indicates, position to be filled to solve the game

		int boardLength = board.length;

		boolean[][] fixedCells = new boolean[boardLength][boardLength];
		setFixedCells(board, fixedCells);

		int row = 0, col = 0;
		boolean result = sudukoSolvers(board, fixedCells, row, col, boardLength);

		if (result) {
			printBoard(board);
		} else {
			System.out.println("can't solve this board");
		}
	}

	public static void setFixedCells(int[][] board, boolean[][] fixedCells) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				if (board[row][col] != 0) {
					fixedCells[row][col] = true;
				}
			}
		}
	}

	public static boolean sudukoSolvers(int[][] board, boolean[][] fixedCell,
			int row, int col, int boardLength) {

		if (col == boardLength) {
			return sudukoSolvers(board, fixedCell, row + 1, 0, boardLength);
		}
		if (row == boardLength) {
			return true;
		}

		if (fixedCell[row][col]) {
			return sudukoSolvers(board, fixedCell, row, col + 1, boardLength);
		}
		for (int num = 1; num <= boardLength; num++) {
			boolean isSafe = isSafetoPlace(board, row, col, num, boardLength);
			if (isSafe) {
				board[row][col] = num;
				boolean solveRestAnswer = sudukoSolvers(board, fixedCell, row,
						col + 1, boardLength);
				if (solveRestAnswer) {
					return true;
				} else {
					board[row][col] = 0; // backtrack to last state
				}
			}
		}

		return false;
	}

	public static boolean isSafetoPlace(int[][] board, int row, int col,
			int num, int boardLength) {

		for (int i = 0; i < boardLength; i++) {
			if (board[i][col] == num) { // column check
				return false;
			}
			if (board[row][i] == num) { // row check
				return false;
			}
		}
		// check grid
		int sqrtN = (int) Math.sqrt(boardLength);
		int startRow = (row / sqrtN) * sqrtN;
		int startCol = (col / sqrtN) * sqrtN;

		for (int i = startRow; i < startRow + sqrtN; i++) {
			for (int j = startCol; j < startCol + sqrtN; j++) {
				if (board[i][j] == num) {
					return false;
				}
			}
		}

		return true;
	}

	public static void printBoard(int[][] board) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				System.out.print(board[row][col] + " ");
			}
			System.out.println();
		}
	}
}


/*
output:
5 3 4 6 7 8 9 1 2 
6 7 2 1 9 5 3 4 8 
1 9 8 3 4 2 5 6 7 
8 5 9 7 6 1 4 2 3 
4 2 6 8 5 3 7 9 1 
7 1 3 9 2 4 8 5 6 
9 6 1 5 3 7 2 8 4 
2 8 7 4 1 9 6 3 5 
3 4 5 2 8 6 1 7 9 
*/