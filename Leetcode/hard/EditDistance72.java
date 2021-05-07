package hard;

import java.util.Arrays;

public class EditDistance72 {

	public static int minDistance(String word1, String word2) {
		// int recursiveAns = minDistance(word1, word2, 0, 0);
		// System.out.println("rec ans: " + recursiveAns);
		// using DP
		int[][] storage = new int[word1.length()][word2.length()];
		for (int i = 0; i < storage.length; i++) {
			Arrays.fill(storage[i], -1);
		}
		int virtualId1 = 0, virtualId2 = 0;
		return minDistanceDP(word1, word2, virtualId1, virtualId2, storage);
	}

	private static int minDistance(String word1, String word2, int vid1, int vid2) {

		if (word1.length() == vid1) {
			return word2.length() - vid2;
		}

		if (word2.length() == vid2) {
			return word1.length() - vid1;
		}

		char ch1 = word1.charAt(vid1);
		char ch2 = word2.charAt(vid2);

		int ans = 0;

		if (ch1 == ch2) {
			// if character matches, do nothing, and check other substring
			ans = minDistance(word1, word2, vid1 + 1, vid2 + 1);
		} else {
			// do insert, replace, delete operation and see result
			int insertAns = minDistance(word1, word2, vid1 + 1, vid2);
			int deleteAns = minDistance(word1, word2, vid1, vid2 + 1);
			int replaceAns = minDistance(word1, word2, vid1 + 1, vid2 + 1);

			ans = 1 + Math.min(insertAns, Math.min(deleteAns, replaceAns));
		}
		return ans;
	}

	private static int minDistanceDP(String word1, String word2, int vid1, int vid2, int[][] storage) {

		if (word1.length() == vid1) {
			return word2.length() - vid2;
		}

		if (word2.length() == vid2) {
			return word1.length() - vid1;
		}

		// use previously computed value
		if (storage[vid1][vid2] != -1) {
			return storage[vid1][vid2];
		}

		char ch1 = word1.charAt(vid1);
		char ch2 = word2.charAt(vid2);

		int ans = 0;

		if (ch1 == ch2) {
			// if character matches, do nothing, and check other substring
			ans = minDistanceDP(word1, word2, vid1 + 1, vid2 + 1, storage);
		} else {
			// do insert, replace, delete operation and see result
			int insertAns = minDistanceDP(word1, word2, vid1 + 1, vid2, storage);
			int deleteAns = minDistanceDP(word1, word2, vid1, vid2 + 1, storage);
			int replaceAns = minDistanceDP(word1, word2, vid1 + 1, vid2 + 1, storage);

			ans = 1 + Math.min(insertAns, Math.min(deleteAns, replaceAns));
		}

		// store for future reference
		storage[vid1][vid2] = ans;

		return ans;
	}

	public static void main(String[] args) {

		String s1 = "abcd", s2 = "agcfd";
		System.out.println(minDistance(s1, s2));

		System.out.println(minDistance("horse", "ros"));

		String word1 = "intention", word2 = "execution";
		System.out.println(minDistance(word1, word2));

		String s = "horasohdfaoinvaosidhnfase", t = "rosdfnvaoaohdih";
		System.out.println(minDistance(s, t));
	}
}
