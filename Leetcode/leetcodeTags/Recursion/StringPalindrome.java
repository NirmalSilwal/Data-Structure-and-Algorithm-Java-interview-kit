package RecursionSeries;

public class StringPalindrome {

	// using recursion
	public static boolean checkPalindrome(String str, int low, int high) {
		if (low >= high)
			return true;

		if (str.charAt(low) == str.charAt(high))
			return checkPalindrome(str, low + 1, high - 1);
		else
			return false;
	}

	public static void main(String[] args) {
		String str = "MADAM";
		System.out.println(checkPalindrome(str, 0, str.length() - 1));

		String str1 = "hello";
		System.out.println(checkPalindrome(str1, 0, str1.length() - 1));
	}
}
