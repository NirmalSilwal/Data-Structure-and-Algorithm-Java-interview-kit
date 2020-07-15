package Lecture8;

public class RightMostSetBit {

	public static void main(String[] args) {

		int num = 6;

		System.out.println(extract_right_most_set_Bit(num)); // 2

		System.out.println(extract_right_most_set_Bit(5)); // 1

		System.out.println(extract_right_most_set_Bit(16)); // 5

		System.out.println(extract_right_most_set_Bit(7)); // 1

		System.out.println(extract_right_most_set_Bit(3)); // 1

	}

	public static int extract_right_most_set_Bit(int num) {

		int position = 1;
		int mask = 1;

		while ((num & mask) == 0) {
			mask = mask << 1;
			position++;
		}

		return position;
	}
}

/*
 * Explanation: 6 is (110)in binary, here right most set bit is 1 in second
 * position
 */