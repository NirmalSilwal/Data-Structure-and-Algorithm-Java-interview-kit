package Mathematics;

public class NumOfDigitsInNumber {

	public static void main(String[] args) {

		System.out.println(countDigit(-123));
		System.out.println(countDigit(1236516));
		System.out.println(countDigit(0));
		System.out.println("------------------------------");
		System.out.println(countDigitRecursive(123));
		System.out.println(countDigitRecursive(-69874123));
		System.out.println(countDigitRecursive(8598));
		System.out.println("-----------------------");
		System.out.println();
		System.out.println((int) countDigitLogarithmic(741));
		System.out.println((int) countDigitLogarithmic(-9741));
		System.out.println((int) countDigitLogarithmic(0));

	}

	// iterative approach
	public static int countDigit(int n) {
		int count = 0;

		while (n != 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

	// recursive approach
	public static int countDigitRecursive(int n) {
		// base case
		if (n == 0)
			return 0;

		int count = 1 + countDigitRecursive(n / 10);

		return count;
	}

	// logarithmic approach
	public static double countDigitLogarithmic(double n) {
		if (n == 0)
			return 1;
		
		if (n < 0)
			n = -n;

		double count = Math.floor(Math.log10(n) + 1);
		return count;
	}
}
