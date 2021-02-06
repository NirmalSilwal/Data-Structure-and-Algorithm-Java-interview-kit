package section8_PrintRecursion;

public class PrintSubsequences {

	public static void main(String[] args) {
		printSubseq("abc", "");
	}

	static void printSubseq(String s, String result) {

		if (s.length() == 0) {
			System.out.print(result + " ");
			return;
		}
		char current = s.charAt(0);
		String restStr = s.substring(1);

		printSubseq(restStr, result);

		printSubseq(restStr, result + current);
	}
}
