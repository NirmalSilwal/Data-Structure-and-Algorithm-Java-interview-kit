package Lecture10;

public class PrintNumSkip {

	public static void main(String[] args) {

		int n = 5;

		printIncDecSkip(n);
	}

	public static void printIncDecSkip(int n) {
		if (n <= 0) {
			return;
		}
		if (n % 2 != 0) {
			System.out.println(n);
		}
		printIncDecSkip(n - 1);
		if (n % 2 == 0) {
			System.out.println(n);
		}
	}

//	need to fix bug in this approach!
	// public static void printIncDecSkip(int n) {
	// if (n <= 0 ) {
	// return;
	// }
	// System.out.println(n);
	// printIncDecSkip(n - 2);
	// System.out.println(n + 1);
	// }
}

/*
 * output: 5 
	   3 
	   1 
	   2 
	   4
 */
