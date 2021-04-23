package section22_BitMasking;

public class ExtractBit {

	public static void main(String[] args) {

		int n = 22, ith = 5;

		System.out.println(extractIthBit(n, ith)); // 1
		System.out.println(extractIthBit(6, ith)); // 0

	}

	public static int extractIthBit(int n, int i) {
		// left shift mask number by 1 i-1 times
		int mask = 1;

		mask = mask << (i - 1);

		n = n & mask;

		// if n == 0, ith bit is 0, it it's 1 then ith bit is 1
		return n == 0 ? 0 : 1;
	}
}
