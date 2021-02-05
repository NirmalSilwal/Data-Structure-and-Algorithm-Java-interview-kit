package section7_GetRecursion;

import java.util.ArrayList;

public class SubsequencesArrayList {

	public static void main(String[] args) {
		System.out.println(getSubsequences("abc"));
	}

	static ArrayList<String> getSubsequences(String s) {
		ArrayList<String> ans = new ArrayList<String>();
		String result = "";
		ArrayList<String> subseq = getSS(s, result, ans);
		return subseq;
	}

	private static ArrayList<String> getSS(String s, String result, ArrayList<String> ans) {

		if (s.length() == 0) {
			ans.add(result);
			return ans;
		}

		char first = s.charAt(0);
		String rest = s.substring(1);

		ans = getSS(rest, result, ans);

		ans = getSS(rest, result + first, ans);

		return ans;
	}
}
