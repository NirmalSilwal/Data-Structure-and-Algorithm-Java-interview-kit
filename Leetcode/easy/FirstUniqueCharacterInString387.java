package easy;

import java.util.HashMap;

public class FirstUniqueCharacterInString387 {

	public static int firstUniqChar(String s) {

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

	public static void main(String[] args) {
		String str = "leetcode";
		System.out.println(firstUniqChar(str));
		System.out.println(firstUniqChar("loveleetcode"));
		System.out.println(firstUniqChar("aabb"));
	}
}
