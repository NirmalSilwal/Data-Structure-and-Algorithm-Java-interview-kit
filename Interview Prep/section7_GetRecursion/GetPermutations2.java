package section7_GetRecursion;

import java.util.ArrayList;

public class GetPermutations2 {

	public static void main(String[] args) {
		ArrayList<String> result = getPermutation("abc");
		System.out.println(result);
	}

	static ArrayList<String> getPermutation(String s) {

		if (s.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}

		char current = s.charAt(0);
		String restStr = s.substring(1);

		ArrayList<String> myResult = new ArrayList<String>();

		ArrayList<String> recResult = getPermutation(restStr);

		for (String result : recResult) {

			for (int i = 0; i <= result.length(); i++) {

				String val = result.substring(0, i) + current + result.substring(i);
				myResult.add(val);
			}
		}
		return myResult;
	}
}

/* output:
[abc, bac, bca, acb, cab, cba]
 */