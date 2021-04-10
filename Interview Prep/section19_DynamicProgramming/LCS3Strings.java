package section19_DynamicProgramming;

public class LCS3Strings {

	public static void main(String[] args) {

		// String s1 = "abcgd", s2 = "bcgad", s3 = "ad"; // 2
		String s1 = "abcd", s2 = "agcfd", s3 = "ad"; // 2
		// String s1 = "geeks", s2 = "geeksfor", s3 = "geeksforgeeks"; // 5
		// String s1 = "abc", s2 = "agcfd", s3 = "aeg"; // 1
		// String s1 = "abcausdhbvaauhdpqweasdgd", s2 = "qwaeohfdasasdfqpaew", s3 = "bnprsdhfasoihqd"; // 2
		// String s1 = "abeti", s2 = "btje", s3 = "tjjabt";

		System.out.println(lcs3StrRecursion(s1, s2, s3, 0, 0, 0));

		// top down
		int[][][] storage = new int[s1.length()][s2.length()][s3.length()];
		// proper initializing storage
		for (int i = 0; i < storage.length; i++) {
			for (int j = 0; j < storage[i].length; j++) {
				for (int k = 0; k < storage[i][j].length; k++) {
					storage[i][j][k] = -1;
				}
			}
		}

		System.out.println(lcs3StrTopDownDP(s1, s2, s3, 0, 0, 0, storage));
		// bottom up
		System.out.println(lcs3StrBottomUpDP(s1, s2, s3));
	}

	public static int lcs3StrRecursion(String s1, String s2, String s3, int vidx1, int vidx2, int vidx3) {

		if (vidx1 == s1.length() || vidx2 == s2.length() || vidx3 == s3.length()) {
			return 0;
		}
		char ch1 = s1.charAt(vidx1);
		char ch2 = s2.charAt(vidx2);
		char ch3 = s3.charAt(vidx3);

		int lcsLen = 0;
		if (ch1 == ch2 && ch2 == ch3) {
			lcsLen = 1 + lcs3StrRecursion(s1, s2, s3, vidx1 + 1, vidx2 + 1, vidx3 + 1);
		} else {
			int option1 = lcs3StrRecursion(s1, s2, s3, vidx1 + 1, vidx2, vidx3);
			int option2 = lcs3StrRecursion(s1, s2, s3, vidx1, vidx2 + 1, vidx3);
			int option3 = lcs3StrRecursion(s1, s2, s3, vidx1, vidx2, vidx3 + 1);

			lcsLen = Math.max(option1, Math.max(option2, option3));
		}

		return lcsLen;
	}

	public static int lcs3StrTopDownDP(String s1, String s2, String s3, int vidx1, int vidx2, int vidx3,
			int[][][] storage) {

		if (vidx1 == s1.length() || vidx2 == s2.length() || vidx3 == s3.length()) {
			return 0;
		}

		if (storage[vidx1][vidx2][vidx3] != -1) {
			return storage[vidx1][vidx2][vidx3];
		}
		char ch1 = s1.charAt(vidx1);
		char ch2 = s2.charAt(vidx2);
		char ch3 = s3.charAt(vidx3);

		int lcsLen = 0;
		if (ch1 == ch2 && ch2 == ch3) {
			lcsLen = 1 + lcs3StrTopDownDP(s1, s2, s3, vidx1 + 1, vidx2 + 1, vidx3 + 1, storage);
		} else {
			int option1 = lcs3StrTopDownDP(s1, s2, s3, vidx1 + 1, vidx2, vidx3, storage);
			int option2 = lcs3StrTopDownDP(s1, s2, s3, vidx1, vidx2 + 1, vidx3, storage);
			int option3 = lcs3StrTopDownDP(s1, s2, s3, vidx1, vidx2, vidx3 + 1, storage);

			lcsLen = Math.max(option1, Math.max(option2, option3));
		}

		storage[vidx1][vidx2][vidx3] = lcsLen;

		return lcsLen;
	}

	public static int lcs3StrBottomUpDP(String s1, String s2, String s3) {
		int one = s1.length(), two = s2.length(), three = s3.length();
		int[][][] storage = new int[one + 1][two + 1][three + 1];

		for (int block = one - 1; block >= 0; block--) {

			for (int row = two - 1; row >= 0; row--) {

				for (int col = three - 1; col >= 0; col--) {

					// logic from top down
					char ch1 = s1.charAt(block);
					char ch2 = s2.charAt(row);
					char ch3 = s3.charAt(col);

					int lcsLen = 0;
					if (ch1 == ch2 && ch2 == ch3) {
						lcsLen = 1 + storage[block + 1][row + 1][col + 1];
					} else {
						int option1 = storage[block + 1][row][col];
						int option2 = storage[block][row + 1][col];
						int option3 = storage[block][row][col + 1];

						lcsLen = Math.max(option1, Math.max(option2, option3));
					}

					storage[block][row][col] = lcsLen;
				}
			}
		}
		return storage[0][0][0];
	}
}
