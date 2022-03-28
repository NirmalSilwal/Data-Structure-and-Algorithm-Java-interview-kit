package LeetcodeBadge.ProgrammingSkills.Skills1.Day2;

public class NumberOf1Bits191 {

	public static int hammingWeight(int n) {
		int count = 0;

		int mask = 1;
		int shiftCount = 31;

		while (shiftCount >= 0) {

			if ((n & mask) != 0) // AND operation, 1 & 1 = 1 else 0
				count++;

			mask = mask << 1;

			shiftCount--;
		}

		return count;
	}

	public static void main(String[] args) {

		int n = 00000000000000000000000000001011;
		System.out.println(hammingWeight(n));
		System.out.println(hammingWeight(00000000000000000000000010000000));
	}
}
