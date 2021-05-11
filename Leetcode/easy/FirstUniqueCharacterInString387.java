package easy;

import java.util.HashMap;

public class FirstUniqueCharacterInString387 {

	// O(N) Time
	public static int firstUniqChar1(String s) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == 1)
				return i;
		}
		return -1;
	}

	public static int firstUniqChar(String s) {

		int[] count = new int[26]; // for all alphabets
		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - 'a']++; // track count of each character in String
		}

		for (int i = 0; i < arr.length; i++) {
			if (count[arr[i] - 'a'] == 1)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		String str = "leetcode";
		System.out.println(firstUniqChar(str));
		System.out.println(firstUniqChar("loveleetcode"));
		System.out.println(firstUniqChar("aabb"));
	}
}
