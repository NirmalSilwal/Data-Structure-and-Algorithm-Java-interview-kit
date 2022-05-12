package RecursionSeries;

public class Print1ToN {

	public static void main(String[] args) {
		int n = 10;
		printRecursive(n);
	}

	private static void printRecursive(int n) {
		if (n == 0)
			return;

		printRecursive(n - 1);
		System.out.println(n); // backtracking
	}
}
