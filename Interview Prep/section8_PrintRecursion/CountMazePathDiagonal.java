package section8_PrintRecursion;

public class CountMazePathDiagonal {

	public static void main(String[] args) {
		int currentRow = 0, currentCol = 0;
		int endRow = 2, endCol = 2;

		int count = countMazepathDiag(currentRow, currentCol, endRow, endCol);
		System.out.println(count); // 13
	}

	static int countMazepathDiag(int cr, int cc, int er, int ec) {

		if (cr > er || cc > ec)
			return 0;

		if (cr == er && cc == ec)
			return 1;

		// horizontal move
		int hcount = countMazepathDiag(cr, cc + 1, er, ec);

		// vertical move
		int vcount = countMazepathDiag(cr + 1, cc, er, ec);

		// diagonal move
		int dcount = countMazepathDiag(cr + 1, cc + 1, er, ec);

		return hcount + vcount + dcount;
	}
}
