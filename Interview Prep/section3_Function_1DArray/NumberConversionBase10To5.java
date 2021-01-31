package section3_Function_1DArray;

public class NumberConversionBase10To5 {

	public static void main(String[] args) {
		int n = 238;
		int sourceBase = 10;
		int destBase = 5;
		System.out.println(decimalToAnyBase(n, sourceBase, destBase)); // 1423
	}

	static int decimalToAnyBase(int n, int sourceBase, int destBase) {
		int sum = 0;
		int multiplier = 1;

		while (n != 0) {
			int rem = n % destBase;
			sum = sum + (rem * multiplier);
			n = n / destBase;
			multiplier *= sourceBase;
		}

		return sum;
	}
}
