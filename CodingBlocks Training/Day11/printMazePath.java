package Lecture11;

public class printMazePath {

	public static void main(String[] args) {

		int endrow = 2, endcol = 2, currentrow = 0, currentcol = 0;
		String result = "";

		printGrid(endrow, endcol, currentrow, currentcol, result);
	}

	public static void printGrid(int er, int ec, int cr, int cc, String result) {

		if (cr > er | cc > ec) {
			return;
		}
		if (cr == er && cc == ec) {
			System.out.println(result);
			return;
		}

		printGrid(er, ec, cr, cc + 1, result + "H");
		printGrid(er, ec, cr + 1, cc, result + "V");
	}
}
