package section5_Strings;

public class PrintAllSubstrings {

	public static void main(String[] args) {

		String s = "hello";
		printSubstring(s);
		System.out.println();
		printSubstring("abcd");
	}

	static void printSubstring(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
			System.out.println();
		}
	}
}
