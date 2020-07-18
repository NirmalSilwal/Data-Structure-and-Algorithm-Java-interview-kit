package Lecture10;

public class PrintIncreasing {

	public static void main(String[] args) {

		int n = 5;

		printIncreasing(n);
	}

	public static void printIncreasing(int n) {
		if (n == 0 | n < 0) {
			return;
		}
		printIncreasing(n - 1); // recursive call
		System.out.println(n);
	}
}
