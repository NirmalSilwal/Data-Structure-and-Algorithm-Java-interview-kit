package easy;

import java.util.HashMap;
import java.util.Map;

/*
 	Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
	
	Output: false
	
	Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], 
	hence the sequence is unsorted.
 */

public class VerifyingAlienDictionary953 {

	public static boolean isAlienSorted(String[] words, String order) {
		if (words.length == 1)
			return true;

		for (int i = 0; i < words.length - 1; i++) {

			boolean checkCurrentOrder = checkTwoWords(words[i], words[i + 1], order);

			if (checkCurrentOrder == false) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkTwoWords(String current, String next, String order) {

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 1; i <= 26; i++) {
			map.put(order.charAt(i - 1), i);
		}

		for (int idx = 0; idx < current.length(); idx++) {
			char ch1 = current.charAt(idx);
			// if not matched yet but next string is traversed already
			if (idx == next.length())
				return false;
			char ch2 = next.charAt(idx);

			int order1 = map.get(ch1);
			int order2 = map.get(ch2);

			if (order1 == order2)
				continue;
			else if (order1 > order2)
				return false;
			else
				return true;
		}

		return true;
	}

	public static void main(String[] args) {

		String[] words2 = { "hello", "leetcode" };
		String order2 = "hlabcdefgijkmnopqrstuvwxyz";
		System.out.println(isAlienSorted(words2, order2));

		String[] words = { "word", "world", "row" };
		String order = "worldabcefghijkmnpqstuvxyz";
		System.out.println(isAlienSorted(words, order));

		String[] words3 = { "apple", "app" };
		// String[] words3 = { "apap", "app" };
		String order3 = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(isAlienSorted(words3, order3));
	}
}
