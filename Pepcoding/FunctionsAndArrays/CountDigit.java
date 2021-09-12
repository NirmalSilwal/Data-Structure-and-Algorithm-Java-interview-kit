package FunctionsAndArrays;

public class CountDigit {

	public static int countDigit(int num, int digit) {
		if (num < 0)
			num = -num;

		int count = 0;
		while (num != 0) {
			int rem = num % 10;
			if (rem == digit)
				count++;
			num /= 10;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countDigit(956545235, 5));
		System.out.println(countDigit(-956545235, 5));
	}
}
