package MustDoEasyList;

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

	public static void main(String[] args) {
		System.out.println(reverseWords("hello world"));
	}
}
