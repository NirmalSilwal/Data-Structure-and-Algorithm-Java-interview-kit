package section3_Function_1DArray;

public class NumberConversionBase5To10 {

	public static void main(String[] args) {
		System.out.println(baseConversion5To10(1423));
	}

	static int baseConversion5To10(int n) {

		int sum = 0;
		int base = 1;
		while (n != 0) {
			int rem = n % 10;
			sum = sum + (rem * base);
			n = n / 10;
			base = base * 5;
		}

		return sum;
	}
}
