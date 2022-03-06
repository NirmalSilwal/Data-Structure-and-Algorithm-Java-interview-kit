package LeetcodeDaily.March2022;

public class Day2IsSubsequenceLC392 {

	/*
	 * Input: s = "abc", t = "ahbgdc" Output: true
	 */

	public static boolean isSubsequence(String s, String t) {

		int lastIndex = 0, matchcharcount = 0;
		int i = 0;

		for (i = 0; i < s.length(); i++) {

			char currs = s.charAt(i);

			if (lastIndex < t.length()) {
				for (int j = lastIndex; j < t.length(); j++) {

					char currt = t.charAt(j);

					if (currs == currt) {
						matchcharcount++;
						lastIndex = j + 1;
						break;
					}
				}
			}
		}

		if (i == s.length() && matchcharcount == s.length())
			return true;

		return false;
	}

	public static void main(String[] args) {

		String s = "abc", t = "ahbgdc";
		System.out.println(isSubsequence(s, t));

		System.out.println(isSubsequence("axc", "ahbgdc"));

	}
}
