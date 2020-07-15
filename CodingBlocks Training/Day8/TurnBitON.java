package Lecture8;

public class TurnBitON {

	public static void main(String[] args) {

		int num = 16;
		int position = 2;

		System.out.println(turn_on_bit(num, position)); // 18
		System.out.println(turn_on_bit(8, 1)); // 9
		System.out.println(turn_on_bit(5, 3)); // 5
		System.out.println(turn_on_bit(4,2)); // 6

	}

	public static int turn_on_bit(int num, int position) {
		int mask = 1;
		mask = mask << (position - 1);
		return num | mask;
	}
}
/*
 * Explanation: here binary of 16 is (10000), 2nd bit is 0 so turning it into 1
 * makes (10010) in binary, which is 18 in decimal. If it is already 1 in nth
 * bit, let it be 1, as it is already ON state
 */
