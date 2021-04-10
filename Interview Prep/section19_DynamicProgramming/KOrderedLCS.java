package section19_DynamicProgramming;

import java.util.Arrays;

public class KOrderedLCS {

	public static void main(String[] args) {

		String s1 = "abcd", s2 = "agcfde"; // 4
		// String s1 = "abc", s2 = "abcd";
		// String s1 = "abchd", s2 = "agcfd";
		// String s1 = "qwerqwrf", s2 = "aehfdaz";
		// String s1 = "abcd", s2 = "brdce";
		// String s1 = "sufdnsdgpa", s2="qiwohdfgefqa";

		// String s1 = "aqieowf lasansd candv qpoizion'";
		// String s2 = "soehgpwz pqoiw qomashfklvifa";

		int K = 2; // can change at most k character to make subsequences

		System.out.println(kOrderedLCSRecursion(s1, s2, K, 0, 0));

		int[][][] storage = new int[K + 1][s1.length()][s2.length()];
		for (int i = 0; i < storage.length; i++) {
			for (int j = 0; j < storage[0].length; j++) {
				Arrays.fill(storage[i][j], -1);
			}
		}
		// display(storage);
		System.out.println(kOrderedLCSTopDownDP(s1, s2, K, 0, 0, storage));

		System.out.println(kOrderedLCSBottomUpDP(s1, s2, K));
	}

	public static int kOrderedLCSRecursion(String s1, String s2, int k, int vidx1, int vidx2) {

		if (vidx1 == s1.length() || vidx2 == s2.length())
			return 0;

		char ch1 = s1.charAt(vidx1);
		char ch2 = s2.charAt(vidx2);

		int lcsLen = 0;
		if (ch1 == ch2) {
			lcsLen = 1 + kOrderedLCSRecursion(s1, s2, k, vidx1 + 1, vidx2 + 1);
		} else {
			int factor1 = kOrderedLCSRecursion(s1, s2, k, vidx1, vidx2 + 1);
			int factor2 = kOrderedLCSRecursion(s1, s2, k, vidx1 + 1, vidx2);

			int factor3 = 0;
			if (k >= 1)
				factor3 = 1 + kOrderedLCSRecursion(s1, s2, k - 1, vidx1 + 1, vidx2 + 1);

			lcsLen = Math.max(factor1, Math.max(factor2, factor3));
		}

		return lcsLen;
	}

	public static int kOrderedLCSTopDownDP(String s1, String s2, int k, int vidx1, int vidx2, int[][][] storage) {

		if (vidx1 == s1.length() || vidx2 == s2.length())
			return 0;

		if (storage[k][vidx1][vidx2] != -1) {
			return storage[k][vidx1][vidx2];
		}

		char ch1 = s1.charAt(vidx1);
		char ch2 = s2.charAt(vidx2);

		int lcsLen = 0;
		if (ch1 == ch2) {
			lcsLen = 1 + kOrderedLCSTopDownDP(s1, s2, k, vidx1 + 1, vidx2 + 1, storage);
		} else {
			int factor1 = kOrderedLCSTopDownDP(s1, s2, k, vidx1, vidx2 + 1, storage);
			int factor2 = kOrderedLCSTopDownDP(s1, s2, k, vidx1 + 1, vidx2, storage);

			int factor3 = 0;
			if (k >= 1)
				factor3 = 1 + kOrderedLCSTopDownDP(s1, s2, k - 1, vidx1 + 1, vidx2 + 1, storage);

			lcsLen = Math.max(factor1, Math.max(factor2, factor3));
		}
		storage[k][vidx1][vidx2] = lcsLen;

		return lcsLen;
	}

	public static int kOrderedLCSBottomUpDP(String s1, String s2, int K) {

		int[][][] storage = new int[K + 1][s1.length() + 1][s2.length() + 1];

		for (int kth = 0; kth <= K; kth++) {

			// -2, as by default last row will also be initialized with zero
			for (int row = storage[kth].length - 2; row >= 0; row--) {

				for (int col = storage[kth][row].length - 2; col >= 0; col--) {

					// logic from top down
					int lcsLen = 0;

					if (s1.charAt(row) == s2.charAt(col)) {
						lcsLen = 1 + storage[kth][row + 1][col + 1];
					} else {
						int factor1 = storage[kth][row][col + 1];
						int factor2 = storage[kth][row + 1][col];

						int factor3 = 0;
						if (kth >= 1)
							factor3 = 1 + storage[kth - 1][row + 1][col + 1];

						lcsLen = Math.max(factor1, Math.max(factor2, factor3));
					}
					storage[kth][row][col] = lcsLen;
				}
			}
		}
		return storage[K][0][0];
	}
/*
	private static void display(int[][][] strg) {
		for (int i = 0; i < strg.length; i++) {
			for (int j = 0; j < strg[i].length; j++) {
				// System.out.println(Arrays.toString(strg[i][j]));
				for (int k = 0; k < strg[i][j].length; k++) {
					System.out.print(strg[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}*/
}
