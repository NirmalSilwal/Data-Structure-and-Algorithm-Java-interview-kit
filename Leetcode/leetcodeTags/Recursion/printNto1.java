package RecursionSeries;

public class printNto1 {

	public static void main(String[] args) {
		int n = 10;
		printRecursive(n);
	}

	private static void printRecursive(int n) {
		if (n == 0)
			return;

		System.out.println(n);
		printRecursive(n - 1);
	}
}
