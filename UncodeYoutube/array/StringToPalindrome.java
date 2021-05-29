package array;

import java.util.HashMap;
import java.util.Map;

public class StringToPalindrome {

	public static String makePalindrome(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : s.toCharArray()) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}

		StringBuilder ans = new StringBuilder(s);
		int low = 0, high = s.length() - 1;

		for (Map.Entry<Character, Integer> entries : map.entrySet()) {
			if (entries.getValue() == 1) {
				ans.setCharAt((ans.length() / 2), entries.getKey());
			} else {
				ans.setCharAt(low, entries.getKey());
				ans.setCharAt(high, entries.getKey());
				low++;
				high--;
			}
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		String str = "aabbc";
		System.out.println(makePalindrome(str));
		System.out.println(makePalindrome("aabbccd"));
		System.out.println(makePalindrome("abccbar"));
	}
}
