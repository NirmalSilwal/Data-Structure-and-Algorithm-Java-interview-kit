package Recursion;

public class printDecreasingIncreasing {

	public static void main(String[] args) {

		int n = 5;
		printDecInc(n);
	}

	public static void printDecInc(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		printDecInc(n - 1);
		System.out.println(n);
	}
}
