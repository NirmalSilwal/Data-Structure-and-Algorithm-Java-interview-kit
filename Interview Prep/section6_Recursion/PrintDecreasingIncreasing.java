package section6_Recursion;

public class PrintDecreasingIncreasing {

	public static void main(String[] args) {
		int n = 5;
		printDecIncRecursive(n);
	}

	// doing work before a call and after a call
	static void printDecIncRecursive(int n) {
		if (n == 0)
			return;

		System.out.println(n);
		printDecIncRecursive(n - 1);
		System.out.println(n);
	}
}
