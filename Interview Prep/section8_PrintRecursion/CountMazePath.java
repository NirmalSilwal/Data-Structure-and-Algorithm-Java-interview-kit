package section8_PrintRecursion;

public class CountMazePath {

	public static void main(String[] args) {
		int currentRow = 0, currentCol = 0;
		int endRow = 2, endCol = 2;

		int count = countMazepath(currentRow, currentCol, endRow, endCol);
		System.out.println(count);
	}

	static int countMazepath(int cr, int cc, int er, int ec) {

		if (cr > er || cc > ec)
			return 0;

		if (cr == er && cc == ec)
			return 1;

		int count = 0;
		// traversing horizontally
		count = count + countMazepath(cr, cc + 1, er, ec);

		// traversing vertically
		count = count + countMazepath(cr + 1, cc, er, ec);

		return count;
	}
}
