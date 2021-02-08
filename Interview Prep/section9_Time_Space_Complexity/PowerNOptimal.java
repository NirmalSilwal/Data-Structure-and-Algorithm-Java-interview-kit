package section9_Time_Space_Complexity;

public class PowerNOptimal {

	public static void main(String[] args) {

		System.out.println(power(2, 5));
		System.out.println(power(2, 0));
		System.out.println(power(3, 4));
	}

	// O(logN) Time | O(1) Space
	public static int power(int n, int pow) {
		if (pow == 0)
			return 1;

		if (pow == 1)
			return n;

		int ans;
		if (pow % 2 == 0) {
			int p = power(n, pow / 2);
			ans = p * p;
		} else {
			int p = power(n, pow / 2);
			ans = p * p * n;
		}
		return ans;
	}

	// clean code
	// O(logN) Time | O(1) Space
	public static int power2(int n, int pow) {
		if (pow == 0)
			return 1;

		int p = power(n, pow / 2);

		int ans;
		if (pow % 2 == 0) {
			ans = p * p;
		} else {
			ans = p * p * n;
		}
		return ans;
	}

}
