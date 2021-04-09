package section19_DynamicProgramming;

/*
 * Given a string s, partition s such that every substring of the partition is a palindrome.
   Return the minimum cuts needed for a palindrome partitioning of s. [Leetcode 132]
 */
import java.util.Arrays;

public class PalindromePartitioning {

	public static void main(String[] args) {

		String source = "abacdc";
		int startIndex = 0, endIndex = source.length() - 1;
		System.out.println(palindromePartitionRec(source, startIndex, endIndex));

		String src = "abacdce";
		System.out.println(palindromePartitionRec(src, 0, src.length() - 1));

		int[][] strg = new int[src.length()][src.length()];
		for (int i = 0; i < strg.length; i++) {
			Arrays.fill(strg[i], -1);
		}
		System.out.println("using top down for small input");
		System.out.println(palindromePartitioningTopDownDP(src, 0, src.length() - 1, strg));

		System.out.println("\ntesting large inputs");

		String s = "aeirahsdvmzxklncaodgnasadasdsafhioashdffoihokn";
		// System.out.println(palindromePartitionRec(s, 0, s.length() - 1));

		int[][] storage = new int[s.length()][s.length()];
		for (int i = 0; i < storage.length; i++) {
			Arrays.fill(storage[i], -1);
		}
		System.out.println(palindromePartitioningTopDownDP(s, 0, s.length() - 1, storage));

		System.out.println("\nusing bottom up dp");

		System.out.println(palindromePartitioningBottomUpDP("aba")); // 0
		System.out.println(palindromePartitioningBottomUpDP(source)); // 1
		System.out.println(palindromePartitioningBottomUpDP("abacdce")); // 2
		System.out.println(palindromePartitioningBottomUpDP(s)); // 38

	}

	public static int palindromePartitionRec(String str, int si, int ei) {

		if (isPalindrome(str, si, ei)) {
			return 0;
		}
		int minCut = Integer.MAX_VALUE;

		for (int calls = si; calls < ei; calls++) {

			int firstHalf = palindromePartitionRec(str, si, calls);
			int secondHalf = palindromePartitionRec(str, calls + 1, ei);

			int ans = firstHalf + secondHalf + 1;

			if (ans < minCut) {
				minCut = ans;
			}
		}

		return minCut;
	}

	public static boolean isPalindrome(String str, int si, int ei) {
		int low = si, high = ei;
		while (low < high) {
			if (str.charAt(low) != str.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}

	public static int palindromePartitioningTopDownDP(String str, int si, int ei, int[][] storage) {

		if (isPalindrome(str, si, ei)) {
			return 0;
		}
		int minCut = Integer.MAX_VALUE;

		if (storage[si][ei] != -1) { // reuse
			return storage[si][ei];
		}
		for (int calls = si; calls < ei; calls++) {

			int firstHalf = palindromePartitioningTopDownDP(str, si, calls, storage);
			int secondHalf = palindromePartitioningTopDownDP(str, calls + 1, ei, storage);

			int ans = firstHalf + secondHalf + 1;

			if (ans < minCut) {
				minCut = ans;
			}
		}
		storage[si][ei] = minCut; // store solution in problem index

		return minCut;
	}

	public static int palindromePartitioningBottomUpDP(String str) {
		boolean[][] palindromeStorageReuse = palindromeStorage(str);

		int len = str.length();
		int[][] storage = new int[len][len];

		// filling direction
		for (int slide = 0; slide <= len - 1; slide++) {

			for (int si = 0; si <= len - slide - 1; si++) {

				int ei = si + slide;

				// logic from top down
				// optimizing this task to check palindrome for each cell
				if (palindromeStorageReuse[si][ei]) {
					storage[si][ei] = 0;
				} else {
					int minCut = Integer.MAX_VALUE;

					for (int calls = si; calls < ei; calls++) {

						int firstHalf = storage[si][calls];
						int secondHalf = storage[calls + 1][ei];

						int ans = firstHalf + secondHalf + 1;

						if (ans < minCut) {
							minCut = ans;
						}
					}

					storage[si][ei] = minCut; // store solution in problem index
				}
			}
		}

		return storage[0][len - 1];
	}

	// optimizing base case to check palindrome for each cell
	public static boolean[][] palindromeStorage(String str) {
		int n = str.length();
		boolean[][] palindromeInfo = new boolean[n][n];

		for (int i = 0; i < palindromeInfo.length; i++) {
			Arrays.fill(palindromeInfo[i], true);
		}

		for (int row = n - 2; row >= 0; row--) {

			for (int col = row + 1; col < n; col++) {

				if (str.charAt(row) == str.charAt(col)) {
					palindromeInfo[row][col] = palindromeInfo[row + 1][col - 1];
				} else {
					palindromeInfo[row][col] = false;
				}
			}
		}

		return palindromeInfo;
	}
}
