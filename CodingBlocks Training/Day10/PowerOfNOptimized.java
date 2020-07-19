package Lecture10;

// time complexity: O(log n)

public class PowerOfNOptimized {

	public static void main(String[] args) {

		int num = 2;
		int power = 5;

		System.out.println(powerBetter(num, power));
	}

	public static int powerBetter(int n, int pow) {
		if (pow == 0) {
			return 1;
		}
		
		int power_n_by2 = powerBetter(n, pow / 2);

		if (pow % 2 == 1) {
			return n * power_n_by2 * power_n_by2;
		} else {
			return power_n_by2 * power_n_by2;
		}

	}
}
