package section19_DynamicProgramming;

public class EditDistance {

	public static void main(String[] args) {

		String s1 = "agbg";
		String s2 = "acgb";

		System.out.println(editDistance(s1, s2)); // 2
		System.out.println(editDistanceIterative(s1, s2)); // 2
	}

	// minimum changes required to make s2 equal to s1
	// O(2^nm) Time, where n is length of s1, m is length of s2
	public static int editDistance(String s1, String s2) {

		if (s1.length() == 0)
			return s2.length();

		if (s2.length() == 0)
			return s1.length();

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int result = 0;

		if (s1.charAt(0) == s2.charAt(0)) {
			result = editDistance(ros1, ros2);
		} else {
			int removeFactor = 1 + editDistance(ros1, ros2);
			int addFactor = 1 + editDistance(ros1, s2);
			int replaceFactor = 1 + editDistance(s1, ros2);

			result = Math.min(removeFactor, Math.min(addFactor, replaceFactor));
		}

		return result;
	}

	// DP approach
	// O(nm) Time, where n is length of s1, m is length of s2
	public static int editDistanceIterative(String s1, String s2) {
		int[][] storage = new int[s1.length() + 1][s2.length() + 1];

		// seed value
		storage[s1.length()][s2.length()] = 0;

		for (int row = s1.length(); row >= 0; row--) {
			for (int col = s2.length(); col >= 0; col--) {

				if (row == s1.length()) {
					storage[row][col] = s2.length() - col;
					continue;
				}

				if (col == s2.length()) {
					storage[row][col] = s1.length() - row;
					continue;
				}

				if (s1.charAt(row) == s2.charAt(col)) {
					storage[row][col] = storage[row + 1][col + 1];
				} else {
					storage[row][col] = 1 + Math.min(storage[row + 1][col + 1],
							Math.min(storage[row + 1][col], storage[row][col + 1]));
				}
			}
		}

		return storage[0][0];
	}
}
