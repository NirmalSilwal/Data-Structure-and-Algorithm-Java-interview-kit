package section19_DynamicProgramming;

public class WildcardPatternMatching {

	public static void main(String[] args) {

		String input = "baaabab";
		String pattern = "*****ba*****ab";

		System.out.println(patternMatchRecursion(input, "ba*a?"));
		System.out.println(patternMatchRecursion(input, "baaa?ab"));
		System.out.println(patternMatchRecursion(input, "a*ab"));
		System.out.println(patternMatchRecursion("abcd", "****"));

		System.out.println("\nrecursion, without substring method..");
		System.out.println(patternMatchRecursion(input, pattern));

		System.out.println("\nusing virtual index..");
		System.out.println(patternMatchRecursionVid(input, pattern, 0, 0));

		System.out.println("\nusing top-down DP...");
		int[][] storage = new int[input.length()][pattern.length()];
		System.out.println(patternMatchTopDownDP(input, pattern, 0, 0, storage));

		System.out.println("\nusing bottom-up...");
		System.out.println(patternMatchBottomUpDP(input, pattern));

		System.out.println("\ntesting large input...");
		String largeInput = "adbasodinafsladhapsdnfaaiqqwperyo";
		String largePattern = "a?**************************************************";
		int[][] storage2 = new int[largeInput.length()][largePattern.length()];

		// System.out.println(patternMatchRecursion(largeInput, largePattern));
		System.out.println(patternMatchTopDownDP(largeInput, largePattern, 0, 0, storage2));
		System.out.println(patternMatchBottomUpDP(largeInput, largePattern));

	}

	// O(2^(M+N)) Time, M is src length, N is pattern length
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

	/*
	 * As substring() operation is costly we should use virtual index to break
	 * String
	 */
	public static boolean patternMatchRecursionVid(String src, String pattern, int vidxSrc, int vidxPat) {
		// base cases
		if (src.length() == vidxSrc && pattern.length() == vidxPat) {
			return true;
		}
		if (src.length() != vidxSrc && pattern.length() == vidxPat) {
			return false;
		}
		if (src.length() == vidxSrc && pattern.length() != vidxPat) {
			for (int chidx = vidxPat; chidx < pattern.length(); chidx++) {
				if (pattern.charAt(chidx) != '*')
					return false;
			}
			return true;
		}
		char currSrc = src.charAt(vidxSrc);
		char currPat = pattern.charAt(vidxPat);

		boolean ans;

		if (currSrc == currPat || currPat == '?') {
			ans = patternMatchRecursionVid(src, pattern, vidxSrc + 1, vidxPat + 1);
		} else if (currPat == '*') {
			boolean blankCharMatch = patternMatchRecursionVid(src, pattern, vidxSrc, vidxPat + 1);
			boolean multipleCharMatch = patternMatchRecursionVid(src, pattern, vidxSrc + 1, vidxPat);

			ans = blankCharMatch || multipleCharMatch;
		} else {
			ans = false;
		}

		return ans;
	}

	public static boolean patternMatchTopDownDP(String src, String pattern, int vidxSrc, int vidxPat, int[][] storage) {
		// base cases
		if (src.length() == vidxSrc && pattern.length() == vidxPat) {
			return true;
		}
		if (src.length() != vidxSrc && pattern.length() == vidxPat) {
			return false;
		}
		if (src.length() == vidxSrc && pattern.length() != vidxPat) {
			for (int chidx = vidxPat; chidx < pattern.length(); chidx++) {
				if (pattern.charAt(chidx) != '*')
					return false;
			}
			return true;
		}

		/*
		 * 0 in storage denotes result is not yet computed.
		 * 
		 * 1 indicate false in storage
		 * 
		 * 2 indicate true in storage
		 */
		if (storage[vidxSrc][vidxPat] != 0) { // re-use
			return (storage[vidxSrc][vidxPat] == 1) ? false : true;
		}
		char currSrc = src.charAt(vidxSrc);
		char currPat = pattern.charAt(vidxPat);

		boolean ans;

		if (currSrc == currPat || currPat == '?') {
			ans = patternMatchTopDownDP(src, pattern, vidxSrc + 1, vidxPat + 1, storage);
		} else if (currPat == '*') {
			boolean blankCharMatch = patternMatchTopDownDP(src, pattern, vidxSrc, vidxPat + 1, storage);
			boolean multipleCharMatch = patternMatchTopDownDP(src, pattern, vidxSrc + 1, vidxPat, storage);

			ans = blankCharMatch || multipleCharMatch;
		} else {
			ans = false;
		}
		// store
		storage[vidxSrc][vidxPat] = (ans ? 2 : 1);

		return ans;
	}

	// O(MN) Time | O(MN) Space, M is src length, N is pattern length
	public static boolean patternMatchBottomUpDP(String src, String pattern) {

		boolean[][] storage = new boolean[src.length() + 1][pattern.length() + 1];
		// base case
		storage[src.length()][pattern.length()] = true;

		for (int row = src.length(); row >= 0; row--) {

			for (int col = pattern.length() - 1; col >= 0; col--) {

				if (row == src.length()) {
					if (pattern.charAt(col) == '*') {
						storage[row][col] = storage[row][col + 1];
					} else {
						storage[row][col] = false;
					}
				} else {
					char currSrc = src.charAt(row);
					char currPat = pattern.charAt(col);

					boolean ans;

					if (currSrc == currPat || currPat == '?') {
						ans = storage[row + 1][col + 1];
					} else if (currPat == '*') {
						boolean blankCharMatch = storage[row][col + 1];
						boolean multipleCharMatch = storage[row + 1][col];

						ans = blankCharMatch || multipleCharMatch;
					} else {
						ans = false;
					}

					storage[row][col] = ans;
				}
			}
		}

		return storage[0][0];
	}
}
