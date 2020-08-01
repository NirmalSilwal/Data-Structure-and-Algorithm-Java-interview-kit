package Recursion;

public class printIncreasing {

	public static void main(String[] args) {

		int n = 5;
		printInc(n);
	}

	public static void printInc(int n) {
		if (n == 0) {
			return;
		}
		printInc(n - 1);
		System.out.println(n);
	}
}
