package Recursion;

public class printDecreasing {

	public static void main(String[] args) {

		int n = 5;
		printDec(n);
	}

	public static void printDec(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);

		printDec(n - 1);
	}
}
