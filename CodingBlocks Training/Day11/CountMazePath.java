package Lecture11;

public class CountMazePath {

	public static void main(String[] args) {

		int endrow = 2, endcol = 2, currentrow = 0, currentcol = 0;
		String result = "";

		System.out
				.println("total path is: "
						+ countGridPath(endrow, endcol, currentrow, currentcol,
								result));
	}

	public static int countGridPath(int er, int ec, int cr, int cc,
			String result) {

		if (cr > er | cc > ec) {
			return 0;
		}
		if (cr == er && cc == ec) {
			return 1;
		}
		int total = 0;
		total = total + countGridPath(er, ec, cr, cc + 1, result + "H");
		total = total + countGridPath(er, ec, cr + 1, cc, result + "V");

		return total;
	}
}
