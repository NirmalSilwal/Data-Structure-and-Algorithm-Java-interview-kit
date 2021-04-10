package section19_DynamicProgramming;

public class LCS3Strings {

	public static void main(String[] args) {

		// String s1 = "abcgd", s2 = "bcgad", s3 = "ad"; // 2
		String s1 = "geeks", s2 = "geeksfor", s3 = "geeksforgeeks"; // 5
		// String s1 = "abcausdhbvaauhdpqweasdgd", s2 = "qwaeohfdasasdfqpaew",
		// s3 = "bnprsdhfasoihqd"; // 2

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
}
