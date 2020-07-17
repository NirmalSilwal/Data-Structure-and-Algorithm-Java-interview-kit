package Lecture9;

// finds all prime numbers between 2 and n in O(log(log n))

public class SieveOfEratosthenes {

	public static void main(String[] args) {

		int n = 30;

		soe_find_primes(n);
	}

	public static void soe_find_primes(int n) {
		boolean[] primes = new boolean[n + 1];

		for (int i = 0; i < primes.length; i++) {
			primes[i] = true;
		}

		int num = 2;

		while (num * num < n) {
			if (primes[num]) {
				for (int multiplier = 2; num * multiplier <= n; multiplier++) {
					primes[num * multiplier] = false;
				}
			}
			num++;
		}

		for (int i = 2; i < primes.length; i++) {
			if (primes[i]) {
				System.out.print(i + " ");
			}
		}
	}
}
