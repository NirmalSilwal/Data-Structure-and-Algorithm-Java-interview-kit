package codesignal;

public class Test1 {

	public static void main(String[] args) {
		
		// since from 0 to 10, there are {0,2,4,10} where there is presence of
		// either zero, two or four, so total it's 4.
		System.out.println(countOccurrances(10)); // 4

		System.out.println(countOccurrances(22)); // 11

	}

	// returns total number of zero, two and four in positive range till n
	static int countOccurrances(int n) {

		int countZeros = 0, countTwos = 0, countFours = 0;

		for (int i = 0; i <= n; i++) {

			if (i < 10) {
				if (i == 0)
					countZeros++;
				if (i == 2)
					countTwos++;
				if (i == 4)
					countFours++;
			}

			else if (i >= 10 && i < 1000) {
				int num = i;

				while (num != 0) {
					int rem = num % 10;

					if (rem == 0)
						countZeros++;
					if (rem == 2)
						countTwos++;
					if (rem == 4)
						countFours++;

					num /= 10;
				}
			}

			else if (i == 1000)
				countZeros += 3;
		}

		return countZeros + countTwos + countFours;
	}
}
