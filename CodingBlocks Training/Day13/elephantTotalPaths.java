package Lecture13;

public class elephantTotalPaths {

	public static void main(String[] args) {

		int endRow = 2, endCol = 2, currentRow = 0, currentCol = 0;
		System.out.println(elephantWays(endRow, endCol, currentRow, currentCol)); // 14
		System.out.println(elephantWays(1, 1, 0, 0)); // 2

	}

	public static int elephantWays(int er, int ec, int cr, int cc) {

		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}

		int total = 0;
		for (int i = cc; i < ec; i++) {
			total = total + elephantWays(er, ec, cr, i + 1);
		}

		for (int j = cr; j < er; j++) {
			total = total + elephantWays(er, ec, j + 1, cc);
		}

		return total;
	}

}
