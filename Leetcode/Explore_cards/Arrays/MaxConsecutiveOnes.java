package Arrays;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 0, 1, 1, 1 };
		System.out.println(findMaxConsecutiveOnes(arr)); // 3
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int count = 0;

		for (int index = 0; index < nums.length; index++) {
			if (nums[index] == 1)
				count++;
			else
				count = 0;

			if (count > max)
				max = count;
		}

		return max;
	}
}
