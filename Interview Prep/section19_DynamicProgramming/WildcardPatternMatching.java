package section19_DynamicProgramming;

public class WildcardPatternMatching {

	public static void main(String[] args) {

		String input = "baaabab";
		String pattern = "*****ba*****ab";

		System.out.println(patternMatchRecursion(input, pattern));

		System.out.println(patternMatchRecursion(input, "ba*a?"));
		System.out.println(patternMatchRecursion(input, "baaa?ab"));
		System.out.println(patternMatchRecursion(input, "a*ab"));

	}

	public static boolean patternMatchRecursion(String src, String pattern) {
		// base cases
		if (src.length() == 0 && pattern.length() == 0) {
			return true;
		}
		if (src.length() != 0 && pattern.length() == 0) {
			return false;
		}
		if (src.length() == 0 && pattern.length() != 0) {
			for (int chidx = 0; chidx < pattern.length(); chidx++) {
				if (pattern.charAt(chidx) != '*')
					return false;
			}
			return true;
		}
		char currSrc = src.charAt(0);
		char currPat = pattern.charAt(0);

		String ros = src.substring(1);
		String rop = pattern.substring(1);

		boolean ans;

		if (currSrc == currPat || currPat == '?') {
			ans = patternMatchRecursion(ros, rop);
		} else if (currPat == '*') {
			boolean blankCharMatch = patternMatchRecursion(src, rop);
			boolean multipleCharMatch = patternMatchRecursion(ros, pattern);

			ans = blankCharMatch || multipleCharMatch;
		} else {
			ans = false;
		}

		return ans;
	}
}
