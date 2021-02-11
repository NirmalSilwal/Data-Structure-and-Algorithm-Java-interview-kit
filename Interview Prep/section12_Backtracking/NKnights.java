package section12_Backtracking;

public class NKnights {

	static int count;

	public static void main(String[] args) {

		int N = 3;
		boolean[][] board = new boolean[N][N];
		int row = 0, col = 0, placedKnights = 0;
		String ans = "";

		nKnights(board, row, col, placedKnights, ans);
	}

	static void nKnights(boolean[][] board, int row, int col, int placedKnights, String ans) {

		if (placedKnights == board.length) {
			System.out.println(++count + ". " + ans);
			return;
		}

		if (col == board.length) {
			row++;
			col = 0;
		}

		if (row == board.length)
			return;

		// place knight if safe
		if (isItSafeToPlaceKnight(board, row, col)) {
			board[row][col] = true;
			nKnights(board, row, col + 1, placedKnights + 1, ans + row + col + " ");
			board[row][col] = false;
		}

		// do not place knight in current row,col
		nKnights(board, row, col + 1, placedKnights, ans);

	}

	private static boolean isItSafeToPlaceKnight(boolean[][] board, int row, int col) {

		int[] dangerRows = { -1, -2, -2, -1 };
		int[] dangerCols = { -2, -1, 1, 2 };

		for (int i = 0; i < 4; i++) {
			int currentRow = row + dangerRows[i];
			int currentCol = col + dangerCols[i];

			if (currentRow >= 0 && currentRow < board.length && currentCol >= 0 && currentCol < board.length) {
				if (board[currentRow][currentCol])
					return false;
			}
		}

		return true;
	}
}

/* output:

1. 00 01 02 
2. 00 01 10 
3. 00 01 11 
4. 00 02 11 
5. 00 02 20 
6. 00 02 22 
7. 00 10 11 
8. 00 10 20 
9. 00 11 20 
10. 00 11 22 
11. 00 20 22 
12. 01 02 11 
13. 01 02 12 
14. 01 10 11 
15. 01 10 12 
16. 01 10 21 
17. 01 11 12 
18. 01 11 21 
19. 01 12 21 
20. 02 11 12 
21. 02 11 20 
22. 02 11 22 
23. 02 12 22 
24. 02 20 22 
25. 10 11 12 
26. 10 11 20 
27. 10 11 21 
28. 10 12 21 
29. 10 20 21 
30. 11 12 21 
31. 11 12 22 
32. 11 20 21 
33. 11 20 22 
34. 11 21 22 
35. 12 21 22 
36. 20 21 22 

*/
