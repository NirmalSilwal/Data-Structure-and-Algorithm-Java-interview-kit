package section6_Recursion;

public class PowerRecursive {

	public static void main(String[] args) {
		System.out.println(power(2, 5));
	}

	static int power(int x, int n) {
		// if (n == 0)
		// return 1;
		
		// base case, above base case also works
		if (n == 1)
			return x;

		int pnm1 = power(x, n - 1);
		int powerN = x * pnm1;

		return powerN;
	}
}
