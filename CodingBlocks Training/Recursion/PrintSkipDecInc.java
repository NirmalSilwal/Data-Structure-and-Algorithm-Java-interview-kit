package Recursion;

/* output:
		5
		3
		1
		2
		4
 */

public class PrintSkipDecInc {

	public static void main(String[] args) {

		int n = 5;
		printDecIncSkip(n);
	}

	public static void printDecIncSkip(int n) {
		if (n <= 0) {
			return;
		}
		if (n % 2 != 0) {
			System.out.println(n);
		}
		printDecIncSkip(n - 1);
		if (n % 2 == 0) {
			System.out.println(n);
		}
	}
}
