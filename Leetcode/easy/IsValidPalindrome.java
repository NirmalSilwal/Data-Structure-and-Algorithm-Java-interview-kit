package easy;

// LC#125 Valid Palindrome

public class IsValidPalindrome {

	public static boolean isPalindrome(String s) {

		String parsed = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

		int low = 0, high = parsed.length() - 1;

		while (low <= high) {

			if (parsed.charAt(low) != parsed.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}

		return true;
	}

	public static void main(String[] args) {

		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s)); // true

		System.out.println(isPalindrome("race a car")); // false
	}
}
