package Arrays;

/*
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */

public class FindNumbersWithEvenNoDigits {

	public static void main(String[] args) {
		int[] arr = { 12, 345, 2, 6, 7896 };
		System.out.println(findNumbers(arr)); // 2

		int[] arr2 = { 555, 901, 482, 1771 };
		System.out.println(findNumbers(arr2)); // 1
	}

	public static int findNumbers(int[] nums) {
		if (nums.length < 1)
			return 0;
		int evenCount = 0;

		for (int number : nums) {
			int digitCount = 0;
			while (number != 0) {
				number = number / 10;
				digitCount++;
			}
			if (digitCount % 2 == 0)
				evenCount++;
		}
		return evenCount;
	}
}
