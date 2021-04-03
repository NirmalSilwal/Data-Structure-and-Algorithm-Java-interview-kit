package section19_DynamicProgramming;

public class EditDistanceDP {

	public static void main(String[] args) {
		// String s1 = "abcd", s2 = "agcfd";
		// String s1 = "saturday", s2 = "sunday";

		// System.out.println(editDistanceRecursion(s1, s2)); // 2
		// System.out.println(edRecursionVirtualIndex(s1, s2, 0, 0));

		String s1 = "adsfadfiaosdggahosdfasf", s2 = "asdfhoagihsadasdgihsdoif";

		int[][] storage = new int[s1.length()][s2.length()];

		for (int row = 0; row < storage.length; row++) {
			for (int col = 0; col < storage[1].length; col++) {
				storage[row][col] = -1;
			}
		}

		System.out.println(editDistanceTopDownDP(s1, s2, 0, 0, storage));
		System.out.println(editDistanceBottomUpDP(s1, s2)); // 16
	}

	public static int editDistanceRecursion(String s1, String s2) {
		// base case
		if (s1.length() == 0) {
			return s2.length();
		}
		if (s2.length() == 0) {
			return s1.length();
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int distance = 0;

		if (ch1 == ch2) {
			distance = editDistanceRecursion(ros1, ros2);
		} else {
			int insertion = editDistanceRecursion(ros1, s2);
			int deletion = editDistanceRecursion(s1, ros2);
			int replacement = editDistanceRecursion(ros1, ros2);

			distance = 1 + Math.min(insertion, Math.min(deletion, replacement));
		}

		return distance;
	}

	/*
	 * Recursive approach will fail for large inputs due to exponential time.
	 * 
	 * without using substring method, using virtual index.
	 * 
	 * O(3^(m+n)) Time, m is length of s1, n is length of s2 | recursion space
	 * 
	 */
	public static int edRecursionVirtualIndex(String s1, String s2, int vidx1, int vidx2) {
		// base case
		if (s1.length() == vidx1)
			return s2.length() - vidx2;

		if (s2.length() == vidx2) {
			return s1.length() - vidx1;
		}

		char ch1 = s1.charAt(vidx1);
		char ch2 = s2.charAt(vidx2);

		int distance = 0;

		if (ch1 == ch2) {
			distance = edRecursionVirtualIndex(s1, s2, vidx1 + 1, vidx2 + 1);
		} else {
			int insertion = edRecursionVirtualIndex(s1, s2, vidx1 + 1, vidx2);
			int deletion = edRecursionVirtualIndex(s1, s2, vidx1, vidx2 + 1);
			int replacement = edRecursionVirtualIndex(s1, s2, vidx1 + 1, vidx2 + 1);

			distance = 1 + Math.min(insertion, Math.min(deletion, replacement));
		}

		return distance;
	}

	// O(mn) Time | O(mn) Space + recursion extra space
	public static int editDistanceTopDownDP(String s1, String s2, int vidx1, int vidx2, int[][] storage) {
		// base case
		if (s1.length() == vidx1)
			return s2.length() - vidx2;

		if (s2.length() == vidx2) {
			return s1.length() - vidx1;
		}

		if (storage[vidx1][vidx2] != -1) {
			return storage[vidx1][vidx2];
		}

		char ch1 = s1.charAt(vidx1);
		char ch2 = s2.charAt(vidx2);

		int distance = 0;

		if (ch1 == ch2) {
			distance = editDistanceTopDownDP(s1, s2, vidx1 + 1, vidx2 + 1, storage);
		} else {
			int insertion = editDistanceTopDownDP(s1, s2, vidx1 + 1, vidx2, storage);
			int deletion = editDistanceTopDownDP(s1, s2, vidx1, vidx2 + 1, storage);
			int replacement = editDistanceTopDownDP(s1, s2, vidx1 + 1, vidx2 + 1, storage);

			distance = 1 + Math.min(insertion, Math.min(deletion, replacement));
		}

		storage[vidx1][vidx2] = distance;

		return distance;
	}

	// O(mn) Time | O(mn) Space 
	public static int editDistanceBottomUpDP(String s1, String s2) {
		int[][] storage = new int[s1.length() + 1][s2.length() + 1];

		// filling: bottom to top, right to left
		for (int row = s1.length(); row >= 0; row--) {

			for (int col = s2.length(); col >= 0; col--) {

				// base cases
				if (row == s1.length()) {
					storage[row][col] = s2.length() - col;

				} else if (col == s2.length()) {
					storage[row][col] = s1.length() - row;

				} else {
					if (s1.charAt(row) == s2.charAt(col)) {
						storage[row][col] = storage[row + 1][col + 1];

					} else {
						int insertionFactor = storage[row + 1][col];
						int deletionFactor = storage[row][col + 1];
						int replaceFactor = storage[row + 1][col + 1];

						storage[row][col] = 1 + Math.min(insertionFactor, Math.min(deletionFactor, replaceFactor));
					}
				}
			}
		}

		return storage[0][0];
	}
}
