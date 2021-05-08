package DailyChallenges.MayChallenges;

import java.util.Arrays;

public class DeleteOperationTwoStrings {

	public static int minDistance(String word1, String word2) {
		// return minDistance(word1, word2, 0, 0);

		int[][] storage = new int[word1.length()][word2.length()];
		for (int i = 0; i < storage.length; i++) {
			Arrays.fill(storage[i], -1);
		}
		return minDistanceDP(word1, word2, 0, 0, storage);
	}

	// this gives TLE for large inputs
	private static int minDistance(String word1, String word2, int vid1, int vid2) {

		if (vid1 == word1.length())
			return word2.length() - vid2;
		if (vid2 == word2.length())
			return word1.length() - vid1;

		char ch1 = word1.charAt(vid1);
		char ch2 = word2.charAt(vid2);
		int result = 0;

		if (ch1 == ch2) {
			result = minDistance(word1, word2, vid1 + 1, vid2 + 1);
		} else {
			int deleteW1 = minDistance(word1, word2, vid1 + 1, vid2);
			int deleteW2 = minDistance(word1, word2, vid1, vid2 + 1);

			result = 1 + Math.min(deleteW1, deleteW2);
		}
		return result;
	}

	private static int minDistanceDP(String word1, String word2, int vid1, int vid2, int[][] storage) {

		if (vid1 == word1.length())
			return word2.length() - vid2;
		if (vid2 == word2.length())
			return word1.length() - vid1;

		if (storage[vid1][vid2] != -1)
			return storage[vid1][vid2];

		char ch1 = word1.charAt(vid1);
		char ch2 = word2.charAt(vid2);
		int result = 0;

		if (ch1 == ch2) {
			result = minDistanceDP(word1, word2, vid1 + 1, vid2 + 1, storage);
		} else {
			int deleteW1 = minDistanceDP(word1, word2, vid1 + 1, vid2, storage);
			int deleteW2 = minDistanceDP(word1, word2, vid1, vid2 + 1, storage);

			result = 1 + Math.min(deleteW1, deleteW2);
		}

		storage[vid1][vid2] = result;

		return result;
	}

	public static void main(String[] args) {
		String word1 = "sea";
		String word2 = "eat";
		System.out.println(minDistance(word1, word2));
		System.out.println(minDistance("leetcode", "etco"));
		System.out.println(minDistance("leetcoasidhfoaindvsilfnaosdde", "etcogohiasoefdnas"));
	}
}
