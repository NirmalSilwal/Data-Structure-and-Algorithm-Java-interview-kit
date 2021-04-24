package section22_BitMasking;

public class MagicNumber {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
			System.out.println(magicNo(i));
		}
	}

	public static int magicNo(int index) {
		int pow = 1;
		int ans = 0;

		while (index != 0) {
			pow = pow * 5;

			// check for set bit
			if ((index & 1) != 0) {
				ans += pow;
			}

			index = index >> 1; // right shift index by 1
		}
		return ans;
	}
}
