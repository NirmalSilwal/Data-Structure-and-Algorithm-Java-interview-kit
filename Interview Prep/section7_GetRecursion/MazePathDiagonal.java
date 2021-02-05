package section7_GetRecursion;

import java.util.ArrayList;

public class MazePathDiagonal {

	public static void main(String[] args) {
		
		int startRow = 0, startCol = 0;
		int endRow = 2, endCol = 2;
		
		ArrayList<String> result = getMazePathDiag(startRow, startCol, endRow, endCol);
		
		System.out.println(result);
	}

	static ArrayList<String> getMazePathDiag(int cr, int cc, int er, int ec) {

		if (cr > er || cc > ec) {
			ArrayList<String> baseResult = new ArrayList<String>();
			return baseResult;
		}

		if (cr == er && cc == ec) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}

		ArrayList<String> horizontal = getMazePathDiag(cr, cc + 1, er, ec);

		ArrayList<String> myResult = new ArrayList<String>();

		for (String hres : horizontal) {
			myResult.add("H" + hres);
		}

		ArrayList<String> vertical = getMazePathDiag(cr + 1, cc, er, ec);
		for (String vres : vertical) {
			myResult.add("V" + vres);
		}
		ArrayList<String> diagonal = getMazePathDiag(cr + 1, cc + 1, er, ec);
		for (String dres : diagonal) {
			myResult.add("D" + dres);
		}

		return myResult;
	}
}


/* output:

[HHVV, HVHV, HVVH, HVD, HDV, VHHV, VHVH, VHD, VVHH, VDH, DHV, DVH, DD]

*/