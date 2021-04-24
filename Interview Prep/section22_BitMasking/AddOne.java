package section22_BitMasking;

public class AddOne {

	public static void main(String[] args) {

		System.out.println(addOne(9));
		System.out.println(addOne(8));
		System.out.println(addOne(0));
		System.out.println(addOne(1));
	}

	public static int addOne(int n) {
		int mask = 1;

		// make all righmost ones to zeros, from righmost first zero
		while ((n & mask) != 0) {

			n = n ^ mask; // all rightmost zero becomes onem

			mask = mask << 1; // left shift mask by 1
		}

		// flip rightmost zero
		n = n ^ mask;
		
		return n;
	}
}
