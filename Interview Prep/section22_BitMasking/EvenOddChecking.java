package section22_BitMasking;

public class EvenOddChecking {

	public static void main(String[] args) {

		testEvenOdd(5);
		testEvenOdd(0);
		testEvenOdd(6);
		testEvenOdd(-10);
	}

	public static void testEvenOdd(int n) {
		// using bitwise AND operator
		if ((n & 1) == 0) {
			System.out.println(n + " is Even");
		} else {
			System.out.println(n + " is Odd");
		}
	}
}
