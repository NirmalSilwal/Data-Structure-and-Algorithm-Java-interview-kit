package Lecture8;

// counts total no. of 1s in binary representation of given number
public class CountNBits {

	public static void main(String[] args) {

		int num = 1;

		System.out.println(count_n_bits(num)); // 1
		System.out.println(count_n_bits(10)); // 2
		System.out.println(count_n_bits(16)); // 1
		System.out.println(count_n_bits(5)); // 2
		System.out.println(count_n_bits(0)); // 0

	}

	public static int count_n_bits(int n) {
		int mask = 1;
		int count = 0;

		while (n != 0) {
			if ((n & mask) != 0) {
				count++;
			}

			n = n >> 1; // right shift by 1 bit
		}

		return count;
	}
}
