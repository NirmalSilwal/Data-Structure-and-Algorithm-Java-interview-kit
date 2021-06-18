package CodingNinja.recursion;

public class powerOfX {

	// x^n
	public static int power(int x, int n) {
		if (n == 0)
			return 1;

		int smallerOutput = power(x, n - 1);
		int output = x * smallerOutput;

		return output;
	}

	public static void main(String[] args) {
		System.out.println(power(2, 5));
		System.out.println(power(3, 4));
	}
}
