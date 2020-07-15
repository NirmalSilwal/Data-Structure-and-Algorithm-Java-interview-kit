package Lecture8;

public class ExtractNthBit {

	public static void main(String[] args) {

		System.out.println(extract_nth_bit(8, 4)); // 1
		System.out.println(extract_nth_bit(8, 1)); // 0
		System.out.println(extract_nth_bit(5, 2)); // 0
		System.out.println(extract_nth_bit(5, 3)); // 1
		System.out.println(extract_nth_bit(16, 3)); // 0
		System.out.println(extract_nth_bit(3, 1)); // 1

	}

	public static int extract_nth_bit(int num, int position) {
		int mask = 1;
		mask = mask << (position - 1);

		if ((num & mask) == 0) {
			return 0;
		} else {
			return 1;
		}
	}
}
