package easy;

public class CountPrimes204 {

	public static int countPrimes(int n) {
		if (n <= 1)
			return 0;

		int count = 0;
		for (int i = 2; i < n; i++) {
			boolean prime = isPrime(i);
			if (prime) {
				count++;
			}
		}
		return count;
	}

	private static boolean isPrime(int n) {
		if (n == 2) // 2 is the only even prime number
			return true;
		else if (n % 2 == 0)
			return false;

		// check for odd numbers only after 3
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(countPrimes(5000000));

	}
}
