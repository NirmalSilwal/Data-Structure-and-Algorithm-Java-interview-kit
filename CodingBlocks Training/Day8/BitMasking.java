package Lecture8;

public class BitMasking {

	public static void main(String[] args) {

		// AND
		System.out.println(2 & 1); // 0
		/*
		 * convert 2 and 1 in binary and do AND operation
		 */

		// OR
		System.out.println(2 | 3); // 3

		// XOR
		System.out.println(5 ^ 7); // 2

		int num = 16;

		// left shift operation
		int x = num << 3;

		System.out.println(x); // 128

		// for left shift by 3 bit here, as shortcut, you can multiply
		// num by 2^3

		// right shift operation
		x = num >> 2;
		System.out.println(x); // 4

		// for right shift by 3 bit here, as shortcut, you can divide
		// num by 2^2
	}
}
