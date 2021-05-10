package easy;

import java.util.Arrays;

// LC#242. Valid Anagram

public class ValidAnagram242 {

	public static boolean isAnagram(String s, String t) {

		s = sortStr(s);

		t = sortStr(t);

		return s.equals(t);
	}

	private static String sortStr(String str) {

		char[] arr = str.toCharArray(); // convert to character array

		Arrays.sort(arr); // sort the character array

		String ans = String.valueOf(arr); // make String from char array

		return ans;
	}

	public static boolean anagram(String s, String t) {
		if (s.length() != t.length())
			return false;

		int[] characters = new int[26]; // count of characters in given String

		// increase count of chars at that position in above array for
		// characters in first string
		for (char ch : s.toCharArray()) {
			characters[ch - 'a']++; //
		}

		// decrease count of chars at that position in above array for
		// characters in second string
		for (char ch : t.toCharArray()) {
			characters[ch - 'a']--; //
		}

		// now for anagram, count of particular character must be zero as from
		// first string we increase count, and from second string we decrease
		// their count
		for (int count : characters) {
			if (count != 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		System.out.println(isAnagram(s, t)); // true
		System.out.println(isAnagram("rat", "car")); // false

		System.out.println(anagram(s, t));
		System.out.println(anagram("helo", "nrlo"));
		System.out.println(anagram("rat", "car")); // false

	}

}
