package section22_BitMasking;

public class SetIthBit {

	public static void main(String[] args) {

		System.out.println(setBit(21, 4)); // 29
		System.out.println(setBit(6, 5)); // 22
	}

	public static int setBit(int n, int ith) {
		int mask = 1;
		mask = mask << (ith - 1); // number to do OR operation with n

		n = n | mask;

		return n;
	}
}
