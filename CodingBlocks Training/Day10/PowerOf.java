package Lecture10;

public class PowerOf {

	public static void main(String[] args) {

		int number = 2;
		int power = 5;

		System.out.println(powerOfNumber(number, power)); // 2^5 = 32
		System.out.println(powerOfNumber(2, 0)); // 1
	}

	public static int powerOfNumber(int num, int pow) {
		if (pow == 0) {
			return 1;
		} else {
			return num * powerOfNumber(num, pow - 1);
		}
	}
}
