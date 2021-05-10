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

	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		System.out.println(isAnagram(s, t)); // true
		System.out.println(isAnagram("rat", "car")); // false
	}

}
