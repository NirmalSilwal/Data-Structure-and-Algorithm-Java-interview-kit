package LeetcodeDaily.April2022;

public class Day2ValidPalindromeII680 {

	public static boolean validPalindrome(String s) {
		if (s.length() == 1)
			return true;

		return checkDeletion(s, 0, s.length() - 1, 1);
	}

	private static boolean checkDeletion(String s, int low, int high, int deletioncount) {

		if (low >= high)
			return true;

		// normal case
		if (s.charAt(low) == s.charAt(high))
			return checkDeletion(s, low + 1, high - 1, deletioncount);

		if (deletioncount == 0)
			return false;

		// if we need to delete one character either from low or from high cursor
		boolean deleteStart = checkDeletion(s, low + 1, high, deletioncount - 1);
		boolean deleteEnd = checkDeletion(s, low, high - 1, deletioncount - 1);

		return deleteStart || deleteEnd;
	}

	public static void main(String[] args) {
		System.out.println(validPalindrome("aba"));
		System.out.println(validPalindrome("abca"));
		System.out.println(validPalindrome("abc"));
		System.out.println(validPalindrome("deeee"));
	}
}
