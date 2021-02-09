package section9_Time_Space_Complexity;

import java.util.Arrays;

// finds all primes till N

public class SeiveOfEratosthenes {

	public static void main(String[] args) {
		seivePrime(25);
	}

	// O(log(logN)) Time | O(N) Space
	public static void seivePrime(int n) {
		boolean[] primes = new boolean[n + 1];

		Arrays.fill(primes, true);

		primes[0] = false;
		primes[1] = false;

		for (int i = 2; i * i <= n; i++) {
			if (primes[i]) {
				for (int mult = i; mult * i <= n; mult++) {
					primes[mult * i] = false;
				}
			}
		}

		for (int i = 0; i < primes.length; i++) {
			if (primes[i])
				System.out.print(i + " ");
		}
	}
}
