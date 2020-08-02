package Lecture11;

public class printStringSubsequences {

	public static void main(String[] args) {

		String str = "abc";
		String result = "";

		printSubsequences(str, result);
	}

	public static void printSubsequences(String str, String result) {

		if (str.length() == 0) {
			System.out.println(result);
			return;
		}

		char first = str.charAt(0);
		String restStr = str.substring(1);

		printSubsequences(restStr, result);

		printSubsequences(restStr, result + first);
	}
}

/*
output:

c
b
bc
a
ac
ab
abc
*/
// note first line of output here is blank space which is also the part of subsequence