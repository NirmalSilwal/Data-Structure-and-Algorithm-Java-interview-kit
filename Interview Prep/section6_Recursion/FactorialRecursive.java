package section6_Recursion;

public class FactorialRecursive {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(factorialRec(n));
	}

	static int factorialRec(int n) {
		if (n == 1)
			return 1;

		int fnm1 = factorialRec(n - 1);
		int factorial = n * fnm1;

		return factorial;
	}
}
