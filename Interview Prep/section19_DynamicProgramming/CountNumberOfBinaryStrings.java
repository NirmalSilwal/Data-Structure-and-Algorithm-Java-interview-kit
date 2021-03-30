package section19_DynamicProgramming;

/*
count no. of binary Strings of length N such that there are no consecutive 1's
present inside String
*/

public class CountNumberOfBinaryStrings {

	public static void main(String[] args) {

		int length = 3;
		System.out.println(countBinaryStr(length)); // 5
		
		System.out.println(countBinaryStr(1)); // 2
		System.out.println(countBinaryStr(2)); // 3
	}

	public static int countBinaryStr(int n) {
		// array of bits ending in zero
		int[] zeros = new int[n];
		// array of bits ending in one
		int[] ones = new int[n];

		// seed values
		// since no. of binary strings of length 1 ending in zero is 1
		zeros[0] = 1;
		// since no. of binary strings of length 1 ending in one is 1
		ones[0] = 1;

		for (int index = 1; index < zeros.length; index++) {
			zeros[index] = zeros[index - 1] + ones[index - 1];
			ones[index] = zeros[index - 1];
		}

		return zeros[n - 1] + ones[n - 1];
	}
}
