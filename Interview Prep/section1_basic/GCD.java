package section1_basic;

public class GCD {

	public static void main(String[] args) {
		System.out.println(findGCD(36, 60));
		System.out.println(findGCD(12, 18));
		
		System.out.println(findGCD(60, 36));
		System.out.println(findGCD(18, 12));
	}

	static int findGCD(int divisor, int divident) {

		while (divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}

		return divisor;
	}
}
