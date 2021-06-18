package CodingNinja.recursion;

public class NumberOfDigitsInNumber {

	public static int countDigits(int num) {
		if (num == 0)
			return 0;

		int smallerOutput = countDigits(num / 10);
		int output = 1 + smallerOutput;

		return output;
	}

	public static void main(String[] args) {
		System.out.println(countDigits(12333348));
	}
}
