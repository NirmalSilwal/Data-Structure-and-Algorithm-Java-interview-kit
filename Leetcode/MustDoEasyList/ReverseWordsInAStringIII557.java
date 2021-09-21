package MustDoEasyList;

import java.util.Arrays;

public class ReverseWordsInAStringIII557 {

	public static String reverseWords(String s) {
		StringBuilder ans = new StringBuilder();

		int count = 0;
		for (String str : s.split(" ")) {
			String currReversed = reverseOneWord(str);
			if (count == 0)
				ans.append(currReversed);
			else {
				ans.append(" ");
				ans.append(currReversed);
			}
			count++;
		}

		return ans.toString();

	}

	private static String reverseOneWord(String word) {
		StringBuilder ans = new StringBuilder();
		for (int i = word.length() - 1; i >= 0; i--) {
			char ch = word.charAt(i);
			ans.append(ch);
		}
		return ans.toString();
	}

	// second approach
	public static String reverseWords2(String s) {
		int len = s.length();
		char[] arr = s.toCharArray();

		int firstidx = 0, lastidx = 0;

		for (int i = 0; i < len; i++) {

			if (arr[i] == ' ') {
				lastidx = i - 1;
				reverseHelper(arr, firstidx, lastidx);
				firstidx = i + 1;
			}
		}

		// now last word is left to be reversed
		reverseHelper(arr, firstidx, len - 1);

		return new String(arr);
	}

	private static void reverseHelper(char[] arr, int firstidx, int lastidx) {
		while (firstidx < lastidx) {
			char temp = arr[firstidx];
			arr[firstidx] = arr[lastidx];
			arr[lastidx] = temp;
			firstidx++;
			lastidx--;
		}
	}

	public static void main(String[] args) {
		System.out.println(reverseWords2("hello world"));
	}
}

/*
 * Input: s = "Let's take LeetCode contest"
 * 
 * Output: "s'teL ekat edoCteeL tsetnoc"
 */
