package section7_GetRecursion;

import java.util.ArrayList;

public class BoardPath {

	public static void main(String[] args) {

		int start = 0;
		int end = 5;
		ArrayList<String> result = getBoardPath(start, end);
		System.out.println(result);
	}

	static ArrayList<String> getBoardPath(int start, int end) {

		if (start == end) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}

		if (start > end) {
			ArrayList<String> baseResult = new ArrayList<String>();
			return baseResult;
		}

		ArrayList<String> myResult = new ArrayList<String>();

		for (int dice = 1; dice <= 6; dice++) {

			ArrayList<String> recResult = getBoardPath(start + dice, end);

			for (String result : recResult) {
				myResult.add(dice + result);
			}
		}
		return myResult;
	}
}
