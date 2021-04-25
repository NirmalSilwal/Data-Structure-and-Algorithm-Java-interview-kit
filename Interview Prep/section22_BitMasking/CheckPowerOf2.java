package section22_BitMasking;

public class CheckPowerOf2 {

	public static void main(String[] args) {

		System.out.println(isPowerOfTwo(8));
		System.out.println(isPowerOfTwo(2));
		System.out.println(isPowerOfTwo(7));
		System.out.println(isPowerOfTwo(0));
		System.out.println(isPowerOfTwo(1));
		System.out.println(isPowerOfTwo(16));
	}

	public static boolean isPowerOfTwo(int num) {
		if (num == 0)
			return false;

		boolean result = false;

		// also set bit count in 2's power number is One
		if ((num & (num - 1)) == 0) {
			result = true;
		}

		return result;
	}
}
