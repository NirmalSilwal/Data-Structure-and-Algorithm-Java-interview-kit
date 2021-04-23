package section22_BitMasking;

public class ResetBit {

	public static void main(String[] args) {
		System.out.println(resetIthBit(21, 3)); // 17
	}

	public static int resetIthBit(int n, int i) {

		int mask = 1;

		mask = ~(1 << (i - 1));

		n = n & mask;

		return n;
	}
}
