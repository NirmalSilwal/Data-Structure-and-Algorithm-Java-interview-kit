package section19_DynamicProgramming;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String str1 = "abbg";
		String str2 = "agbg";

		System.out.println(lcs(str1, str2));
		System.out.println(lcsIterative(str1, str2));
	}

	public static int lcs(String str1, String str2) {
		if (str1.length() == 0 || str2.length() == 0)
			return 0;

		int count = 0;
		String restString1 = str1.substring(1);
		String restString2 = str2.substring(1);

		if (str1.charAt(0) == str2.charAt(	0)) {
			count = 1 + lcs(restString1, restString2);
		} else {
			int factor1 = lcs(str1, restString2);
			int factor2 = lcs(restString1, str2);
			count = Math.max(factor1, factor2);
		}

		return count;
	}

	// O(nm) Time, where n is length of str1, m is length of str2
	public static int lcsIterative(String str1, String str2) {
		int[][] storage = new int[str1.length() + 1][str2.length() + 1];

		for (int row = storage.length - 1; row >= 0; row--) {

			for (int col = storage.length - 1; col >= 0; col--) {
				String s1 = str1.substring(row);
				String s2 = str2.substring(col);

				if (s1.length() == 0 || s2.length() == 0)
					storage[row][col] = 0;

				else if (s1.charAt(0) == s2.charAt(0)) {
					storage[row][col] = 1 + storage[row + 1][col + 1];
				} else {
					storage[row][col] = Math.max(storage[row][col + 1], storage[row + 1][col]);
				}
			}
		}

		return storage[0][0];
	}
}
