package section7_GetRecursion;

import java.util.ArrayList;

public class MazePathArrayList {

	public static void main(String[] args) {
		int currentRow = 0, currentCol = 0;
		int endRow = 2, endCol = 2;
		ArrayList<String> result = getMazePath(currentRow, currentCol, endRow, endCol);
		System.out.println(result);
	}

	static ArrayList<String> getMazePath(int cr, int cc, int er, int ec) {

		if (cr > er || cc > ec) {
			ArrayList<String> baseResult = new ArrayList<String>();
			return baseResult;
		}
		if (cr == er && cc == ec) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}

		ArrayList<String> horizontal = getMazePath(cr, cc + 1, er, ec);

		ArrayList<String> myResult = new ArrayList<String>();

		for (String hrpath : horizontal) {
			myResult.add('H' + hrpath);
		}
		ArrayList<String> vertical = getMazePath(cr + 1, cc, er, ec);

		for (String vpath : vertical) {
			myResult.add('V' + vpath);
		}

		return myResult;
	}
}
