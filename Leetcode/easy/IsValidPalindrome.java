package easy;

// LC#125 Valid Palindrome

public class IsValidPalindrome {

	public static boolean isPalindrome1(String s) {

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

	public static boolean isPalindrome2(String s) {

		String parsed = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

		StringBuilder builder = new StringBuilder();
		builder.append(parsed);
		builder.reverse();

		String reversed = builder.toString();

		return parsed.equals(reversed);
	}

	public static boolean isPalindrome(String s) {

		int low = 0, high = s.length() - 1;

		while (low < high) {

			if (!Character.isLetterOrDigit(s.charAt(low))) {
				low++;
				continue;
			}
			if (!Character.isLetterOrDigit(s.charAt(high))) {
				high--;
				continue;
			}

			if (Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))) {
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

		System.out.println(isPalindrome("oppo ")); // true

	}

}
