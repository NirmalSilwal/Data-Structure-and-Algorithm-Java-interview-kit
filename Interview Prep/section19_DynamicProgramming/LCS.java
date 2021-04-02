package section19_DynamicProgramming;

public class LCS {

	public static void main(String[] args) {

		// String s1 = "abcd", s2 = "agcfd";
		String s1 = "abcdelahoiahdkfnakusdg", s2 = "asdbfadlujdaifndsai";
		// String s1 = "abcdefghijklmnopqrstuvwxyz", s2 = "ABDEFGHIJKLMNOPQRST";

		int[][] storage = new int[s1.length()][s2.length()];

		/*
		 * properly initializing the storage array to apply DP. if we let the
		 * default value zero in storage, it will be ambiguous as LCS length
		 * could also be zero if there is no common match in given Strings. -1
		 * indicates result is not yet computed
		 */
		for (int row = 0; row < storage.length; row++) {
			for (int col = 0; col < storage[1].length; col++) {
				storage[row][col] = -1;
			}
		}

		// System.out.println(LCSRecursion(s1, s2)); // 3
		// System.out.println(LCSRecursionVirtualIndex(s1, s2, 0, 0));
		System.out.println(LCSTopDownDP(s1, s2, 0, 0, storage));
		System.out.println(LCSBottomUpDP(s1, s2));
	}

	// O(2^(m+n)) Time, time of substring method also | recursion extra space
	public static int LCSRecursion(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0)
			return 0;

		char c1 = s1.charAt(0);
		char c2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int count = 0;
		if (c1 == c2) {
			count = 1 + LCSRecursion(ros1, ros2);
		} else {
			int case1 = LCSRecursion(s1, ros2);
			int case2 = LCSRecursion(ros1, s2);
			count = Math.max(case1, case2);
		}

		return count;
	}

	// without using substring method
	// O(2^(m+n)) Time, m is length of s1, n is length of s2
	public static int LCSRecursionVirtualIndex(String s1, String s2, int vidx1, int vidx2) {

		if (s1.length() == vidx1 || s2.length() == vidx2)
			return 0;

		char c1 = s1.charAt(vidx1);
		char c2 = s2.charAt(vidx2);

		int count = 0;
		if (c1 == c2) {
			count = 1 + LCSRecursionVirtualIndex(s1, s2, vidx1 + 1, vidx2 + 1);
		} else {
			int case1 = LCSRecursionVirtualIndex(s1, s2, vidx1, vidx2 + 1);
			int case2 = LCSRecursionVirtualIndex(s1, s2, vidx1 + 1, vidx2);
			count = Math.max(case1, case2);
		}

		return count;
	}

	// O(mn) Time | O(mn) Space + recursion extra space
	// m is length of s1, n is length of s2
	public static int LCSTopDownDP(String s1, String s2, int vidx1, int vidx2, int[][] storage) {

		if (s1.length() == vidx1 || s2.length() == vidx2)
			return 0;

		if (storage[vidx1][vidx2] != -1) {
			return storage[vidx1][vidx2];
		}

		char c1 = s1.charAt(vidx1);
		char c2 = s2.charAt(vidx2);

		int count = 0;
		if (c1 == c2) {
			count = 1 + LCSTopDownDP(s1, s2, vidx1 + 1, vidx2 + 1, storage);
		} else {
			int case1 = LCSTopDownDP(s1, s2, vidx1, vidx2 + 1, storage);
			int case2 = LCSTopDownDP(s1, s2, vidx1 + 1, vidx2, storage);
			count = Math.max(case1, case2);
		}

		storage[vidx1][vidx2] = count;

		return count;
	}

	// O(mn) Time | O(mn) Space
	public static int LCSBottomUpDP(String s1, String s2) {
		int[][] storage = new int[s1.length() + 1][s2.length() + 1];

		for (int row = s1.length() - 1; row >= 0; row--) {

			for (int col = s2.length() - 1; col >= 0; col--) {

				char ch1 = s1.charAt(row);
				char ch2 = s2.charAt(col);

				if (ch1 == ch2) {
					storage[row][col] = 1 + storage[row + 1][col + 1];
				} else {
					storage[row][col] = Math.max(storage[row][col + 1], storage[row + 1][col]);
				}
			}
		}

		return storage[0][0];
	}
}
