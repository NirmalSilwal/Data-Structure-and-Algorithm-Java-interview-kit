package easy;

public class ExcelSheetColumnNumber171 {

	// ABC
	public static int titleToNumber(String columnTitle) {

		int n = columnTitle.length();

		if (n == 1) {
			return findCharNumber(columnTitle.charAt(0));
		}
		int ans = 0;

		for (int i = 0; i < n; i++) {
			ans = ans * 26;
			ans = ans + findCharNumber(columnTitle.charAt(i));
		}

		return ans;
	}

	private static int findCharNumber(char ch) {
		return ch - 'A' + 1;
	}

	public static void main(String[] args) {
		System.out.println(titleToNumber("ABC"));
	}
}
