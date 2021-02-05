package section7_GetRecursion;

import java.util.ArrayList;

public class Subsequences2 {

	public static void main(String[] args) {
		System.out.println(getSubsequences("abc"));
	}

	static ArrayList<String> getSubsequences(String s) {
		if (s.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}

		char first = s.charAt(0);
		String restStr = s.substring(1);
		ArrayList<String> currResult = new ArrayList<String>();
		ArrayList<String> recResult = getSubsequences(restStr);

		for (int i = 0; i < recResult.size(); i++) {
			currResult.add(recResult.get(i));
			currResult.add(first + recResult.get(i));
		}

		return currResult;
	}
}
