package section7_GetRecursion;

public class GetPermutations {

	public static void main(String[] args) {
		printPermutation("abc", "");
	}

	static void printPermutation(String s, String result) {

		if (s.length() == 0) {
			System.out.println(result);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			String before = s.substring(0, i);
			String after = s.substring(i + 1, s.length());
			String restStr = before + after;

			printPermutation(restStr, result + current);
		}
	}
}

/* output:

abc
acb
bac
bca
cab
cba

*/