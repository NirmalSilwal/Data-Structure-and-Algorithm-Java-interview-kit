// Bit-Masking

package Lecture8;

public class PowerOf2Check {

	public static void main(String[] args) {

		int num = 1;
		System.out.println(checkPowerOf2(num));

		System.out.println(powerCheck2(num));
	}

	// 1st approach ~ inefficient one -> O(logn)
	public static boolean powerCheck2(int n) {
		if (n != 0 && n != 1){
			while (n > 1) {
				n = n / 2;
				// System.out.println(n);
			}
			if (n == 1) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	// 2nd approach ~ efficient solution -> O(1)
	public static boolean checkPowerOf2(int n) {
		if (n != 0 && n != 1) {
			if ((n & (n - 1)) == 0) {
				return true;
			}
		}
		return false;
	}

}
