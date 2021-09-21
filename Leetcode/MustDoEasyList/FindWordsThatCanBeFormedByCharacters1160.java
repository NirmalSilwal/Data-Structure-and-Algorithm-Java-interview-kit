package MustDoEasyList;

import java.util.HashMap;

public class FindWordsThatCanBeFormedByCharacters1160 {

	public static int countCharacters(String[] words, String chars) {
		int len = 0;

		for (String word : words) {
			boolean isGood = isGoodString(word, chars);
			if (isGood) {
				len += word.length();
			}
		}
		return len;
	}

	private static boolean isGoodString(String word, String chars) {

		HashMap<Character, Integer> map = new HashMap<>();

		// store chars in hashmap with their character count
		for (char ch : chars.toCharArray()) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}

		for (char ch : word.toCharArray()) {
			if (map.containsKey(ch)) {
				if (map.get(ch) > 0)
					map.put(ch, map.get(ch) - 1);
				else
					return false;
			} else {
				return false; // if that character is not found in map you can't
								// form the word from chars
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String[] words = { "cat", "bt", "hat", "tree" };
		String chars = "atach";

		System.out.println(countCharacters(words, chars));
	}
}

/*
 * Input: words = ["cat","bt","hat","tree"], chars = "atach" Output: 6
 * Explanation: The strings that can be formed are "cat" and "hat" so the answer
 * is 3 + 3 = 6.
 */