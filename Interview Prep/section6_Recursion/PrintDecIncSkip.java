package section6_Recursion;

public class PrintDecIncSkip {

	public static void main(String[] args) {
		int n = 5;
		printDecIncSkipRecursive(n);
	}

	static void printDecIncSkipRecursive(int n) {
		if (n == 0)
			return;

		if (n % 2 != 0)
			System.out.println(n);

		printDecIncSkipRecursive(n - 1);

		if (n % 2 == 0)
			System.out.println(n);
	}
}
