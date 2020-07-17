package Lecture10;

public class PrintDecreasing {

	public static void main(String[] args) {

		int n = 5;
		printDecreasing(n);
		
		System.out.println("\nfor negative number:\n");
		n = -5;
		printDecreasing(n);
	}

	public static void printDecreasing(int n) {
		if (n == 0 | n < 0) {
			System.out.println("I am executed");
			return;
		}
		System.out.println(n);
		printDecreasing(n - 1);
	}
}
