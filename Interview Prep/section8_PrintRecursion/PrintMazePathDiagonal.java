package section8_PrintRecursion;

public class PrintMazePathDiagonal {

	public static void main(String[] args) {
		int currentRow = 0, currentCol = 0;
		int endRow = 2, endCol = 2;
		String ans = "";
		printMazepathDiagonal(currentRow, currentCol, endRow, endCol, ans);
	}

	static void printMazepathDiagonal(int cr, int cc, int er, int ec, String ans) {

		if (cr > er || cc > ec)
			return;

		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		printMazepathDiagonal(cr, cc + 1, er, ec, ans + "H");
		printMazepathDiagonal(cr + 1, cc, er, ec, ans + "V");
		printMazepathDiagonal(cr + 1, cc + 1, er, ec, ans + "D");

	}
}

/* output:
HHVV
HVHV
HVVH
HVD
HDV
VHHV
VHVH
VHD
VVHH
VDH
DHV
DVH
DD
*/