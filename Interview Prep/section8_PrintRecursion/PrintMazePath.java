package section8_PrintRecursion;

public class PrintMazePath {

	public static void main(String[] args) {
		int currentRow = 0, currentCol = 0;
		int endRow = 2, endCol = 2;
		String ans = "";
		printMazepath(currentRow, currentCol, endRow, endCol, ans);
	}

	static void printMazepath(int cr, int cc, int er, int ec, String ans) {

		if (cr > er || cc > ec)
			return;
		
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		printMazepath(cr, cc + 1, er, ec, ans + "H");

		printMazepath(cr + 1, cc, er, ec, ans + "V");

	}
}

/* output:
HHVV
HVHV
HVVH
VHHV
VHVH
VVHH
*/