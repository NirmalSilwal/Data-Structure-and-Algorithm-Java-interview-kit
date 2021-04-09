package section19_DynamicProgramming;

/*
 * Given a string s, find the longest palindromic subsequence's length in s. 
 */

public class LongestPalindromicSubsequence {

	public static void main(String[] args) {
		// String str = "acdcga"; // 5
		// String str = "cbbd"; // 2
		// String str = "bbbab"; // 4
		String str = "askdfdaoshdwqeyrqwpeawqtewuroiuaSBAadisidhqpweus"; // 19

		int si = 0, ei = str.length() - 1;

		// System.out.println(longPalindromicSubseqRec(str, si, ei));

		int[][] storage = new int[str.length()][str.length()];

		System.out.println(LPSTopDownDP(str, si, ei, storage));
		System.out.println(LPSBottomUpDP(str));
	}

	public static int longPalindromicSubseqRec(String str, int si, int ei) {
		if (ei < si)
			return 0;

		if (si == ei) {
			return 1;
		}
		int start = str.charAt(si);
		int end = str.charAt(ei);

		int palindromicLen = 0;

		if (start == end) {
			palindromicLen = 2 + longPalindromicSubseqRec(str, si + 1, ei - 1);
		} else {
			int removeFirst = longPalindromicSubseqRec(str, si + 1, ei);
			int removeLast = longPalindromicSubseqRec(str, si, ei - 1);

			int ans = Math.max(removeFirst, removeLast);

			palindromicLen += ans;
		}

		return palindromicLen;
	}

	public static int LPSTopDownDP(String str, int si, int ei, int[][] storage) {
		if (ei < si)
			return 0;
		if (si == ei) {
			return 1;
		}

		if (storage[si][ei] != 0) { // reuse
			return storage[si][ei];
		}
		int palindromicLen = 0;

		if (str.charAt(si) == str.charAt(ei)) {
			palindromicLen = 2 + LPSTopDownDP(str, si + 1, ei - 1, storage);
		} else {
			int removeFirst = LPSTopDownDP(str, si + 1, ei, storage);
			int removeLast = LPSTopDownDP(str, si, ei - 1, storage);

			palindromicLen = Math.max(removeFirst, removeLast);
		}

		storage[si][ei] = palindromicLen;

		return palindromicLen;
	}

	public static int LPSBottomUpDP(String str) {
		int n = str.length();

		int[][] storage = new int[n][n];

		// for (int i = 0; i < storage.length; i++) {
		// Arrays.fill(storage[i], 1);
		// }
		// for (int row = n - 2; row >= 0; row--) {
		// for (int col = row + 1; col < n; col++) {

		for (int slide = 0; slide <= n - 1; slide++) {

			for (int si = 0; si <= n - slide - 1; si++) {

				int ei = slide + si;

				// logic from top down
				if (si == ei) {
					storage[si][ei] = 1;
				} else {
					int palindromicLen = 0;

					if (str.charAt(si) == str.charAt(ei)) {
						palindromicLen = 2 + storage[si + 1][ei - 1];
					} else {
						int removeFirst = storage[si + 1][ei];
						int removeLast = storage[si][ei - 1];
						palindromicLen = Math.max(removeFirst, removeLast);
					}

					storage[si][ei] = palindromicLen;
				}
			}
		}
		return storage[0][n - 1];
	}
}
