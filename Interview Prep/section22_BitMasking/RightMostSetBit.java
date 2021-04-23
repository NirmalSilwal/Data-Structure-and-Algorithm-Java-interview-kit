package section22_BitMasking;

public class RightMostSetBit {

	public static void main(String[] args) {

		System.out.println(positionRightMostSetBit(54)); // 2
		System.out.println(positionRightMostSetBit(5)); // 1
		System.out.println(positionRightMostSetBit(8)); // 4
		System.out.println(positionRightMostSetBit(0)); // -1

	}

	public static int positionRightMostSetBit(int n) {
		if (n < 1)
			return -1;

		// initial mask value
		int mask = 1;

		int pos = 1;

		int ans = n & mask;

		// keep updating mask, when ans becomes 1, that would be righmost
		// position
		while (ans == 0) {
			mask = mask << 1;
			ans = n & mask;
			pos++;
		}

		return pos;
	}
}
