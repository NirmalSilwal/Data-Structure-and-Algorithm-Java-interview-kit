package Lecture7;

public class StringQuestions {

	public static void main(String[] args) {

		String str = "hello";
		printAllChars(str);
		System.out.println();
		printAllSubStrings(str);
	}

	public static void printAllChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void printAllSubStrings(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.print(str.substring(i, j) + " ");
			}
		}
	}
}

// output:
/*
 * h e l l o
 * 
 * h he hel hell hello e el ell ello l ll llo l lo o
 */
