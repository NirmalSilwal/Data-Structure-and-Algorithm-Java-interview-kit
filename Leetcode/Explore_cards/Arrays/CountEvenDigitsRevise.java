package Arrays;

/*
Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
 */

public class CountEvenDigitsRevise {

	public static int findNumbers(int[] nums) {
		
		int count = 0;

		for (int n : nums) {
			boolean checkeven = checkEvenCount(n);

			if (checkeven == true)
				count++;
		}
		return count;
	}

	private static boolean checkEvenCount(int n) {
		int digitcount = 0;

		while (n > 0) {
			n /= 10;
			digitcount++;
		}
		return digitcount % 2 == 0 ? true : false;
	}

	public static void main(String[] args) {
		System.out.println(findNumbers(new int[] { 12, 345, 2, 6, 7896 }));
		System.out.println(findNumbers(new int[] { 555, 901, 482, 1771 }));
	}
}
