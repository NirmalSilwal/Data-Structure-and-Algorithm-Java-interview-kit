package easy;

public class PalindromeNumber9 {

	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;

		String num = String.valueOf(x);

		int left = 0, right = num.length() - 1;

		while (left < right) {
			if (num.charAt(left) != num.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome(12321));
		System.out.println(isPalindrome(10));

	}
}
