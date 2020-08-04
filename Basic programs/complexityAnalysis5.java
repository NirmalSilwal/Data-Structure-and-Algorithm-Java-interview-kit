package BasicPractice;

// complexity: O(sqrt(n))

public class complexityAnalysis5 {

	public static void main(String[] args) {

		int num = 33;
		System.out.println(isPrime(num)); // false
		System.out.println(isPrime(7)); // true
		System.out.println(isPrime(2)); // true
		System.out.println(isPrime(12)); // false

	}

	public static boolean isPrime(int num) {
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
