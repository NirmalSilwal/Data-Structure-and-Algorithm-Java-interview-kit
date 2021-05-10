package easy;

// LC#190. Reverse Bits

public class ReverseBits190 {
	// you need treat n as an unsigned value
	public static int reverseBits(int n) {

		int result = 0;
		for (int i = 0; i < 32; i++) {
			result = result << 1;
			result = result | (n & 1);
			n = n >> 1;
		}

		return result;
	}

	public static void main(String[] args) {
		int n = 43261596;
		System.out.println(reverseBits(n));
	}
}

/*
 * Input: n = 00000010100101000001111010011100
 * 
 * Output: 964176192 (00111001011110000010100101000000)
 * 
 * Explanation: The input binary string 00000010100101000001111010011100
 * represents the unsigned integer 43261596, so return 964176192 which its
 * binary representation is 00111001011110000010100101000000.
 */